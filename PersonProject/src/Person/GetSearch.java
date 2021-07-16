package Person;

import java.util.Scanner;

public class GetSearch
{

	public String getSearch()
	{
		System.out.print("What is the last name of the person you are looking for? ");
		@SuppressWarnings("resource")
		Scanner findName = new Scanner(System.in);
		String input = findName.nextLine();
		// processing the string; removes all whitespace and capitalizes the first letter of any input
		input = input.replace(" ", "");
		// String fix1 = input.substring(0,1);
		// String fix2 = fix1.toUpperCase();
		// String finalString = fix2.concat(input.substring(1));
		return input;
	}


}
