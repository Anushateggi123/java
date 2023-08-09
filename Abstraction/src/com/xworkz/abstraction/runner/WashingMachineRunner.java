package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.WashingMachine;
import com.xworkz.abstraction.implementation.Samsung;
import com.xworkz.abstraction.user.ArjunKapoor;

public class WashingMachineRunner {
	public static void main(String [] args) {
		System.out.println("invoking main method in  runner");
		WashingMachine machine = new Samsung();
		ArjunKapoor ak = new ArjunKapoor(machine);
		ak.wash();
		System.out.println("invoking washing");
		

}


}
