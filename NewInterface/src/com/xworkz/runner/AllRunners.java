package com.xworkz.runner;

import com.xworkz.newinterface.app.AirportRule;
import com.xworkz.newinterface.app.Airport;
import com.xworkz.newinterface.app.Army;
import com.xworkz.newinterface.app.ArmyRule;
import com.xworkz.newinterface.app.Bank;
import com.xworkz.newinterface.app.BankRule;
import com.xworkz.newinterface.app.Company;
import com.xworkz.newinterface.app.CompanyRule;
import com.xworkz.newinterface.app.Hospital;
import com.xworkz.newinterface.app.HospitalRule;
import com.xworkz.newinterface.app.Hostel;
import com.xworkz.newinterface.app.HostelRule;
import com.xworkz.newinterface.app.Metro;
import com.xworkz.newinterface.app.MetroRule;
import com.xworkz.newinterface.app.Pub;
import com.xworkz.newinterface.app.PubRule;
import com.xworkz.newinterface.app.Saloon;
import com.xworkz.newinterface.app.SaloonRule;
import com.xworkz.newinterface.app.Temple;
import com.xworkz.newinterface.app.TempleRule;
import com.xworkz.newinterface.app.Vtu;
import com.xworkz.newinterface.app.VtuRule;

public class AllRunners {
	public static void main(String[] args) {
		ArmyRule army = new Army();
		army.getDiscipline();
		army.getUniforms();
		System.out.println("rules:"+army.everyone_should_talk);
	
	
		SaloonRule saloon = new Saloon();
		saloon.getCutting();
		saloon.getDescent();
		System.out.println("rules:"+saloon.fees);
		
		HostelRule hostel = new Hostel();
		hostel.getEating();
		hostel.getWashing();
		System.out.println("rules:"+hostel.cost);
		
		HospitalRule hospital = new Hospital();
		hospital.getCheckup();
		hospital.getSilent();
		System.out.println("rules:"+hospital.type);
		
		TempleRule temple = new Temple();
		temple.getBlessing();
		temple.getSilent();
		System.out.println("rules:"+temple.type);
		
		MetroRule metro = new Metro();
		metro.getSpeed();
		metro.getTravel();
		System.out.println("rules:"+metro.type);
		
		AirportRule airport = new Airport();
		airport.getPassport();
		airport.getTicket();
		System.out.println("rules:"+airport.price);
		
		BankRule bank = new Bank();
		bank.getLoan();
		bank.getSafety();
		System.out.println("rules:"+bank.keepingOrnaments);
		
		VtuRule vtu = new Vtu();
		vtu.getPlacement();
		vtu.getUsn();
		System.out.println("rules:"+vtu.Vtu_allow_through_cet);
		
		PubRule pub = new Pub();
		pub.getDance();
		pub.getDrinks();
		System.out.println("rules:"+pub.age);
		
		CompanyRule company = new Company();
		company.getId();
		company.getLaptop();
		System.out.println("rules:"+company.Proper_dress_up);
		
		
		
		
		
		
	}

}
