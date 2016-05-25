package org.bildit.model.bo;

import org.bildit.model.dto.User;

public interface UserBo {

	public boolean createUser(User user);
	
	public User readUser(String username, String password);
}
