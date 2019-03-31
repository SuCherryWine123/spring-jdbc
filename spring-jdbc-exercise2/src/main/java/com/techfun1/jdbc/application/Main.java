package com.techfun1.jdbc.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun1.jdbc.model.Role;
import com.techfun1.jdbc.model.Staff;
import com.techfun1.jdbc.service.StaffService;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StaffService staffservice = appContext.getBean("staffService", StaffService.class);	
		
		testCreateStaff(staffservice);
	}
	
	private static void testCreateStaff(StaffService staffservice) {
		Staff staff = new Staff();
		Role role = new Role();
		staff.setStaffName("Su Su");
		staff.setAge(25);
		staff.setPosition("Junior PG");
		role.setRoleName("Role1");
		staffservice.createStaff(staff,role);
	}

}
