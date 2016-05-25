package org.bildit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bildit.model.dto.User;

public class UserDaoImp implements UserDao {

	// connect to the database
	Connection connection = ConnectionManager.getInstance().getConnection();

	@Override
	public boolean create(User user) throws SQLException {

		// create an SELECT SQL query
		String query = "INSERT INTO user(username, password) VALUES (?, ?)";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			// fill in the parameters
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());

			// execute the query
			statement.executeUpdate();
		}

		return true;
	}

	@Override
	public User read(String username) throws SQLException {

		User user = null;

		// create an SELECT SQL query
		String query = "SELECT * FROM user WHERE username = ?";

		// create a new ResultSet
		ResultSet rs = null;

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			// fill in the parameters
			statement.setString(1, username);

			// execute the query
			rs = statement.executeQuery();

			// set the cursor
			if (rs.next()) {

				// populate user
				user = new User();

				user.setId(rs.getInt("userId"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));

			}

		}

		// close the ResultSet
		rs.close();

		return user;
	}

	@Override
	public boolean userExists(String username) throws SQLException {

		// create an SELECT SQL query
		String query = "SELECT * FROM user WHERE username = ?";

		// create a new ResultSet
		ResultSet rs = null;

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			// fill in the parameters
			statement.setString(1, username);

			// execute the query
			rs = statement.executeQuery();

			// set the cursor
			if (rs.next()) {
				return true;
			}

			return false;
		}

	}
}