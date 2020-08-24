package com.pcschool.ocp.d12_exception.case5;

public class LoginException extends Exception {
	private static final long serialVersionUID = -8338467531043195553L;
	
	public LoginException(String message) {
		super(message);
	}
	
	public void how2do() {
		System.out.println("請重新登入！");
	}
}
