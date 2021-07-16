package Person;

public class MakeEmail extends Person{

	public MakeEmail(String nameIn, String surnameIn)
	{
        super(nameIn, surnameIn);
	}

	public static String makeEmail(String name, String surname)
	{
				String emailExt = "@wcps.k12.md.us";
        String email = "";
        if (surname.length() >= 5 && name.length() > 2)
        {
            String getFive = surname.substring(0, 5);
            String getThree = name.substring(0, 3);
            String username = getFive.concat(getThree).toLowerCase();
            email = username.concat(emailExt);
        }
        else if (surname.length() >= 5 && name.length() <= 2)
        {
            String getFive = surname.substring(0, 5);
            String getTwo = name;
            String username = getFive.concat(getTwo).toLowerCase();
            email = username.concat(emailExt);
        }
        else if (surname.length() < 5 && name.length() <= 2) {
            String getFive = surname.substring(0);
            String username = getFive.concat(name).toLowerCase();
            email = username.concat(emailExt);
        }
        else if (surname.length() < 5 && name.length() > 2) {
            String getFive = surname.substring(0);
            String getThree = name.substring(0, 3);
            String username = getFive.concat(getThree).toLowerCase();
            email = username.concat(emailExt);
        }
        return email;
	}

	public String greeting()
	{
		return("");
	}

}
