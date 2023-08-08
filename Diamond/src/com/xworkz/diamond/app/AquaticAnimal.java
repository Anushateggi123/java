package com.xworkz.diamond.app;

public interface AquaticAnimal extends Animal {
	default public void livesIn() {
		System.out.println("lives on water");
	}	

}
