package com.techfun.jdbc.repository;

import java.util.List;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;

public interface EmployeeRepository {
	void createEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(Employee employee);
	List<Employee> selectEmployee();
	void insertEmployeeAndRide(Employee employee,Ride ride);
	int countEmployee(Employee employee);
	Employee selectoneEmployee(int employeeId);
}

