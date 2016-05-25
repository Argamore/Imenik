package org.bildit.model.bo;

import java.sql.SQLException;

import org.bildit.model.dao.UserDaoImp;
import org.bildit.model.dto.Contact;
import org.bildit.model.dto.User;

public class HelperBo {

	private static UserDaoImp dao = new UserDaoImp();

	public static boolean isUserNotNull(User user) {
		if (user == null) {
			return false;
		}
		return true;
	}

	public static boolean isValidPassword(String password) {
		if ((password.length() < 6) || (password.trim() == "")) {
			return false;
		}
		return true;
	}

	public static boolean isValidUsername(String username) {
		if ((username.length() < 2) || (username.trim() == "")) {
			return false;
		}
		return true;
	}

	public static boolean isValidUser(User user) {
		if (isUserNotNull(user) && isValidPassword(user.getPassword()) && isValidUsername(user.getUsername())) {
			try {
				if (!dao.userExists(user.getUsername())) {
					return true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;
	}

	public static boolean isContactNotNull(Contact contact) {
		if (contact == null) {
			return false;
		}
		return true;
	}

	public static boolean isValidContact(Contact contact) {

		if ((contact.getName().trim() != "") && (contact.getLastname().trim() != "")
				&& (contact.getEmail().trim() != "") && (contact.getPhone().trim() != "")) {
			
			return true;
		}

		return false;
	}

	public static boolean isValidId(int userId) {

		if (userId > 0) {
			return true;
		}

		return false;
	}
}