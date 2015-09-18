package hackString;

import java.util.Scanner;

public class StringIntro {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int testCase = input.nextInt();
		
		for(int cycle = 0; cycle < testCase; cycle++)
		{
			String string1 = input.next();
			String string2 = input.next();
			
			while(!(checkContainsUppercase(string1, string2)))
			{
				string1 = input.next();
				string2 = input.next();
			}
			
			stringManipulation(string1, string2);
		}
	}
	
	public static void stringManipulation(String string1, String string2)
	{
		System.out.println(string1.length() + string2.length());
		System.out.println(checkIfGreater(string1, string2));
		System.out.println(changeFirstLetterToUpperclass(string1) + 
									" " + changeFirstLetterToUpperclass(string2));
	}
	
	private static boolean checkContainsUppercase(String string1, String string2)
	{
		if(string1.equals(string1.toLowerCase()) && string2.equals(string2.toLowerCase()))
		{
			return true;
		}
		return false;
	}
	
	private static String checkIfGreater(String string1, String string2)
	{
		return (string1.compareTo(string2) > 0 ? "Yes" : "No");
	}
	
	private static String changeFirstLetterToUpperclass(String string)
	{
		char first = Character.toUpperCase(string.charAt(0));
		String subString = string.substring(1);
		return (first + subString);
	}
}
