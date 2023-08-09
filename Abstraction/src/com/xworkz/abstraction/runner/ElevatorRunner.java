package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Elevator;
import com.xworkz.abstraction.implementation.Omega;
import com.xworkz.abstraction.user.Anusha;

public class ElevatorRunner {
	public static void main(String[] args) {
		System.out.println("invoking main method in elevator runner");
		Elevator elevator = new Omega();
		Anusha anu = new Anusha(elevator);
		anu.carryPeople();
	}

}
