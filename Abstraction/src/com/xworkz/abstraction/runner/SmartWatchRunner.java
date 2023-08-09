package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.SmartWatch;
import com.xworkz.abstraction.implementation.FireBoltt;
import com.xworkz.abstraction.user.ViratKohli;

public class SmartWatchRunner {
	public static void main(String[] args) {
		System.out.println("invoking main method in smart watch runner");
		SmartWatch smartWatch = new FireBoltt();
		ViratKohli virat = new ViratKohli(smartWatch);
		virat.showTime();
		
	}

}
