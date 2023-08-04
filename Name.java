//Array

public class Name{
	public static void main(String[] args){
	int[] noOfStudents = {1,2,3,4,5};
	byte[] noOfFloors = {(byte)1,(byte)2,(byte)3};
	short[] noOfDustbins = {(short)1,(short)2,(short)3};
	double[] temperature = {2.4d , 3.6d , 5.8d};
	System.out.println(noOfStudents);
	System.out.println(noOfFloors);
	System.out.println(noOfDustbins);
	System.out.println(temperature);
	float[] weight = new float[3];
	weight[0] = 1;
	weight[1] = 2;
	weight[2] = 3;
	long[] accNo = new long[2];
	accNo[0] = 123456L;
	accNo[1] = 23456L;
	char[] giveVowel = new char[5];
	giveVowel[0] = 'a';
	giveVowel[1] = 'e';
	giveVowel[2] = 'i';
	giveVowel[3] = 'o';
	giveVowel[4] = 'u';
	for(int i=0;i<weight.length;i++){
		System.out.println(weight[i]);
	}
	for(int i=0;i<accNo.length;i++){
		System.out.println(accNo[i]);
	}
	for(int i=0;i<giveVowel.length;i++){
		System.out.println(giveVowel[i]);
	}
	
	
	
	}
}