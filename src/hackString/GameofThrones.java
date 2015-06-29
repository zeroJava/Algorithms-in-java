package hackString;

import java.util.Scanner;

public class GameofThrones {
	
	private static boolean checkAnagramIsPalidrome(String stringData)
	{
		char[] lettersOfString = stringData.toCharArray();
		
		for(int index = 0; index < lettersOfString.length; index++)
		{
			for(int index2 = index + 1; index2 < lettersOfString.length; index2++)
			{
				if(lettersOfString[index] == lettersOfString[index2])
				{
					return true;
				}
			}
		}
		return false;
	}

	public static String returnDecision(String value)
	{
		return checkAnagramIsPalidrome(value) ? "YES" : "NO";
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		for(int i = 0; i < testCase; i++)
		{
			String value = input.next();
			System.out.println(returnDecision(value));
		}
		
		input.close();
	}

}
