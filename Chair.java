public class Chair{
	int numberOfStudents;
	float weigth;
	int numberOfFloors;
	float temperature;
	char giveVowel;
	
	public Chair()
	{
		System.out.println("chair constructor");
		System.out.println(numberOfStudents);
		System.out.println(weigth);
		System.out.println(numberOfFloors);
		System.out.println(temperature);
		System.out.println(giveVowel);
		
	}
	
	
	public Chair(int numberOfStudents1 , float weigth1,int numberOfFloors1,float temperature1,char giveVowel1)
	{
		System.out.println("parametrised constructor");
		numberOfStudents = numberOfStudents1;
		weigth=weigth1;
		numberOfFloors=numberOfFloors1;
		temperature=temperature1;
		giveVowel=giveVowel1;
		
	}
	
	public static void main(String[] args)
	{
		new Chair();
		System.out.println("constructor");
		Chair chair = new Chair(7 , 7.5f , 5 , 8.0f , 'A');
		System.out.println(chair.numberOfStudents);
		System.out.println(chair.weigth);
		System.out.println(chair.numberOfFloors);
		System.out.println(chair.temperature);
		System.out.println(chair.giveVowel);
	}
}