package com.pcschool.ocp.finish.d12_exception.case5;

import java.util.Optional;

public class LoginService {

	private static final LoginService SERVICE = new LoginService();
	
	private LoginService() {
	}
	
	public boolean login(String username, String password) throws LoginException {
		// 判斷是否有此人
		Optional<User> optUser = UserDB.getInstance().getUser(username);

		if (!optUser.isPresent())
			throw new LoginException("帳號不存在"); // 帳號不存在

		User user = optUser.get();

		if (user.getPassword().equals(password))
			return true; // 帳號存在, 密碼正確

		throw new LoginException("密碼錯誤"); // 密碼錯誤
	}

	public static LoginService getService() {
		return SERVICE;
	}
}
