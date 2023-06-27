public class Institute{
	public static void main(String[] args){
		int value = area(10);      //calling method with int value1
		System.out.println(value);       
		int area = area(10 , 20);  //calling method with int value1 , int value2
		System.out.println(area);
		int area1 = area(10 , (byte)30);  //calling method with int value1 , byte value2
		System.out.println(area1);
		int area2 = area((byte)10 , (byte)30);  //calling method with byte value1,byte value2
		System.out.println(area2);
		int area3 = area((short)10 , 4.8d);  //calling method with short value1,double value2
		System.out.println(area3);
		int area4 = area(3.5d , (short)30);  //calling method with double value1,short value2
		System.out.println(area4);
		float temperature = getTemperature(10,50);  //calling method with int n1, int n2
		System.out.println(temperature);
		float temperature1 = getTemperature(10,50,20);  //calling method with int n1, int n2, int n3
		System.out.println(temperature1);
		float temperature2 = getTemperature(10,5.0f);  //calling method with int n1, float n2
		System.out.println(temperature2);
		float temperature3 = getTemperature(1.0f,5.0f);  //calling method with float n1, float n2
		System.out.println(temperature3);
		float temperature4 = getTemperature((short)10,5.0d);  //calling method with short n1, double n2
		System.out.println(temperature4);
		float temperature5 = getTemperature(1.0d,(short)50);  //calling method with double n1, short n2
		System.out.println(temperature5);
		float result = getResult(3,4);  //calling method with int g1, int g2
		System.out.println(result);
		float result1 = getResult(3,4,6);  //calling method with int g1, int g2, int g3
		System.out.println(result1);
		float result2 = getResult(3,4.8f);  //calling method with int g1, float g2
		System.out.println(result2);
		float result3 = getResult(3.3f,4.4f);  //calling method with float g1, float g2
		System.out.println(result3);
		float result4 = getResult((short)3,4.76d);  //calling method with short g1, double g2
		System.out.println(result4);
		float result5 = getResult(3.78d,(short)4);  //calling method with double g1, short g2
		System.out.println(result5);
	}
	public static int area(int value1){
		return value1;
	}
	public static int area(int value1 , int value2){
		
		return value1*value2;
	}
	public static int area(int value1 , byte value2){
		return value1-value2;
	}
	public static int area(byte value1 , byte value2){
		return value1*value2;
	}
	public static int area(short value1 , double value2){
		return value1;
	}
	public static int area(double value1 , short value2){
		return value2;
	}
	public static float getTemperature(int n1 , int n2){
		
		return n1;
	}
	public static float getTemperature(int n1 , int n2 , int n3){
		return n1*n2;
	}
	public static float getTemperature(int n1 , float n2){
		return n1-n2;
	}
	public static float getTemperature(float n1 , float n2){
		return n1*n2;
	}
	public static float getTemperature(short n1 , double n2){
		return n1;
	}
	public static float getTemperature(double n1 , short n2){
		return n2;
	}
	public static float getResult(int g1 , int g2){
		return g1;
	}
	public static float getResult(int g1 , int g2 , int g3){
		return g1*g2;
	}
	public static float getResult(int g1 , float g2){
		return g1-g2;
	}
	public static float getResult(float g1 , float g2){
		return g1*g2;
	}
	public static float getResult(short g1 , double g2){
		return g1;
	}
	public static float getResult(double g1 , short g2){
		return g2;
	}
	}