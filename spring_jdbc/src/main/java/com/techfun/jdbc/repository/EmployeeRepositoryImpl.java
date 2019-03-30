package com.techfun.jdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.jdbc.model.Employee;

@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into employee(name, age, address) values (?, ?, ?)", employee.getName(),
				employee.getAge(), employee.getAddress());

	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update employee set age=? where name= ?", employee.getAge(), employee.getName());
	}

	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from employee where id=?", employee.getId());
	}
}
