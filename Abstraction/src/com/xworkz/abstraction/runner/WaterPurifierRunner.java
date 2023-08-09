package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.WaterPurifier;
import com.xworkz.abstraction.implementation.KentWater;
import com.xworkz.abstraction.user.HemaMalini;


public class WaterPurifierRunner {

	public static void main(String[] args) {
		System.out.println("invoking main method in water purifier runner");
		WaterPurifier purifier = new KentWater();
		HemaMalini hemaMalini = new HemaMalini(purifier);
		hemaMalini.purifyWater();
		
		

	}

}
