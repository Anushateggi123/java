package com.xworkz.diamond.app;

public interface SBI extends RBI {
	default void message() {
		System.out.println("Welcome to SBI");
	}

}
