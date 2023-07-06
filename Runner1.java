public class Runner1{
	public static void main(String[] args){
		Television television = new Television("32s","Tizen","QLED",4.8f);
		System.out.println(television.screenSize);

	
		Television television1 = new Television("35s","Android","LED",5.4f);
		System.out.println(television1.screenSize);
		
		
		Television television2 = new Television("36s","Tizen","qLED",6.6f);
		System.out.println(television2.operatingSystem);
		
		
		Television television3 = new Television("37s","webOs","LED",3.3f);
		System.out.println(television3.screenType);
		
		
		Television television4 = new Television("38s","tvOs","QLED",4.4f);
		System.out.println(television4.weight);
	
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
		
		static{
		System.out.println("Static Block");
		brand="Samsung";
		}
		public static void toWatch(){
		String screenSize="32s";
		String operatingSystem="Android";
		String screenType="LED";
		float weight=4.8f;
		}
		
		public static void playVideo(){
		String screenSize="37s";
		String operatingSystem="webos";
		String screenType="LED";
		float weight=5.4f;
		}
		
		public static void playMusic(){
		String screenSize="38s";
		String operatingSystem="tvOs";
		String screenType="QLED";
		float weight=6.6f;
		}
		public static void entertainment(){
		String screenSize="39s";
		String operatingSystem="Os";
		String screenType="QLED";
		float weight=3.3f;
		}
		public static void social(){
		String screenSize="40s";
		String operatingSystem="tvOs";
		String screenType="QLED";
		float weight=4.4f;
		}
		
		public Television(String screenSize,String operatingSystem,String screenType,float weight){
		this.screenSize=screenSize;
		this.operatingSystem=operatingSystem;
		this.screenType=screenType;
		this.weight=weight;
		}
		}