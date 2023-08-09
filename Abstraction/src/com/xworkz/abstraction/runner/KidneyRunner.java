package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Kidney;
import com.xworkz.abstraction.implementation.HumanKidney;
import com.xworkz.abstraction.user.Bhagya;

public class KidneyRunner {
	Kidney kidney = new HumanKidney();
	Bhagya bhagya = new Bhagya(kidney);
	bhagya.clean();
	System.out.println("invoking clean");

}
