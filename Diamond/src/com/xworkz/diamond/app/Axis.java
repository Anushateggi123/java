package com.xworkz.diamond.app;

public interface Axis extends RBI {
	default void message() {
		System.out.println("Welcome to Axis");
	}

}
