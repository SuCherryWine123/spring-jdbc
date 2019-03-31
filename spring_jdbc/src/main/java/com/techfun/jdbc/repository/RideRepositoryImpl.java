package com.techfun.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.jdbc.model.Employee;
import com.techfun.jdbc.model.Ride;
import com.techfun.jdbc.util.RideRowMapper;

@Repository("rideRepository")
public class RideRepositoryImpl implements RideRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createRide(Ride ride) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into ride(name, duration) values (?,?)", ride.getName(), ride.getDuration());
		System.out.println("Test Transaction");
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
	
	public List<Ride> selectRide(){
		List<Ride> rides=jdbcTemplate.query("select * from ride",new RideRowMapper());
		return rides;
	}

	@Override
	public int count(Ride ride) {
		// TODO Auto-generated method stub
		String sql = "select count(*) from ride";
		return jdbcTemplate.queryForObject(sql,Integer.class);
	}

	@Override
	public Ride selectoneRide(int rideId) {
		// TODO Auto-generated method stub
		Ride rides = jdbcTemplate.queryForObject("select * from ride where id=?",new RideRowMapper(),rideId);
		return rides;
	}

}
