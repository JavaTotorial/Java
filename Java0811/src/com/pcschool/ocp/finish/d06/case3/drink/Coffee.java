package com.pcschool.ocp.finish.d06.case3.drink;

import com.pcschool.ocp.finish.d06.case3.meterial.Bean;
import com.pcschool.ocp.finish.d06.case3.meterial.Milk;

public class Coffee extends Drink {
	public Coffee() {
		addMeterial(new Bean(), new Milk());
	}
}
