package com.xworkz.abstraction.user;

import com.xworkz.abstraction.app.Laptop;

public  class Rahul  {
	private Laptop laptop;
	public Rahul(Laptop laptop) {
		this.laptop=laptop;
	}
	
	public void Disply() {
		
		if(laptop!= null) {
			System.out.println("laptop working, can disply...");
			this.laptop.display();
		}
		else {
			System.err.println("laptop is not working, cannot disply..");
		
		}		
	}

}
