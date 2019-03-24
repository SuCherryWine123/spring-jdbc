package com.techfun.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.jdbc.connectionhelper.ConnectionHelper;
import com.techfun.jdbc.model.Ride;

@Repository("rideRepository")
public class RideRepositoryImpl implements RideRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createRide(Ride ride) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into ride(name, duration) values (?,?)", ride.getName(), ride.getDuration());

	}

	@Override
	public void updateRide(Ride ride) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update ride set name=? where id = ?",ride.getName(), ride.getId());
	}

	@Override
	public void deleteRide(Ride ride) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from ride where name=?",ride.getName());

	}

}
