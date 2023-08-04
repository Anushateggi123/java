package com.xworkz.headset.app;


public class HeadSetRunner {
	public static void main(String[] args) {
		HeadSet headset = new HeadSet();
		System.out.println(headset);
		headset.setPrice(300);
		headset.setBrand("oneplus");
		headset.setColor("red");
		headset.setIsWireless(true);
		headset.setVolume(10);
		
		System.out.println(headset);
		
		}
	

}
	