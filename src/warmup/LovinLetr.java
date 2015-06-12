package warmup;

import java.util.Scanner;

public class LovinLetr {
	
	public static int loveLetter(String word)
	{
		char[] wordInarray = word.toCharArray();
	
		int count = 0;
		for (int index = 0; index <= (wordInarray.length / 2); index++)
		{
			
			int inde = index + 1;
			int secondI = wordInarray.length - inde;
			while (wordInarray[index] != wordInarray[secondI])
			{
				//System.out.println(wordInarray[index] + " " + wordInarray[secondI]);
				wordInarray[secondI]--;
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
