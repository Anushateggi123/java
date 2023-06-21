public class MethodClass{
	public static void main(String[] args){
	add();
	sub();
	mul();
	div();
	mod();
	}
public static void add(){
	int[] noOfFloors = {1,2,3,4,5};
	for(int i=0;i<noOfFloors.length;i++){
		System.out.println(noOfFloors[i]);
	}
}
public static void sub(){
	float[] fruitsWeigth = new float[5];
	fruitsWeigth[0] = 20.5f;
	fruitsWeigth[1] = 10.5f;
	fruitsWeigth[2] = 11.5f;
	fruitsWeigth[3] = 15.5f;
	fruitsWeigth[4] = 22.8f;
	for(int i=0;i<fruitsWeigth.length;i++){
		System.out.println(fruitsWeigth[i]);
		}
}
public static void mul(){
	float[] temperature = new float[5];
	temperature[0] = 32.8f;
	temperature[1] = 30.3f;
	temperature[2] = 33.5f;
	temperature[3] = 35.8f;
	temperature[4] = 31.2f;
	for(int i=0;i<temperature.length;i++){
	System.out.println(temperature[i]);
	}
}
public static void div(){
	int[] ramOfMobiles = new int[5];
	ramOfMobiles[0] = 8;
	ramOfMobiles[1] = 16;
	ramOfMobiles[2] = 24;
	ramOfMobiles[3] = 32;
	ramOfMobiles[4] = 64;
	for(int i=0;i<ramOfMobiles.length;i++){
		System.out.println(ramOfMobiles[i]);
	}
}
public static void mod(){
	char[] colorOfTree = new char[5];
	colorOfTree[0] = 'g';
	colorOfTree[1] = 'r';
	colorOfTree[2] = 'e';
	colorOfTree[3] = 'e';
	colorOfTree[4] = 'n';
	for(int i=0;i<colorOfTree.length;i++){
	System.out.println(colorOfTree);
	}
}
}


