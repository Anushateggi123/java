public class Mobile{
   static String brandName;
   static String batteryCapacity;
   static int price;
   static String os;
   static int ram;
   static String display;
   static String resolution;
   static String modelNumber;
   static String internalStorage;
   static String rearCamera;
   static String warranty;
   static String networkType;
   static String simType;
   static String processor;
   static boolean isExpandableStorage;
   static boolean isAudioJack;
   static boolean isQuickCharging;
   static String inTheBox;
   static String color;
   static String modelName;
   
   public Mobile(String brandName,String batteryCapacity,int price,String os,int ram,String display,String resolution,String modelNumber,
   String internalStorage,String rearCamera,String warranty,String networkType,String simType,String processor,boolean isExpandableStorage,
   boolean isAudioJack,boolean isQuickCharging,String inTheBox,String color,String modelName){
	   this.brandName=brandName;
	   this.batteryCapacity=batteryCapacity;
	   this.price=price;
	   this.os=os;
	   this.ram=ram;
	   this.display=display;
	   this.resolution=resolution;
	   this.modelNumber=modelNumber;
	   this.internalStorage=internalStorage;
	   this.rearCamera=rearCamera;
	   this.warranty=warranty;
	   this.networkType=networkType;
	   this.simType=simType;
	   this.processor=processor;
	   this.isExpandableStorage=isExpandableStorage;
	   this.isAudioJack=isAudioJack;
	   this.isQuickCharging=isQuickCharging;
	   this.inTheBox=inTheBox;
	   this.color=color;
	   this.modelName=modelName;
	}
	public static void call(){
	}
	public static void message(){
	}
	public static void vedioCall(){
	}
	public static void consumeElectricity(){
	}
	public static void mails(){
	}
	public static void wifiConnectivity(){
	}
	public static void bluetoothConnectivity(){
	}
	public static void location(){
	}
	public static void payment(){
	}
	public static void onlineOrders(){
	}
	public static void main(String[] args){
			Mobile mobile = new Mobile("one plus","4500mAh",27972,"Android 13",8,"17.02 cm","2400*1080 pixels","CPH2401N","128 GB","50MP","12 months","5G","dual","octa core",false,false,false,
			"mobile,adapter,phonecase,sim,usb cable","gray shadow","Nord 2T 5G");
			System.out.println(Mobile.brandName);
			System.out.println(Mobile.batteryCapacity);
			System.out.println(Mobile.price);
			System.out.println(Mobile.os);
			System.out.println(Mobile.ram);
			System.out.println(Mobile.display);
			System.out.println(Mobile.resolution);
			System.out.println(Mobile.modelNumber);
			System.out.println(Mobile.internalStorage);
			System.out.println(Mobile.rearCamera);
			System.out.println(Mobile.warranty);
			System.out.println(Mobile.networkType);
			System.out.println(Mobile.simType);
			System.out.println(Mobile.processor);
			System.out.println(Mobile.isExpandableStorage);
			System.out.println(Mobile.isAudioJack);
			System.out.println(Mobile.inTheBox);
			System.out.println(Mobile.color);
			System.out.println(Mobile.isQuickCharging);
			
	}

	
}