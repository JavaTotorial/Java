package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.meterial.Milk;
import com.pcschool.ocp.d06.case3.meterial.Tea;

public class MilkTea extends Drink {
	public MilkTea() {
		addMeterial(new Milk(), new Tea());
	}
}
