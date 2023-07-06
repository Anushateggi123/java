public class School{
	static String name;
	static String principleName;
	static String locationOfSchool;
	static String countryOfSchool;
	static String stateOfSchool;
	int noOfStudents;
	int noOfFaculties;
	int classRooms;
	int rollNo;
	int noOfComputers;
	public static void main(String[] args){
		School school=new School(60,10,10,06,15);
			System.out.println(school.noOfStudents);
		School school1=new School(70,20,20,07,25);
			System.out.println(school1.noOfFaculties);
		School school2=new School(80,30,30,10,35);
			System.out.println(school2.classRooms);
		School school3=new School(90,40,40,10,45);
			System.out.println(school3.rollNo);
		School school4=new School(10,05,06,15,05);
			System.out.println(school4.noOfComputers);
		
		}
		public School(int noOfStudents,int noOfFaculties,int classRooms,int rollNo,int noOfComputers){
			this.noOfStudents=noOfStudents;
			this.noOfFaculties=noOfFaculties;
			this.classRooms=classRooms;
			this.rollNo=rollNo;
			this.noOfComputers=noOfComputers;
			
		}
}