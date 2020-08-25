package com.pcschool.ocp.finish.d12_exception.case5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserDB {

	private static final UserDB USER_INSTANCE = new UserDB();
	private List<User> users;
	
	private UserDB() {
		users = Arrays.asList(new User("John", "1234"), new User("Mary", "5678"));
	}

	public List<User> getUsers() {
		return users;
	}
	
	public Optional<User> getUser(String username) {
		return users.stream().filter(user -> user.getUsername().equals(username)).findFirst();
	}
	
	public static UserDB getInstance() {
		return USER_INSTANCE;
	}
}
