package Person;

/*
 *  This class will be our super class every other class that we create
 *  will extend this class. Variables that we define for everyone will come from
 *  this class such as: parking spaces, name, surname, gender, address, and school email
 */

abstract public class Person
{

    private int parkingSpace;
    protected String name;
    private String surname;
    private String gender; // This is subject to change
    private String address; // This could also be represented as an int
    private String email;
    private boolean isMale;


    
    public Person()
    {
        this.parkingSpace = 0;
        this.name = "null";
        this.surname = "null";
        this.gender = "null";
        this.address = "null";
        this.email = "null@wcps.k12.md.us";
    }


    public Person(int parkingSpaceIn, String nameIn, String surnameIn,
                  String genderIn, String addressIn, boolean isMaleIn)
    {
        this.parkingSpace = parkingSpaceIn;
        this.name = nameIn;
        this.surname = surnameIn;
        this.gender = genderIn;
        this.address = addressIn;
        this.isMale = isMaleIn;
    }

    public Person(String nameIn, String surnameIn) 
    {
    	this.name = nameIn;
    	this.surname = surnameIn; 
    }


    public String toString()
    {
        return("Name: "+this.name+" "+this.surname+", Parking space: "+this.parkingSpace+", Gender: "+this.gender+
               ", Address: " +this.address+", \nE-Mail: "+MakeEmail.makeEmail(name, surname));
    }


    // ParkingSpace getter and setter
    public int getParkingSpace()
    {
        return this.parkingSpace;
    }

    public void setParkingSpace(int parkingSpaceIn)
    {
        this.parkingSpace = parkingSpaceIn;
    }

    // Name getter and setter
    public String getName()
    {
        return this.name;
    }

    public void setName(String nameIn)
    {
        this.name = nameIn;
    }

    // Surname getter and setter
    public String getSurname()
    {
        return this.surname;
    }

    public void setSurname(String surnameIn)
    {
        this.surname = surnameIn;
    }

    // Gender getter and setter
    public String getGender() // Could become a boolean
    {
        return this.gender;
    }

    public void setGender(String genderIn) // Could become a boolean
    {
        this.gender = genderIn;
    }

    // Address getter and setter
    public String getAddress() // May become an int
    {
        return this.address;
    }

    public void setAddress(String addressIn) // may become an Int
    {
        this.address = addressIn;
    }

    // Email getter and setter
    public String getEmail()
    {
        return this.email;
    }

    // isMale getter and setter
    public boolean getIsMale() 
    {
    	return (this.isMale);
    }
    public void setIsMale(boolean isMaleIn) 
    {
    	this.isMale = isMaleIn;
    }
   

	public void tick() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract String greeting();
    
        
}
