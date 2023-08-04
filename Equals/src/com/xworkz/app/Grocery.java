package com.xworkz.app;

public class Grocery {
	private int price;
	private String type;
	public Grocery(int price, String type) {
		this.price = price;
		this.type = type;
		System.out.println("invoking int , string constructor in grocery" );
	}
	public Grocery() {
		System.out.println("invoking no arg constructor in grocery");
	}
	@Override
	public String toString() {
		return " price " + this.price + " type " + this.type;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in grocery");
		if(obj!=null) {
			System.out.println("arg is not null , can compare");
			if(obj instanceof Grocery) {
				Grocery casted = (Grocery)obj;
				Grocery same.casted(this.price=casted.price && this.type=casted.price);
				System.out.println("both are same");
			}else {
				System.err.println("both are not same");
			}
		}else {
			System.err.println("arg is null , cannot compare");
		}
	}
	

}
