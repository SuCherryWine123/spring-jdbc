package com.techfun.jdbc.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.RideRepositoryImpl;
import com.techfun.jdbc.service.RideService;
import com.techfun.jdbc.service.RideServiceImpl;

public class Main {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		RideService rideservice = appContext.getBean("rideService", RideService.class);
//		testCreateRide(rideservice);
//		 testUpdateRide(rideservice);
		 testDeleteRide(rideservice);
	}

	private static void testCreateRide(RideService rideservice) {
		Ride ride = new Ride();
		ride.setName("David");
		ride.setDuration(20);
		rideservice.createRide(ride);
		System.out.println("successfully inserted");
	}

	private static void testUpdateRide(RideService rideservice) {
		Ride ride = new Ride();
		ride.setName("Su Su");
		ride.setId(1);
		rideservice.updateRide(ride);
		System.out.println("successfully updated");
	}

	private static void testDeleteRide(RideService rideservice) {
		Ride ride = new Ride();
		ride.setName("David");
		rideservice.deleteRide(ride);
		System.out.println("successfully deleted");
	}

}
