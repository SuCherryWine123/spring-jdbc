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
//		testCreateEmployeeAndRide(employeeservice);
//		count(employeeservice);
		selectoneEmployee(employeeservice);
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
	
	private static void count(EmployeeService employeeservice) {
		Employee employee = new Employee();
		int counting = employeeservice.countEmployee(employee);
		System.out.println("counting table rows:" + counting);
	}
	
	private static void selectoneEmployee(EmployeeService employeeservice) {
		Employee employee = new Employee();
		employee.setId(20);
		Employee selectemp = employeeservice.select(employee);
		System.out.println("select one employee Name: " + selectemp.getName());
		System.out.println("select one employe Age: " + selectemp.getAge());
		System.out.println("select one employe Address: " + selectemp.getAddress());
	}

}
