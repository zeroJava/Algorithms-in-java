package hrankImplementation;

import java.util.Scanner;

public class SherlockSquares {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int testcase = input.nextInt();

		for (int testcycle = 0; testcycle < testcase; testcycle++)
		{
			int numA = input.nextInt();
			int numB = input.nextInt();

			System.out.println(rtSquared(numA, numB));
		}
	}

	public static int rtSquared(int numA, int numB)
	{
		int number = (int)Math.floor(Math.sqrt(numB)+ 1) - (int)Math.ceil(Math.sqrt(numA));
		return number;
	}
}
