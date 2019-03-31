package com.techfun1.jdbc.repository;

import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.techfun1.jdbc.model.Role;
import com.techfun1.jdbc.model.Staff;

@Repository("staffRepository")
public class StaffRepositoryImpl implements StaffRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createStaff(Staff staff,Role role) {
		// TODO Auto-generated method stub
		final String sql = "insert into Staff(staff_name,age,position) values (?,?,?)";
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(
			connection ->{
				PreparedStatement ps = connection.prepareStatement(sql, new String[]{"staff_id"});
				ps.setString(1,staff.getStaffName());
				ps.setInt(2, staff.getAge());
                ps.setString(3, staff.getPosition());
                ps.setString(4, role.getRoleName());
                return ps;
			},keyHolder);
		Number staffId = keyHolder.getKey();
		System.out.println("Staff generated Id: " + staffId);
		jdbcTemplate.update("insert into role(staff_id,role_name) values (?, ?)", role.getStaffId(),role.getRoleName(),staffId);
	}
}
