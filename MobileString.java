public class MobileString{
	public static void main(String[] args){
		String brandName="one plus";//literals
		String batteryCapacity="4500mAh";
		String os="Android 13";
		String display="17.02 cm";
		String resolution="2400*1080 pixels";
		String modelNumber="CPH2401N";
		String internalStorage="128 GB";
		String rearCamera="50MP";
		String warranty="12 months";
		String networkType="5G";
		String simType=new String("dual");//new keyword
		String processor=new String("octa core");
		String inTheBox=new String("mobile,adapter,phonecase,sim,usb cable");
		String color=new String("gray shadow");
		String modelName=new String("Nord 2T 5G");
		String supportedNetworks=new String("5G");
		String memoryCardSlotType=new String("dedicated slot");
		String browseType=new String("smartphones");
		String touchScreen=new String("yes");
		String primaryClockSpeed=new String("2.4GHz");
		boolean result=brandName.contains("abc");//using methods
		System.out.println(result);
		String resultValue=display.format("cm");
		System.out.println(resultValue);
		int resultedValue=networkType.lastIndexOf("4G");
		System.out.println(resultedValue);
		int resulted=modelName.compareTo("Nord 2T 5G");
		System.out.println(resulted);
		String returnValue=warranty.valueOf("12 months");
		System.out.println(returnValue);
   
	}
}