package com.techfun1.jdbc.repository;

import com.techfun1.jdbc.model.Role;
import com.techfun1.jdbc.model.Staff;

public interface StaffRepository {
	void createStaff(Staff staff,Role role);
}
