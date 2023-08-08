package com.xworkz.newinterface.app;

public class Airport implements AirportRule {

	@Override
	public void getPassport() {
		System.out.println("invoking the Passport");
		
		
	}

	@Override
	public void getTicket() {
		System.out.println("invoking the Ticket");
		
		
	}

}
