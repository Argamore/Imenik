package org.bildit.model.bo;

import java.sql.SQLException;

import org.bildit.model.dao.UserDao;
import org.bildit.model.dao.UserDaoImp;
import org.bildit.model.dto.User;

public class UserBoImp implements UserBo {

	UserDao dao = new UserDaoImp();

	@Override
	public boolean createUser(User user) {

		if (HelperBo.isValidUser(user)) {

			try {

				if (dao.create(user)) {
					return true;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 

		return false;
	}

	@Override
	public User readUser(String username, String password) {

		User user = null;

		if (HelperBo.isValidPassword(password) && HelperBo.isValidUsername(username)) {
			try {

				user = dao.read(username);

				if (!user.getPassword().equals(password)) {
					user = null;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return user;
	}

}
