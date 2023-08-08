package com.xworkz.diamond.app;

public class Drink implements CoolDrink,CokeCoolDrink,PepsiCoolDrink {

	@Override
	public void cool() {
		CokeCoolDrink.super.cool();
		PepsiCoolDrink.super.cool();
		
	}

}
