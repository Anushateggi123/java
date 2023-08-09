package com.xworkz.abstraction.implementation;

import com.xworkz.abstraction.app.WaterPurifier;

public class KentWater implements WaterPurifier {

	@Override
	public boolean filter() {
		System.out.println("invoking the filter to purify");
		return true;
	}
	

}
