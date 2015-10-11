package hrankString;

import java.util.HashMap;
import java.util.Scanner;

public class PangramStr {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int testcase = input.nextInt();
		
		for(int cycle = 0; cycle < testcase; cycle++)
		{
			System.out.println("Enter sentence");
			input.nextLine();
			String inVal = input.nextLine();
			System.out.println(panagram(inVal));
		}
	}
	
	private static String panagram(String string)
	{
		char[] letters = string.toCharArray();
		HashMap<Character, Boolean> map = generateData();
		boolean state = false;
		String returnValue = "panagram";
		
		for(Character ch : letters)
		{
			char single = Character.toLowerCase(ch);
			map.put(single, true);
		}
		
		char singleLetter = 'a';
		while(singleLetter <= 'z')
		{
			if(map.get(singleLetter) == false)
			{
				state = true;
			}
			singleLetter++;
		}
		
		if(state)
		{
			return "not panagram";
		}
		
		return returnValue;
	}
	
	private static HashMap<Character, Boolean> generateData()
	{
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		char letters = 'a';
		
		while(letters <= 'z')
		{
			map.put(letters, false);
			letters++;
		}
		return map;
	}
}
