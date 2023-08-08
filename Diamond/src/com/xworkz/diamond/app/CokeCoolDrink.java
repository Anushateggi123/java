package com.xworkz.diamond.app;

public interface CokeCoolDrink extends CoolDrink {
	default public void cool() {
		System.out.println("invoking the cool");
	}

}
