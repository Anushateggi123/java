package com.xworkz.abstraction.implementation;

import com.xworkz.abstraction.app.PrintingMachine;

public class LG implements PrintingMachine {

	@Override
	public void print() {
		System.out.println("invoking the print in printing machine");
		return;
	}

}
