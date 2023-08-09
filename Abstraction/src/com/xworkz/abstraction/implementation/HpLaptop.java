package com.xworkz.abstraction.implementation;

import com.xworkz.abstraction.app.Laptop;

public class HpLaptop implements Laptop {
	@Override
	public Boolean display() {
		System.out.println("invoking the HPlaptop");		
		return true;
	}

}
