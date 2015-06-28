package hackString;

import java.util.Scanner;

public class LovinLetr {
	
	public static int loveLetter(String word)
	{
		char[] wordInarray = word.toCharArray();
	
		int count = 0;
		for (int index = 0; index <= (wordInarray.length / 2); index++)
		{
			
			int valueUseforSecondIn = index + 1;
			int secondIndex = wordInarray.length - valueUseforSecondIn;
			
			if(wordInarray[index] > wordInarray[secondIndex])
			{
				char temp1 = wordInarray[index];
				char temp2 = wordInarray[secondIndex];
				wordInarray[index] = temp2;
				wordInarray[secondIndex] = temp1;
			}
			
			while (wordInarray[index] != wordInarray[secondIndex])
			{
				//System.out.println(wordInarray[index] + " " + wordInarray[secondI]);
				wordInarray[secondIndex]--;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter testcse");
		int test = input.nextInt();
		
		for(int iteration = 0; iteration < test; iteration++)
		{
			String word = input.next();
			System.out.println(loveLetter(word));
		}
		
		input.close();
	}

}
