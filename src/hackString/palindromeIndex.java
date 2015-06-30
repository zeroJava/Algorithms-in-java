package hackString;

import java.util.Scanner;

public class palindromeIndex {
	
	public static int getPalindromeValue(String value)
	{
		char[] letterOfString = value.toCharArray();
		
		for(int index = 0; index < letterOfString.length; index++)
		{
			int dataForsecond = index + 1;// variable to used as a component for second index
			int secondIndex = letterOfString.length - dataForsecond;// second index
			if(letterOfString[index] != letterOfString[secondIndex])
			{
				if(letterOfString[index + 1] == letterOfString[secondIndex])
				{
					// last if is the safety mechanism to decide if we should use the vale first or second index 
					if( (secondIndex > 3 && index <  letterOfString.length - 2) && letterOfString[index + 2] == letterOfString[secondIndex - 3] )
					{
						return secondIndex;
					}
					return index;
				}
				return secondIndex;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		for(int iteration = 0; iteration < testCase; iteration++)
		{
			String value = input.next();
			System.out.println(getPalindromeValue(value));
		}
		input.close();
	}

}
