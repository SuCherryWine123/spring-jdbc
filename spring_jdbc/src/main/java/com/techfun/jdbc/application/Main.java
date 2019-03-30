package com.techfun.jdbc.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.repository.RideRepositoryImpl;
import com.techfun.jdbc.service.EmployeeService;
import com.techfun.jdbc.service.RideService;
import com.techfun.jdbc.service.RideServiceImpl;

public class Main {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		RideService rideservice = appContext.getBean("rideService", RideService.class);
		 testCreateRide(rideservice);
		// testUpdateRide(rideservice);
//		testDeleteRide(rideservice);
//		testSelectRide(rideservice);
		 
	}

	private static void testCreateRide(RideService rideservice) {
		Ride ride = new Ride();
		ride.setName("Mike");
		ride.setDuration(25);
		rideservice.createRide(ride);
		System.out.println("successfully inserted");
	}

	private static void testUpdateRide(RideService rideservice) {
		Ride ride = new Ride();
		ride.setName("Grace");
		ride.setId(8);
		rideservice.updateRide(ride);
		System.out.println("successfully updated");
	}

	private static void testDeleteRide(RideService rideservice) {
		Ride ride = new Ride();
		ride.setName("Su Su");
		rideservice.deleteRide(ride);
		System.out.println("successfully deleted");
	}
	
	private static void testSelectRide(RideService rideservice) {
		Ride ride = new Ride();
		List<Ride> rideList = rideservice.selectRide();
		for(Ride rd: rideList) {
			System.out.println("Ride Id: " + rd.getId());
			System.out.println("Ride Name: " + rd.getName());
			System.out.println("Ride Duration: " + rd.getDuration());
		}
		System.out.println("successfully seleceted");
	}
	
}
