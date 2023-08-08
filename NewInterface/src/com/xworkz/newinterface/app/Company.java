package com.xworkz.newinterface.app;

public class Company implements CompanyRule{

	@Override
	public void getId() {
		System.out.println("invoking the Id");
		
	}

	@Override
	public void getLaptop() {
		System.out.println("invoking the Laptop");
		
	}

}
