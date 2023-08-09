package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.PrintingMachine;
import com.xworkz.abstraction.implementation.LG;
import com.xworkz.abstraction.user.Shambhavi;

public class PrintingMachineRunner {
	public static void main(String[] args) {
		System.out.println("invoking main method in printing machine runner");
		PrintingMachine machine = new LG();
		Shambhavi sham = new Shambhavi(machine);
		sham.print();
		
	}

}
