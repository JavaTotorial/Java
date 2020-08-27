package com.pcschool.ocp.d12_exception.case5;

public class Client {
	public static void main(String[] args) {
		accessLogin();
	}

	public static void accessLogin() {
		String username = "John";
		String password = "1234";
		
		try {
			boolean check = LoginService.getService().login(username, password);
			System.out.println(check);
		} catch (LoginException e) {
			System.err.println(e.getMessage());
			e.how2do();
		}
	}
}
