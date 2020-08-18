package com.pcschool.ocp.finish.d06.case3.drink;

import java.util.ArrayList;
import java.util.Arrays;

import com.pcschool.ocp.finish.d06.case3.meterial.Meterial;

public class Drink {

	private ArrayList<Meterial> meterials;
	private int price;
	
	public Drink() {
		meterials = new ArrayList<>();
	}
	
	public void addMeterial(Meterial... meterial) {
		Arrays.stream(meterial).forEach(m -> meterials.add(m));
	}

	public ArrayList<Meterial> getMeterials() {
		return meterials;
	}

	public int getPrice() {
		return meterials.stream().mapToInt(meterial -> meterial.getPrice()).sum();
	}
}
