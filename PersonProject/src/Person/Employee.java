package Person;

public class Employee extends Person{
	
	// Instance variables that ONLY the employee class will have 
	private double pay;
	private int EID;
	private String job;
	private String name;
	
	
	public Employee(int parkingSpaceIn, String jobIn,
            double payIn, int EIDIn, String nameIn,
            String surnameIn, String genderIn,
            String addressIn, boolean isMaleIn) 
	{
		super(parkingSpaceIn, nameIn, surnameIn, genderIn, addressIn, isMaleIn);
		this.pay = payIn;
		this.EID = EIDIn;
		this.job = jobIn;
        this.name = super.name;

	}

	// Used to return the name of a specific person so that the program can make them an email
    public String returnName() 
    {
    	return (this.name);
    }
	
    // We made a toString method specific to the Employee class to add specific parameters that only employees will have
	public String toString()
	{
	     return(super.toString()+" Employee Job: "+this.job+", Employee Pay: "+this.pay+", \nEmployee ID: "+this.EID+"\n");
	}
	
	// each class has their own greeting called with this.greeting()
	public String greeting() 
	{
		return("Time to work!");
	}
 
	 
}
