package com.pcschool.ocp.d03.foodshop;

public class Set {
	private int leg;
	private int breast;
	private int wings;
	private int cola;
	
	public Set(int leg, int breast, int wings, int cola) {
		if(leg > Leg.getAmount()) {
			System.out.printf("雞腿庫存只剩 %d 個了\n", Leg.getAmount());
			this.leg = Leg.getAmount();
		}else {
			this.leg = leg;
		}
		if(breast > Breast.getAmount()) {
			System.out.printf("雞胸庫存只剩 %d 個了\n", Breast.getAmount());
			this.breast = Breast.getAmount();
		}else {
			this.breast = breast;
		}
		if(wings > Wings.getAmount()) {
			System.out.printf("雞翅庫存只剩 %d 個了\n", Wings.getAmount());
			this.wings = Wings.getAmount();
		}else {
			this.wings = wings;
		}
		if(cola > Cola.getAmount()) {
			System.out.printf("可樂庫存只剩 %d 個了\n", Cola.getAmount());
			this.cola = Cola.getAmount();
		}else {
			this.cola = cola;
		}
	}

	
	public Leg[] getLeg() {
		Leg[] legs = new Leg[leg];
		for(int i = 0;i < leg;i++)
			legs[i] = new Leg();
		return legs;
	}
	

	public Breast[] getBreast() {
		Breast[] breasts = new Breast[breast];
		for(int i = 0;i < breast;i++)
			breasts[i] = new Breast();
		return breasts;
	}
	

	public Wings[] getWings() {
		Wings[] wings = new Wings[this.wings];
		for(int i = 0;i < this.wings;i++)
			wings[i] = new Wings();
		return wings;
	}
	

	public Cola[] getCola() {
		Cola[] colas = new Cola[cola];
		for(int i = 0;i < cola;i++)
			colas[i] = new Cola();
		return colas;
	}

}
