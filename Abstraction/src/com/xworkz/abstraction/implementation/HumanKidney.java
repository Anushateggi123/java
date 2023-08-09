package com.xworkz.abstraction.implementation;

import com.xworkz.abstraction.app.Kidney;

public class HumanKidney implements Kidney {
	@Override
	public boolean clean() {
		System.out.println("invoking the HumanKidney");
		return true;
	}

}
