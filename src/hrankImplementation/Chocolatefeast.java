package hrankImplementation;

import java.util.Scanner;

public class Chocolatefeast {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of testcases");
		int test = in.nextInt();
		System.out.println("enter funds, chocolate price and threshold for free chcocolate");
		for (int i = 0; i < test; i++)
		{
			System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
		}
		in.close();
	}

	private static int Solve(int currentBalance, int costOfOne, int threstHold)
	{
		int chocolate = 0;
		
		chocolate = currentBalance / costOfOne;
		System.out.println(chocolate);
		
		if(chocolate == 0)
		{
			return chocolate;
		}
		
		int wrapper = chocolate; 
		while(wrapper >= threstHold )
		{
			chocolate++;
			wrapper = wrapper - threstHold;
			wrapper++;
		}
				
		return chocolate;
	}

}
