//static block

public class Runner{
	public static void main(String[] args){
		Television television = new Television();
		
	    television.brand="Samsung";
		System.out.println(television.brand);
		television.screenSize="32s";
		System.out.println(television.screenSize);
		television.resolution="1920*1080px";
		System.out.println(television.resolution);
		television.operatingSystem="TizenTV";
		System.out.println(television.operatingSystem);
		television.screenType="QLED";
		System.out.println(television.screenType);
		television.weight=4.6f;
		System.out.println(television.weight);
		television.powerConsumption="82.96kwh";
		System.out.println(television.powerConsumption);
		television.usbPorts=12;
		System.out.println(television.usbPorts);
		television.isBluetooth=false;
		System.out.println(television.isBluetooth);
		television.panel="LED";
		System.out.println(television.panel);
		Television television1=new Television("sony","35s","1234*1070px");
		Television television2=new Television("LG","36s","1254*1070px");
		Television television3=new Television("Onida","37s","1234*1060px");
		Television television4=new Television("LED","38s","1234*4070px");
		Television television5=new Television("Redmi","39s","1657*1070px");
	}
}

class Television{
		
		
	static String brand;
    String screenSize;
	String resolution;
    String operatingSystem;
	String screenType;
	float weight;
	String powerConsumption;
	int usbPorts;
	boolean isBluetooth;
	String panel;
	public static void consumeElectricity(){
	}
	public static void entertainment(){
	}
	public static void toWatch(){
		
	}
	public static void socialNews(){
	}
	public static void music(){
	}
	static{
		System.out.println("static block");
		brand="samsung";
	}
	public Television(String screenSize,String operatingSystem,String screenType,float weight){
		this.screenSize=screenSize;
		this.operatingSystem=operatingSystem;
		this.screenType=screenType;
		this.weight=weight;
	
	
	}