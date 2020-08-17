package com.pcschool.ocp.d06.case3.meterial;

public class Pearl extends Meterial {

	private String size;

	public Pearl() {
		this("L");
	}
	
	public Pearl(String size) {
		setName("珍珠");
		setSize(size);
		setPrice();
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setPrice() {
		if (size.equalsIgnoreCase("L"))
			setPrice(40);
		else
			setPrice(20);
	}
}
