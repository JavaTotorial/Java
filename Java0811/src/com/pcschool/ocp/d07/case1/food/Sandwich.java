package com.pcschool.ocp.d07.case1.food;

import com.pcschool.ocp.d07.case1.material.Egg;
import com.pcschool.ocp.d07.case1.material.Ham;

public class Sandwich extends Food {
	public Sandwich(String name) {
		super(name);
		addMeterials(new Ham(), new Egg());
	}
}
 
