package com.pcschool.ocp.finish.d01;

public class ArrayTest2 {
	public static void main(String[] args) {
		// 股票獲利
		double[] stocks = { 7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5 };
		// 債券獲利
		double[] bounds = { 6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2 };

		
		Invest stock = new Invest("股票", stocks);
		Invest bound = new Invest("債券", bounds);

		System.out.printf("%s的平均: %.2f\n", stock.getName(), stock.getAvg());
		System.out.printf("%s的平均: %.2f\n", bound.getName(), bound.getAvg());
		
		System.out.printf("%s的CV: %.2f\n", stock.getName(), stock.getCv());
		System.out.printf("%s的CV: %.2f\n", bound.getName(), bound.getCv());
		
		System.out.printf("CV值較低的是: %s\n", stock.getCv() < bound.getCv() ? stock.getName() : bound.getName());
	}
}

class Invest {
	private String name;
	private double cv;
	private double avg;
	private double[] profit;
	
	public Invest(String name, double[] profit) {
		this.name = name;
		this.profit = profit;
		setAvg();
		setCv();
	}
	
	private void setAvg() {
		int sum = 0;
		for(int i = 0;i < profit.length;i++){
			sum += profit[i];
		}
		avg = sum / profit.length;
	}
	
	private void setCv() {
		double cv = 0;
		for(int i = 0;i < profit.length;i++) {
			cv += Math.pow(profit[i]-avg, 2);
		}
		this.cv = Math.sqrt(cv/profit.length);
	}

	public String getName() {
		return name;
	}

	public double getCv() {
		return cv;
	}

	public double getAvg() {
		return avg;
	}

	public double[] getProfit() {
		return profit;
	}
}