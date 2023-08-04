public class Telephone1{
	public static void main(String[] args){
	boolean returnedResult = isPrimeNumber(13);
	int addedValue = add(10,20);
	System.out.println("added Value");
	boolean result = checkTheNo(-1);
	System.out.println("result");
	float multipledValue = mul(10f,20f);
	System.out.println("multipled Value");
	long number = turnOn(12345678L);
	boolean returnResult=marks(8.5f);
	System.out.println("return Result");
	boolean returnnumber=adharNumber(1254568L);
	System.out.println("return number");
	int returnProduct=mul(10,8);
	System.out.println("return Product");
	boolean returnedName=checkName("Anusha Teggi");
	System.out.println("returned Name");
	float returnGravity=gravity(2.3f,7.5f);
	System.out.println("return Gravity");
	}
	public static boolean isPrimeNumber(int number){
		if(num%2==0){
			System.out.println("No is prime number");
			return true;
		}
		else{
			System.out.println("No is not prime number");
			return false;
			}
	}
	public Static int add(int a , int b){
		int c= a+b;
		return c;
		}
	}
	public static boolean checkTheNo(int number){
		if(number>=0){
			return true;
		}
		else{
			return false;
		}
	}
	public static float mul(float a, float b){
		float c = a*b;
		if(c<100){
			return true;
		}
		else{
			return false;
		}
	}
	public static long turnOn(long accNo){
		if(accNo>0){
			System.out.println("accNo is greater than 0");
		}
		else{
			System.out.println("accNo is lesser than 0");
		}
	}
	public static boolean marks(float cgpa){
		if(cgpa>=8.9f){
			System.out.println("pass");
			return true;
		}
		else{
			System.out.println("fail");
			return false;
		}
	}
	public static boolean adharNumber(long number){
		if(number>=10){
			System.out.println("number is valid");
			return true;
		}
		else{
			System.out.println("number is invalid");
			return false;
		}
	}
	public static int mul(int d,int e){
		int f=d*e;
		if(f>=2){
			System.out.println("answer is valid");
			return true;
		}
		else{
			System.out.println("answer is not valid");
			return false;
		}
	}
	public static boolean checkName(String name){
		if(name.length()>=7){
			System.out.println("name is valid");
			return true;
		}
		else{
			System.out.println("name is not valid");
			return false;
		}
	}
	public static float gravity(float g1,float g2){
		if(g1 >=6.5f){
			System.out.println("gravity is high");
			return true;
		}
		else{
			System.out.println("gravity is low");
			return false;
		}
	}
}
	