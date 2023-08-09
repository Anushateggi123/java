package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Laptop;
import com.xworkz.abstraction.implementation.HpLaptop;
import com.xworkz.abstraction.user.Rahul;

public class LaptopRunner {
	public static void main(String [] args) {
		
		System.out.println("invoking main method in laptop runner");
		Laptop laptop = new HpLaptop ();
		Rahul rahul = new Rahul(laptop);
		rahul.Disply();
		System.out.println("invoking Display");
	}

}
