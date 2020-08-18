package com.pcschool.ocp.finish.d06.case3.drink;

import com.pcschool.ocp.finish.d06.case3.meterial.Tea;

public class GreenTea extends Drink{
	public GreenTea() {
		addMeterial(new Tea("綠茶", 25));
	}
}
