package Person;

import java.util.LinkedList;

public class MakePeople {

	// this string is returned if you look for a person who is not in the peopleList list
	String notFound = "Could not find who you were looking for; try checking your spelling.";


	LinkedList<Person> peopleList = new LinkedList<Person>();
	public Object addPerson;

	// This method works through the peopleList and creates temporary objects so that we never overwrite an object in the list
	public void tick()
	{
		for(int i = 0; i < peopleList.size(); i++) {
			Person tempObject = peopleList.get(i);
			tempObject.tick();
		}
	}

	// add a person to the peopleList list
	public void addPerson(Person object)
	{
		this.peopleList.add(object);
	}

	// remove a person from the peopleList list
	public void removePerson(Person object)
	{
		this.peopleList.remove(object);
	}

	// return a specific person from the peopleList list
	public String returnPeople(int index)
	{
		return(peopleList.get(index).toString());
	}

	// returns a person that you search for in the GetSearch class
	public String returnPerson(String person)
	{
		for(int i = 0; i < peopleList.size(); i++)
		{
			// getSurname is a method defined in the Person class and return a persons last name
			// Compares the last name you typed in with the last name of each person in the peopleList list
			// if the last names are equal then return the person with the appropriate toString method
			if(person.equalsIgnoreCase(peopleList.get(i).getSurname())) 
			{
				return(peopleList.get(i).toString());
			}
		}
		// If the person looked for is not in the "peopleList" list; return the string "notFound" that is defined above
		return notFound;
	}





}
