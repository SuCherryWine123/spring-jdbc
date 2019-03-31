package com.techfun1.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun1.jdbc.model.Role;
import com.techfun1.jdbc.model.Staff;
import com.techfun1.jdbc.repository.StaffRepository;

@Service("staffService")
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	private StaffRepository staffRepository;

	public void createStaff(Staff staff, Role role) {
		// TODO Auto-generated method stub
		staffRepository.createStaff(staff, role);
	}

}
