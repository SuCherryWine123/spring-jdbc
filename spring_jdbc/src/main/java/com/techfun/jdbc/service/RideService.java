package com.techfun.jdbc.service;

import java.util.List;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;

public interface RideService {
	void createRide(Ride ride);
	void updateRide(Ride ride);
	void deleteRide(Ride ride);
	List<Ride> selectRide();
	void insertEmployeeAndRide(Employee employee,Ride ride);
	int count(Ride ride);
	Ride select(Ride ride);
}
