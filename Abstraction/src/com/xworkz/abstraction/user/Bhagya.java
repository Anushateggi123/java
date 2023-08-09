package com.xworkz.abstraction.user;

import com.xworkz.abstraction.app.Kidney;

public class Bhagya {
	private Kidney kidney;
	public Bhagya (Kidney kidney) {
		this.kidney=kidney ;
	}
	public void clean() {
	
	if (kidney!=null) {
		 System.out.println("kidney is working, can clean...");
		 this.kidney.clean();
	 }
	 else {
		 System.out.println("kidney not working,can't clean...");
	 }
	}

}
