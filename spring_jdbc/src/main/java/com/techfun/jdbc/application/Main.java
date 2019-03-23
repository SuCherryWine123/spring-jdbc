package com.techfun.jdbc.application;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.RideService;
import com.techfun.jdbc.service.RideServiceImpl;

public class Main {
	public static void main(String[] args) {
		testCreateRide();
	}
	
	private static void testCreateRide() {
		Ride ride = new Ride();
		ride.setName("Cherry");
		ride.setDuration(12);
		RideService rideservice = new RideServiceImpl();
		rideservice.createRide(ride);
		System.out.println("successfully inserted");
	}
}
