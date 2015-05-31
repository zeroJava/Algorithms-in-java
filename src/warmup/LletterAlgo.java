package warmup;

import java.util.Scanner;

public class LletterAlgo {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String word = "abccbd";
		int i = loveLetter(word);
		System.out.println(" " + i);
		
		String[] words = new String[2];
		
		for(int index = 0; index < words.length; index++)
		{
			words[index] = input.next();
		}
		
		for(String aa : words)
		{
			System.out.println(loveLetter(aa));
		}
		
		char[] charar = { 'a', 'b' };
		/*for (char aa = 'A'; aa < 'z'; aa++)
		{
			System.out.println(" " + aa + " " );
		}*/
		//System.out.println(++charar[0] + " " );

	}

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
}
