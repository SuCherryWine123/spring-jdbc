package com.techfun.jdbc.application;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.EmployeeService;
import com.techfun.jdbc.service.RideService;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService employeeservice = appContext.getBean("employeeService", EmployeeService.class);
//		testCreateEmployee(employeeservice);
//		testUpdateEmployee(employeeservice);
//		testDeleteEmployee(employeeservice);
//		testSelectEmployee(employeeservice);
		testCreateEmployeeAndRide(employeeservice);
	}

	private static void testCreateEmployee(EmployeeService employeeservice) {
		Employee employee = new Employee();
		employee.setName("Mike");
		employee.setAge(20);
		employee.setAddress("London");
		employeeservice.createEmployee(employee);
		System.out.println("successfully inserted");
	}

	private static void testUpdateEmployee(EmployeeService employeeservice) {
		Employee employee = new Employee();
		employee.setName("June");
		employee.setAge(25);
//		employee.setId(3);
		employeeservice.updateEmployee(employee);
		System.out.println("successfully updated");
	}

	private static void testDeleteEmployee(EmployeeService employeeservice) {
		Employee employee = new Employee();
		employee.setName("Rose");
		employee.setId(2);
		employeeservice.deleteEmployee(employee);
		System.out.println("successfully deleted");
	}
	
	private static void testSelectEmployee(EmployeeService employeeservice) {
		Employee employee = new Employee();
		List<Employee> empList = employeeservice.selectEmployee();
		for(Employee emp: empList) {
			System.out.println("Employee Id: " + emp.getId());
			System.out.println("Employee Name: " + emp.getName());
			System.out.println("Employee Age: " + emp.getAge());
			System.out.println("Employee Address: " + emp.getAddress());
		}
		System.out.println("successfully seleceted");
	}
	
	private static void testCreateEmployeeAndRide(EmployeeService employeeservice) {
		Employee employee = new Employee();
		employee.setName("Mike1");
		employee.setAge(20);
		employee.setAddress("London");
		
		Ride ride = new Ride();
		ride.setName("Mike");
		ride.setDuration(25);
		
		employeeservice.insertEmployeeAndRide(employee, ride);
		System.out.println("successfully inserted");
	}


}
