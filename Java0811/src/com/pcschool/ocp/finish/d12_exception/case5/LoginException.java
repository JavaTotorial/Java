package com.pcschool.ocp.finish.d12_exception.case5;

public class LoginException extends Exception {
	
	private static final long serialVersionUID = 6497656457762146327L;

	public LoginException(String message) {
		super(message);
	}
	
	public void how2do() {
		System.out.println("請重新登入！");
	}
}
