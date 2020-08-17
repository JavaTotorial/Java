package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.meterial.Milk;
import com.pcschool.ocp.d06.case3.meterial.Pearl;
import com.pcschool.ocp.d06.case3.meterial.Tea;

public class PearlTea extends Drink {
	public PearlTea() {
		addMeterial(new Milk(), new Tea(), new Pearl());
	}
}
