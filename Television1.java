//class and objects

public class Television1{
//states
static String brand;
static String screenSize;
static String resolution;
static String operatingSystem;
static String screenType;
static String speakers;
static boolean isSmartTv;
static String design;
static String model;
static String colour;
static String wattage;
static String modelYear;
static float weight;
static String powerConsumption;
static int usbPorts;
static boolean isBluetooth;
static String panel;
static int numberOfSpeakers;
static boolean remoteIncluded;
static String controlMethod;

public Television1(String brand,String screenSize,String resolution,String operatingSystem,String screeTtype,String speakers,boolean isSmartTv,String design,String model,String colour,String wattage,String modelYear,float weight,String powerConsumption,int usbPorts,boolean isBluetooth,String panel,int numberOfSpeakers,boolean remoteIncluded,String controlMethod){

this.brand=brand;
this.screenSize=screenSize;
this.resolution=resolution;
this.operatingSystem=operatingSystem;
this.screenType=screenType;
this.speakers=speakers;
this.isSmartTv=isSmartTv;
this.design=design;
this.model=model;
this.colour=colour;
this.wattage=wattage;
this.modelYear=modelYear;
this.weight=weight;
this.powerConsumption=powerConsumption;
this.usbPorts=usbPorts;
this.isBluetooth=isBluetooth;
this.panel=panel;
this.numberOfSpeakers=numberOfSpeakers;
this.remoteIncluded=remoteIncluded;
this.controlMethod=controlMethod;

}
//Behaviour
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
public static void videos(){
}
public static void videoGames(){
}
public static void information(){
}
public static void education(){
}
public static void weather(){
}

public static void main(String[] args){
Television1 television1 = new Television1("Samsung","32s","1920*1080px","TizenTV","QLED","DolbyDigital",true,"NeoQled","Samsung","Black","157s","2012s",3.5f,"82.96kwh",10,false,"LED",2,true,"controll");

System.out.println(Television1.brand);
System.out.println(Television1.screenSize);
System.out.println(Television1.resolution);
System.out.println(Television1.operatingSystem);
System.out.println(Television1.screenType);
System.out.println(Television1.isSmartTv);
System.out.println(Television1.design);
System.out.println(Television1.model);
System.out.println(Television1.colour);
System.out.println(Television1.wattage);
System.out.println(Television1.modelYear);
System.out.println(Television1.weight);
System.out.println(Television1.powerConsumption);
System.out.println(Television1.usbPorts);
System.out.println(Television1.isBluetooth);
System.out.println(Television1.panel);
System.out.println(Television1.numberOfSpeakers);
System.out.println(Television1.remoteIncluded);
System.out.println(Television1.controlMethod);
}
}