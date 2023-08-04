package com.xworkz.chicken;

public class BroilerChicken extends FarmChicken {
	boolean alive;
	float weight;
	
	public BroilerChicken(int price, String location, int noOfDays, String careTaker, boolean alive, float weight) {
		super(price, location, noOfDays, careTaker);
		this.alive = alive;
		this.weight = weight;
	}

	void printinfo() {
		System.out.println("running printinfo in farmchicken...");
		super.printinfo();
		System.out.println(this.alive);
		System.out.println(this.weight);
	}
	
	

}
