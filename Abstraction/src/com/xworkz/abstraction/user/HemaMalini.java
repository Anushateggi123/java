package com.xworkz.abstraction.user;

import com.xworkz.abstraction.app.WaterPurifier;

public  class HemaMalini  {
	private WaterPurifier purifier;
	public HemaMalini(WaterPurifier purifier) {
		this.purifier = purifier;
	}
	public void purifyWater() {
		if(purifier!=null) {
			System.out.println("purifier working, can purify");
			this.purifier.filter();
			
		}else {
			System.err.println("purifier is not working");
		}
	}

}
