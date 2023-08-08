package com.xworkz.diamond.app;

public interface PepsiCoolDrink extends CoolDrink {
	default public void cool() {
		System.out.println("invoking the cool");
	}


}
