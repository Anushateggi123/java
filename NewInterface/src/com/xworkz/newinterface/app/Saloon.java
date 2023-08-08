package com.xworkz.newinterface.app;

public class Saloon implements SaloonRule{

	@Override
	public void getCutting() {
		System.out.println("invoking the haircut");
		
	}

	@Override
	public void getDescent() {
		System.out.println("invoking the descent");
		
	}
	
}
