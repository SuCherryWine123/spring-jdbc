package com.techfun1.jdbc.service;

import com.techfun1.jdbc.model.Role;
import com.techfun1.jdbc.model.Staff;

public interface StaffService {
	void createStaff(Staff staff,Role role);
}
