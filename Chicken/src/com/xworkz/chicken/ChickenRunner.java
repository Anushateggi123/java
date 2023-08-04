package com.xworkz.chicken;

public class ChickenRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in ChickenRunner");
		Chicken chicken=new Chicken(400,"jayanagar");
		chicken.printinfo();
		FarmChicken farmchicken=new FarmChicken(400,"jayanagar",8,"farmer");
		BroilerChicken broilerchicken=new BroilerChicken(400,"jayanagar",8,"farmer",true,5.0f);
		broilerchicken.printinfo();
	}

}
