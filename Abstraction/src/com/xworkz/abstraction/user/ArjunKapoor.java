package com.xworkz.abstraction.user;

import com.xworkz.abstraction.app.WashingMachine;

public class ArjunKapoor {
	private WashingMachine washingmachine;
	public ArjunKapoor(WashingMachine washingmachine) {
		this.washingmachine = washingmachine;
	}
	
	public void wash() {
		
		if(washingmachine!= null) {
			System.out.println("washingmachine working, can wash...");
			this.washingmachine.wash();
		}
		else {
			System.err.println("washingmachine is not working, cannot wash..");
		
		}		
	}

}
