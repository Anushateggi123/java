package com.xworkz.newspaper.app;

public class NewspaperRunner {
	public static void main(String [] args) {
		Newspaper newspaper = new Newspaper ();
		System.out.println(newspaper);
		newspaper.setPrice(300);
		newspaper.setWeight(3.0f);
		newspaper.setLanguage("Kannada");
		newspaper.setName("Vijay Karnataka");
		
		System.out.println(newspaper);
	}

}
