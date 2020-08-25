package com.pcschool.ocp.finish.d13_assertion;

public class Square {
	public int getArea(int x, int y, int h) {
		int area = (x + y) * h / 2;
		return area;
	}
	
	public int getTriangle(int x, int h) {
		int area = x * h / 2;
		return area;
	}
}
