package com.techfun1.jdbc.model;

public class Role {
	private Integer roleId;
	private Integer staffId;
	private String roleName;
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer role_id) {
		this.roleId = role_id;
	}
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staff_id) {
		this.staffId = staff_id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String role_name) {
		this.roleName = role_name;
	}
	
}
