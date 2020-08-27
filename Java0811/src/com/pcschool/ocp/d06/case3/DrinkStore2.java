package com.pcschool.ocp.d06.case3;

import java.util.ArrayList;

import com.pcschool.ocp.d06.case3.drink.Coffee;
import com.pcschool.ocp.d06.case3.drink.Drink;
import com.pcschool.ocp.d06.case3.drink.GreenPearlTea;
import com.pcschool.ocp.d06.case3.drink.GreenTea;
import com.pcschool.ocp.d06.case3.drink.MilkTea;
import com.pcschool.ocp.d06.case3.drink.PearlTea;
import com.pcschool.ocp.d06.case3.meterial.Milk;

public class DrinkStore2 {
	public static void main(String[] args) {
		ArrayList<Drink> drinks = initDrinks();

		// 1.總共花了 ? 元
		int sum_all = drinks.stream().mapToInt(Drink::getPrice).sum();
		System.out.printf("總共花了 %,d 元\n", sum_all);

		// 2.成分中有奶製品(Milk)的共有多少錢?
		int sum_milk = drinks.stream()
				.filter(drink -> drink.getMeterials().stream().filter(meterial -> meterial instanceof Milk).count() != 0)
//																											尋找			有值?
//				.filter(drink -> drink.getMeterials().stream().filter(meterial -> meterial instanceof Milk).findAny().isPresent())
				.mapToInt(Drink::getPrice).sum();
		System.out.printf("成分中有奶製品總共花了 %,d 元\n", sum_milk);
	}

	public static ArrayList<Drink> initDrinks() {
		ArrayList<Drink> drinks = new ArrayList<>();

		drinks.add(new Coffee());
		drinks.add(new GreenTea());
		drinks.add(new GreenTea());
		drinks.add(new GreenPearlTea());
		drinks.add(new GreenPearlTea());
		drinks.add(new GreenPearlTea());
		drinks.add(new MilkTea());
		drinks.add(new MilkTea());
		drinks.add(new MilkTea());
		drinks.add(new MilkTea());
		drinks.add(new PearlTea());
		drinks.add(new PearlTea());
		drinks.add(new PearlTea());
		drinks.add(new PearlTea());
		drinks.add(new PearlTea());

		return drinks;
	}
}
