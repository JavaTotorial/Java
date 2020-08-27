package com.pcschool.ocp.d09_InterfaceAndInner.case7;

@FunctionalInterface
public interface Calc<T> {
	void add(T t);
}
