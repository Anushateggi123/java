package com.xworkz.diamond.app;

public class Union implements RBI,SBI,Axis{

	@Override
	public void message() {
		
		Axis.super.message();
		SBI.super.message();
	}

}
