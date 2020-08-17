package com.pcschool.ocp.d06.case3.meterial;

public class Tea extends Meterial {
	
	public Tea() {
		this("阿薩姆", 15);
	}
	
	public Tea(String name, int price) {
		setName(name);
		setPrice(price);
	}
}
