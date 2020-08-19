package com.pcschool.ocp.d08;

public class Ball {
	private String color;
	private int price;

	public Ball(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return 7;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Ball))
			return false;
		Ball o = (Ball) obj;
		if (price == o.price & color.equals(o.color))
			return true;
		return false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + ", price=" + price + "]";
	}

}
