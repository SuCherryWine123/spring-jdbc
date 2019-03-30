package com.techfun.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.util.EmployeeRowMapper;

@Repository("employeeRepository")
@Transactional
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
	
	@Override
	public List<Employee> selectEmployee() {
		List<Employee> employees=jdbcTemplate.query("select * from employee",new EmployeeRowMapper());
		return employees;
	}
	
	@Override

	public void insertEmployeeAndRide(Employee employee,Ride ride) {
		jdbcTemplate.update("insert into employee(name, age, address) values (?, ?, ?)", employee.getName(),
				employee.getAge(), employee.getAddress());
		
		jdbcTemplate.update("insert into ride(name, duration) values (?,?)", ride.getName(), ride.getDuration());
	}
}
