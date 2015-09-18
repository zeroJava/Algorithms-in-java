package hackString;

import java.util.Scanner;

public class FunnyStr {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int testcase = input.nextInt();
		for(int cycle = 0; cycle < testcase; cycle++)
		{
			System.out.println("enter text");
			System.out.println(CheckFunnyOrNot(input.next()));
		}
	}

	public static String CheckFunnyOrNot(String string)
	{
		char[] normal = string.toCharArray();
		char[] reverse = new char[normal.length];
		boolean stateBool = true;
		String state = "Not Funny";
		
		for(int index = reverse.length - 1; index > -1; index--)
		{
			int revIndex = (reverse.length - 1) - index;
			reverse[revIndex] = normal[index];
		}
		
		//System.out.println((+ " " +  );
		
		for(int indx = 0; indx < normal.length - 1; indx++)
		{
			int normalResult = Math.abs(normal[indx + 1] - normal[indx]);
			int reverseResult = Math.abs(reverse[indx + 1] - reverse[indx]);
			
			if( !(normalResult == reverseResult) )
			{
				stateBool = false;
			}
		}
		
		if(stateBool)
		{
			state = "Funny";
		}
		
		return state;
	}
}
