package com.pcschool.ocp.finish.d10_ListAndSet.case7;

import java.util.Date;

public class Sales {

	private String region;
	private String country;
	private String itemType;
	private String salesChannel;
	private String orderPriority;
	private String orderDate;
	private int orderID;
	private String shipDate;
	private int unitsSold;
	private double unitPrice;
	private double unitCost;
	private double totalRevenue;
	private double totalCost;
	private double totalProfit;

	public String getRegion() {
		return region;
	}

	public String getCountry() {
		return country;
	}

	public String getItemType() {
		return itemType;
	}

	public String getSalesChannel() {
		return salesChannel;
	}

	public String getOrderPriority() {
		return orderPriority;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public int getOrderID() {
		return orderID;
	}

	public String getShipDate() {
		return shipDate;
	}

	public int getUnitsSold() {
		return unitsSold;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public double getUnitCost() {
		return unitCost;
	}

	public double getTotalRevenue() {
		return totalRevenue;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public double getTotalProfit() {
		return totalProfit;
	}
	
	
	// Setter====================================
	
	

	public void setRegion(String region) {
		this.region = region;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	public void setOrderPriority(String orderPriority) {
		this.orderPriority = orderPriority;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public void setUnitsSold(int unitsSold) {
		this.unitsSold = unitsSold;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public void setTotalProfit(double totalProfit) {
		this.totalProfit = totalProfit;
	}

	@Override
	public String toString() {
		return "Sales [region=" + region + ", country=" + country + ", itemType=" + itemType + ", salesChannel="
				+ salesChannel + ", orderPriority=" + orderPriority + ", orderDate=" + orderDate + ", orderID="
				+ orderID + ", shipDate=" + shipDate + ", unitsSold=" + unitsSold + ", unitPrice=" + unitPrice
				+ ", unitCost=" + unitCost + ", totalRevenue=" + totalRevenue + ", totalCost=" + totalCost
				+ ", totalProfit=" + totalProfit + "]";
	}

}