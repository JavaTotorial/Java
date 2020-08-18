package com.pcschool.ocp.d07.case1.food;

import com.pcschool.ocp.d07.case1.material.Beef;
import com.pcschool.ocp.d07.case1.material.Egg;

public class Hamburger extends Food {
	public Hamburger(String name) {
		super(name);
		addMeterials(new Beef(), new Egg());
	}
}
