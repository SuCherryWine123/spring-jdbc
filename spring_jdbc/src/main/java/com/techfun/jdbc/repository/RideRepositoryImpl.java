package com.techfun.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techfun.jdbc.connectionhelper.ConnectionHelper;
import com.techfun.jdbc.model.Ride;

public class RideRepositoryImpl implements RideRepository {

	@Override
	public void createRide(Ride ride) {
		// TODO Auto-generated method stub

		String insertTableSQL = "INSERT INTO Ride" + "(name, duration)VALUES" + "(?,?)";

		try (Connection dbConnection = ConnectionHelper.getDBConnection();
				PreparedStatement preparedStatement = dbConnection.prepareStatement(insertTableSQL)) {
			preparedStatement.setString(1, ride.getName());
			preparedStatement.setInt(2, ride.getDuration());
			preparedStatement.executeUpdate();
			System.out.println("Record is inserting into Ride table");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void updateRide(Ride ride) {
		// TODO Auto-generated method stub
		String updateTableSQL = "UPDATE Ride SET name = ?" + "WHERE id = ?";
		try (Connection dbConnection = ConnectionHelper.getDBConnection();
				PreparedStatement preparedStatement = dbConnection.prepareStatement(updateTableSQL)) {
			preparedStatement.setString(1, ride.getName());
			preparedStatement.setInt(2, ride.getId());
			preparedStatement.executeUpdate();
			System.out.println("Record is updating into Ride table");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void deleteRide(Ride ride) {
		// TODO Auto-generated method stub
		String deleteTableSQL = "DELETE FROM Ride WHERE name = ?";
		try (Connection dbConnection = ConnectionHelper.getDBConnection();
				PreparedStatement preparedStatement = dbConnection.prepareStatement(deleteTableSQL)) {
			preparedStatement.setString(1, ride.getName());
			preparedStatement.executeUpdate();
			System.out.println("Record is deleting into Ride table");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
