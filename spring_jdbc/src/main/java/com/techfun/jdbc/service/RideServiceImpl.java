package com.techfun.jdbc.service;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.RideRepository;
import com.techfun.jdbc.repository.RideRepositoryImpl;

public class RideServiceImpl implements RideService{

	@Override
	public void createRide(Ride ride) {
		// TODO Auto-generated method stub
		RideRepository riderepository = new RideRepositoryImpl();
		riderepository.createRide(ride);
	}
	
	public void updateRide(Ride ride) {
		RideRepository riderRepository = new RideRepositoryImpl();
		riderRepository.updateRide(ride);
	}
	
	public void deleteRide(Ride ride) {
		RideRepository riderRepository = new RideRepositoryImpl();
		riderRepository.deleteRide(ride);
	}
}
