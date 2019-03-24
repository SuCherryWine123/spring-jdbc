package com.techfun.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.RideRepository;
import com.techfun.jdbc.repository.RideRepositoryImpl;

@Service("rideService")
public class RideServiceImpl implements RideService {

	@Autowired
	private RideRepositoryImpl rideRepository;

	@Override
	public void createRide(Ride ride) {
		// TODO Auto-generated method stub
		rideRepository.createRide(ride);
	}

	public void updateRide(Ride ride) {
		rideRepository.updateRide(ride);
	}

	public void deleteRide(Ride ride) {
		rideRepository.deleteRide(ride);
	}
}
