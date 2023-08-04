package com.xworkz.dosa.app;

public class DosaRunner {
	public static void main(String[] args) {
		Dosa dosa = new Dosa();
		System.out.println(dosa);
		dosa.setPrice(60);
		dosa.setColor("red");
		dosa.setHotelName("CTR");
		dosa.setIsCrispy(true);
		dosa.setType("Open dosa");
		System.out.println(dosa);
		
		}

}
