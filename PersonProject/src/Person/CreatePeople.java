package Person;

import java.util.Random;

public class CreatePeople
{
	String randGender = "";
	String[] names = {"John", "WILSON", "Mark", "Caleb", "David", "Cindy", "Amy", "Harley", "Joann", "Josie"};
	String[] surNames = {"Lang", "Frushour", "Jamerson", "Brown", "Davis", "Miller", "Jones", "Martin", "Nelson", "Murdock"};
	String[] gender = {"Male", "Female"};
	double[] teacherSalary = {20.10, 30.25, 50.75, 25.82, 27.69};
	double[] employeeSalary = {10.75, 15.67, 19.87, 13.54, 11.85};
	double[] gpaList = {1.5, 2.55, 3.75, 3.88, 4.0, 2.36, 2.31, 2.1, 1.98, 3.59};
	int[] grade = {9, 10, 11, 12};
	int[] parkingSpaces = new int[100];
	int[] idList = new int[50];
	
	public int[] createParkingSpaces() 
	{
		for(int i = 0; i < 100; i++) 
		{
			parkingSpaces[i] = i;
		}
		return parkingSpaces;
	}
	
	public int[] createIDList() 
	{
		for(int i = 0; i < 50; i++) 
		{
			idList[i] = i;
		}
		return idList;
	}
	
	
	
	Random rand = new Random();	
	int getName = rand.nextInt(10);
	int getSurname = rand.nextInt(10);
	int getSalary = rand.nextInt(9);
	int getGrade = rand.nextInt(4);
	int getGender = rand.nextInt(2);
	int getSpace = rand.nextInt(100);
	int getGpa = rand.nextInt(10);
	int getId = rand.nextInt(50);

	public String makeName() 
	{
		String name = names[getName];	
		return name;
	}

	public String makeLastName() 
	{
		String surname = surNames[getSurname];
		return surname;
	}
	
	public double getTeacherSalary() 
	{
		double pay = teacherSalary[getSalary];
		return pay;
	}
	
	public double getEmpSalary() 
	{
		double pay = employeeSalary[getSalary];
		return pay;
	}
	
	public int makeGrade() 
	{
		int stuGrade = grade[getGrade];
		return stuGrade;
	}
	
	public String makeGender() 
	{
		randGender = gender[getGender];
		return randGender;
	}
	
	
	public boolean ifMale() 
	{
		if(randGender.equals("Male")) 
		{
			return true;			
		}
		return false;
	}

	public int getParkingSpace() 
	{
		createParkingSpaces();
		return parkingSpaces[getSpace];
	}
	
	public int getID() 
	{
		createIDList();
		return idList[getId];
	}

	public double randGpa() 
	{
		return(gpaList[getGpa]); 
	}

}
