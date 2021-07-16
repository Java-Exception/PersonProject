package Person;

public class Student extends Person
{
	private int grade; //grade may also be represented as a String
    private double gpa;
    private int SID;
    private String name;
    


    public Student(int parkingSpaceIn, int gradeIn,
                   double gpaIn, int SIDIn, String nameIn,
                   String surnameIn, String genderIn,
                   String addressIn, boolean isMaleIn)
    {
        super(parkingSpaceIn, nameIn, surnameIn, genderIn, addressIn, isMaleIn);
        this.grade = gradeIn;
        this.gpa = gpaIn;
        this.SID = SIDIn;
        this.name = super.name;
    }


    public String returnName() 
    {
    	return (this.name);
    }
    
    public String toString()
    {
        return(super.toString()+" Student grade: "+this.grade+", Student GPA: "+this.gpa+", Student ID: "+this.SID+"\n");
    }
    
	public String greeting() 
	{
		return("Hello there!");
	}
    
}
