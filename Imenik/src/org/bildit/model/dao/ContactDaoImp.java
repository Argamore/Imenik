package org.bildit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.bildit.model.dto.Contact;

public class ContactDaoImp implements ContactDao {

	// connect to the database
	Connection connection = ConnectionManager.getInstance().getConnection();

	@Override
	public boolean create(Contact contact, int userId) throws SQLException {

		// create an SELECT SQL query
		String query = "INSERT INTO contact(userId, name, lastname, email, phone) VALUES (?, ?, ?, ?, ?)";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			// fill in the parameters
			statement.setInt(1, userId);
			statement.setString(2, contact.getName());
			statement.setString(3, contact.getLastname());
			statement.setString(4, contact.getEmail());
			statement.setString(5, contact.getPhone());

			// execute the query
			statement.executeUpdate();
		}

		return true;
	}

	@Override
	public Contact read(int id) throws SQLException {

		Contact contact = null;

		// create an SELECT SQL query
		String query = "SELECT * FROM contact WHERE contactId = ?";

		// create a new ResultSet
		ResultSet rs = null;

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			// fill in the parameters
			statement.setInt(1, id);

			// execute the query
			rs = statement.executeQuery();

			// set the cursor
			if (rs.next()) {

				// populate contact
				contact = new Contact();

				contact.setContactId(rs.getInt("contactId"));
				contact.setUserId(rs.getInt("UserId"));
				contact.setName(rs.getString("name"));
				contact.setLastname(rs.getString("lastname"));
				contact.setEmail(rs.getString("email"));
				contact.setPhone(rs.getString("phone"));

			}

		}

		// close the ResultSet
		rs.close();

		return contact;
	}

	@Override
	public List<Contact> readAll(int userId) throws SQLException {

		List<Contact> contacts = new ArrayList<>();
		Contact contact = null;

		// Create an SQL query
		String query = "SELECT * FROM contact WHERE userId = ?";

		// Create a new ResultSet
		ResultSet rs = null;

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, userId);
			
			// execute the query
			rs = statement.executeQuery();

			// add contacts to the list
			while (rs.next()) {

				contact = new Contact();

				contact.setContactId(rs.getInt("contactId"));
				contact.setUserId(rs.getInt("UserId"));
				contact.setName(rs.getString("name"));
				contact.setLastname(rs.getString("lastname"));
				contact.setEmail(rs.getString("email"));
				contact.setPhone(rs.getString("phone"));

				contacts.add(contact);
			}
		}

		return contacts;
	}

	@Override
	public boolean update(Contact contact) throws SQLException {

		// create an SELECT SQL query
		String query = "UPDATE contact SET name = ?, lastname = ?, email = ?, phone = ? WHERE contactId = ?";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			// fill in the parameters
			statement.setString(1, contact.getName());
			statement.setString(2, contact.getLastname());
			statement.setString(3, contact.getEmail());
			statement.setString(4, contact.getPhone());
			statement.setInt(5, contact.getContactId());

			// execute the query
			statement.executeUpdate();
		}

		return true;
	}

	@Override
	public boolean delete(Contact contact) throws SQLException {

		// create an SELECT SQL query
		String query = "DELETE FROM contact WHERE contactId = ?";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			// fill in the placeholder
			statement.setInt(1, contact.getContactId());

			// execute the query
			statement.executeUpdate();
		}

		return true;
	}

	@Override
	public List<Contact> search(String name, int userId) throws SQLException {

		List<Contact> contacts = new ArrayList<>();
		Contact contact = null;

		// create an SQL query
		String query = "SELECT * FROM contact WHERE name = ? AND userId = ?";

		// Create a new ResultSet
		ResultSet rs = null;

		try (PreparedStatement statement = connection.prepareStatement(query);) {

			// fill in the parameter
			statement.setString(1, name);
			statement.setInt(2, userId);

			// execute the query
			rs = statement.executeQuery();

			while (rs.next()) {

				contact = new Contact();

				contact.setContactId(rs.getInt("contactId"));
				contact.setUserId(rs.getInt("UserId"));
				contact.setName(rs.getString("name"));
				contact.setLastname(rs.getString("lastname"));
				contact.setEmail(rs.getString("email"));
				contact.setPhone(rs.getString("phone"));

				contacts.add(contact);
			}
		}

		return contacts;

	}
}