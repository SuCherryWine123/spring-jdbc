package com.techfun.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.EmployeeRepository;
import com.techfun.jdbc.repository.RideRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	private RideRepository rideRepository;
	
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.createEmployee(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeRepository.updateEmployee(employee);
	}

	public void deleteEmployee(Employee employee) {
		employeeRepository.deleteEmployee(employee);
	}

	@Override
	public List<Employee> selectEmployee() {
		return employeeRepository.selectEmployee();
	}
	
	public void insertEmployeeAndRide(Employee employee,Ride ride) {
		employeeRepository.insertEmployeeAndRide(employee,ride);
	}

	@Override
	public int countEmployee(Employee employee) {
		return employeeRepository.countEmployee(employee);
	}

	@Override
	public Employee select(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.selectoneEmployee(20);
	}
}
