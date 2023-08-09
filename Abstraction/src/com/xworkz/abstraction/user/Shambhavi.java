package com.xworkz.abstraction.user;

import com.xworkz.abstraction.app.PrintingMachine;

public  class Shambhavi  {
	private PrintingMachine machine;
	public Shambhavi(PrintingMachine machine) {
		this.machine = machine;
	}
	public void print(){
		Object print = null;
		if(print!=null) {
			System.out.println("machine is working, can print");
			this.machine.print();
			}else {
				System.err.println("machine not working");
			}
		
		
	}

}
