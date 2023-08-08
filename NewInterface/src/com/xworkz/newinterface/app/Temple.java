package com.xworkz.newinterface.app;

public class Temple implements TempleRule {

	@Override
	public void getBlessing() {
		System.out.println("invoking the blessings of ganesh");
		
	}

	@Override
	public void getSilent() {
		System.out.println("invoking the silent in temple");
		
	}

}
