public class WashingMachine1{
	public static void main(String args[]){
	char returnedValue = giveVowel();
	System.out.println("returned value");
	int addedValue = add();
	System.out.println("added value");
	boolean numberedValue = checkTheNo();
	System.out.println("numbered value");
	long numberValue = accNo();
	System.out.println("number value");
	float temperatureValue = temperature();
	System.out.println("temperature Value");
	double weightedValue = weight();
	System.out.println("weighted Value");
	String brandValue = washingMachineBrand();
	System.out.println("brand valuealue");
	int[] returnValue = methodReturningArray();
	System.out.println("return value");
	}
	public static char giveVowel(){
		System.out.println("method started");
		return 'a';
	}
	public static int add(){
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	
	public static boolean checkTheNo(){
		int number=-1;
		if(number>=0){
			return true;
		}
		else{
			return false;
		}
	}
	public static long accNo(){
		Long accNo = 12345678L;
		return accNo;
	}
	public static float temperature(){
		System.out.println("temperature");
		return 32.7f;
	}
	public static double weight(){
			double weight = 1.1234e234d;
			return weight;
	}
	public static String washingMachineBrand(){
			System.out.println("brand");
			return "Samsung";
	}
	public static int[] methodReturningArray(){
		int[] sample = {1,2,3,4,5};
		return sample;
	}
}












