package Person;

public class Teacher extends Person
{

	private int TID;
	private int classSize;
	private String subject;
	private double teacherPay;
	private String name;
	protected boolean isGood;
	
	public Teacher(int parkingSpaceIn, int TIDIn,
				   int classSizeIn, double teacherPayIn,
				   String nameIn, String surnameIn,
		           String genderIn, String subjectIn,
		           String addressIn, boolean isMaleIn) 
	{
		super(parkingSpaceIn, nameIn, surnameIn, genderIn, addressIn, isMaleIn);
        this.TID = TIDIn;
        this.subject = subjectIn;
        this.classSize = classSizeIn;
        this.teacherPay = teacherPayIn;
        this.name = super.name;

        
	}
	
	
    public String returnName() 
    {
    	return (this.name);
    }
	
    
	public String toString()
	{
	 
		
	return(super.toString()+" Teacher pay: "+this.teacherPay+" Teacher subject: "+this.subject+", Teacher class size: "+this.classSize+", \nTeacher ID: "+this.TID+"\n");
		
	//	else 
	//	{
	//		return(super.toString()+" Teacher pay: "+this.teacherPay+" Teacher subject: "+this.subject+", Teacher class size: "+this.classSize+", \nTeacher ID: "+this.TID+"\n" + "This is a BAD teacher");
	//	}
	}

	
	public String greeting() 
	{
		return("Sit down, be quiet");
	}
	
}
