package com.xworkz.abstraction.user;

import com.xworkz.abstraction.app.Elevator;

public  class Anusha  {
	private Elevator elevator;
	 public Anusha(Elevator elevator) {
		 this.elevator=elevator;
	 }
	 public void carryPeople() {
		 if (elevator!=null) {
		 System.out.println("elevator working, can carry luggage...");
		 this.elevator.carryLuggage();
	 }
	 else {
		 System.out.println("elevator not working,can't carry luggage...");
	 }

}
}
