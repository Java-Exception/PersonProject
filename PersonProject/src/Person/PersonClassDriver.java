package Person;

public class PersonClassDriver extends GetSearch
{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GetSearch search = new GetSearch();
		MakePeople creator = new MakePeople();
		CreatePeople maker = new CreatePeople();
			
				
	    Student stuOne = new Student(1, 11, 3.75, 1, "Michael", "Suder", "Male", "Boonsboro Maryland", true);
	    Student stuTwo = new Student(2, 11, 3.75, 2, "Mark", "Frushour", "Male", "Boonsboro Maryland", true);
	    Student stuThree = new Student(3, 11, 3.75, 3, "Caleb","Lang", "Male", "Boonsboro Maryland", true);
	    Student stuFour = new Student(4, 12, 3.75, 4, "Akodd", "Alimov", "Male", "Boonsboro Maryland", true);
	    Teacher teacherOne = new Teacher(5, 1, 4, 50.01, "Justin", "Baker", "Male", "Computer Science", "BHS", true);
	    Employee empOne = new Employee(6, "Janitor", 15.75, 1, "Gerry", "Miller", "Male", "BHS", true);
	    Employee empTwo = new Employee(7, "Lunch lady", 10.75, 2, "Crystal", "Garrett", "Female", "BHS", false);
	    Student stuFive = new Student(maker.getParkingSpace(), maker.makeGrade(), maker.randGpa(), maker.getID(), maker.makeName(),
	    							  maker.makeLastName(), maker.makeGender(), "BHS", maker.ifMale());
	    
	    creator.addPerson(stuOne);
	    creator.addPerson(stuTwo);
	    creator.addPerson(stuThree);
	    creator.addPerson(stuFour);
	    creator.addPerson(teacherOne);
	    creator.addPerson(empOne);
	    creator.addPerson(empTwo);
	    creator.addPerson(stuFive);

	    System.out.println(creator.returnPerson(search.getSearch()));
	    //System.out.println(creator.returnPeople(4));
	    //System.out.println(teacherOne.greeting());
	   // System.out.println(creator.returnPeople(4));
	    


	}
}