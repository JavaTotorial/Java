package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.meterial.Milk;

public class MilkTea extends BlackTea {
	public MilkTea() {
		addMeterial(new Milk());
	}
}
