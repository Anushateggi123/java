package com.xworkz.newinterface.app;

public class Bank implements BankRule {

	@Override
	public void getLoan() {

		System.out.println("invoking the loan");
		
	}

	@Override
	public void getSafety() {
		System.out.println("invoking the safety");
		
	}

}
