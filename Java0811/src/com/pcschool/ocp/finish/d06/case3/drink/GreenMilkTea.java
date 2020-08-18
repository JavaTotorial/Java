package com.pcschool.ocp.finish.d06.case3.drink;

import com.pcschool.ocp.finish.d06.case3.meterial.Milk;

public class GreenMilkTea extends GreenTea {
	public GreenMilkTea() {
		addMeterial(new Milk());
	}
}
