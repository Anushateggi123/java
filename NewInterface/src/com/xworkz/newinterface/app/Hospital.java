package com.xworkz.newinterface.app;

public class Hospital implements HospitalRule {

	@Override
	public void getCheckup() {
		System.out.println("invoking the checkup");
		
		
	}

	@Override
	public void getSilent() {
		System.out.println("invoking the silent in hospital");
		
	}

}
