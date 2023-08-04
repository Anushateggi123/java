//get method and enum

public class Speaker{
	String name;
	String power;
	int bluetoothVersion;
	String batteryLife;
	boolean isWireless;
	SpeakerColor color = SpeakerColor.BLACK;
	NumberOfSpeakers speakers=NumberOfSpeakers.ONE;
	public Speaker(String name,String power,int bluetoothVersion,String batteryLife,boolean isWireless){
		this.name=name;
		this.power=power;
		this.bluetoothVersion=bluetoothVersion;
		this.batteryLife=batteryLife;
		this.isWireless=isWireless;
	}
	public static void main(String[] args){
		Speaker speaker = new Speaker("MZ","10W",3,"5hr",true);
		System.out.println(speaker.name);
		System.out.println(speaker.power);
		System.out.println(speaker.bluetoothVersion);
		System.out.println(speaker.batteryLife);
		System.out.println(speaker.isWireless);
		System.out.println(speaker.color.getValue());
		System.out.println(speaker.speakers.getValue());
	}
	public String getName(){
		return name;
	}
	public String getPower(){
		return power;
	}
	public int getBluetoothVersion(){
		return bluetoothVersion;
	}
	public String getBatteryLife(){
		return batteryLife;
	}
	public boolean getIsWireless(){
		return isWireless;
	}
}
enum SpeakerColor{
	BLACK("black"),WHITE("white"),GREY("grey");
	String value;
	SpeakerColor(String value){
		this.value=value;
	}
	public String getValue(){
		return value;
	}
}
enum NumberOfSpeakers{
	ONE(1),TWO(2),THREE(3);
	int value;
	NumberOfSpeakers(int value){
		this.value=value;
	}
	public int getValue(){
		return value;
	}
	
}