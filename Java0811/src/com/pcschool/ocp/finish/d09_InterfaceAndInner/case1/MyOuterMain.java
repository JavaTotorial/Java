package com.pcschool.ocp.finish.d09_InterfaceAndInner.case1;

public class MyOuterMain {
	public static void main(String[] args) {
		MyOuter.MyInner mi = new MyOuter().new MyInner();
		mi.print();
		System.out.println("===================");

		MyOuter.MyStaticInner msi = new MyOuter.MyStaticInner();
		msi.print();
	}
}
