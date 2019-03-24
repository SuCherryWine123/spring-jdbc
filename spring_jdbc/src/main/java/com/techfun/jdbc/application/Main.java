package com.techfun.jdbc.application;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.service.RideService;
import com.techfun.jdbc.service.RideServiceImpl;

public class Main {
	public static void main(String[] args) {
		// testCreateRide();
		 testUpdateRide();
//		testDeleteRide();
	}

	private static void testCreateRide() {
		Ride ride = new Ride();
		ride.setName("Cherry");
		ride.setDuration(12);
		ride.setName("Wyne");
		ride.setDuration(13);
		ride.setName("Su");
		ride.setId(4);
		RideService rideservice = new RideServiceImpl();
		rideservice.createRide(ride);
		System.out.println("successfully inserted");
	}

	private static void testUpdateRide() {
		Ride ride = new Ride();
		ride.setName("Cherry");
		ride.setId(4);
		RideService rideservice = new RideServiceImpl();
		rideservice.updateRide(ride);
		System.out.println("successfully updated");
	}

	private static void testDeleteRide() {
		Ride ride = new Ride();
		ride.setName("David");
		RideService rideservice = new RideServiceImpl();
		rideservice.deleteRide(ride);
		System.out.println("successfully deleted");
	}

}
