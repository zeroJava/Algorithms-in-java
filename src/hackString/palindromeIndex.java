package hackString;

import java.util.Scanner;

public class palindromeIndex {
	
	public static int getPalindromeValue(String value)
	{
		char[] letterOfString = value.toCharArray();
		
		for(int index = 0; index < letterOfString.length; index++)
		{
			int dataForsecond = index + 1;
			int secondIndex = letterOfString.length - dataForsecond;
			if(letterOfString[index] != letterOfString[secondIndex])
			{
				if(letterOfString[index + 1] == letterOfString[secondIndex])
				{
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
