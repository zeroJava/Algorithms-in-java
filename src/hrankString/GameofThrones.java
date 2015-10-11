package hrankString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameofThrones {

	private static boolean checkAnagramIsPalidrome(String stringData)
	{
		List<Character> charList = covertArrayToList(stringData.toCharArray());
		List<Character> stored = new ArrayList<Character>();
		
		for(int index = 0; index < charList.size() - 1; index++)
		{
			
			for(int secondIndex = index + 1; secondIndex < (charList.size()); secondIndex++)
			{
				
				if(charList.get(index).equals(charList.get(secondIndex)))
				{
					stored.add(charList.get(index));
					stored.add(charList.get(secondIndex));
					//charList.remove(index);
					charList.remove(secondIndex);
					break;
				}
			}
		}
		
		if(stored.size() > 2)
		{
			return true;
		}
		return false;
	}

	public static List<Character> covertArrayToList(char[] array)
	{
		List<Character> list = new ArrayList<Character>();
		
		for(int index = 0; index < array.length; index++)
		{
			list.add(array[index]);
		}
		
		return list;
	}
	
	public static String returnDecision(String value)
	{
		return checkAnagramIsPalidrome(value) ? "YES" : "NO";
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int testCase = input.nextInt();
		for (int i = 0; i < testCase; i++)
		{
			String value = input.next();
			System.out.println(returnDecision(value));
		}

		input.close();
	}

}
