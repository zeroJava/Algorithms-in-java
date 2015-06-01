package warmup;

import java.util.Scanner;

public class Chocolatefeast {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of testcases");
		int test = in.nextInt();
		System.out.println("exter funds, chocolate price and threshold for free chcocolate");
		for (int i = 0; i < test; i++)
		{
			System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
		}
		in.close();
	}

	private static long Solve(int n, int c, int m)
	{
		long chocolate = 0;
		int wrapper = 0;
		int moneyLeft = n;
		int wrapperLeft = 0;

		// buying the chocolate, and seeing how much chocolate & wrappers the individual gets  
		while (c <= moneyLeft)
		{
			chocolate++;
			wrapper++;
			moneyLeft = moneyLeft - c;
		}

		// check how much wrappers he needs to get an extra chocolate 
		while (wrapper >= m)
		{
			chocolate++;
			wrapper = wrapper - m;
			wrapperLeft = wrapper;
		}

		// trades in remaining wrapper for chocolate
		if (wrapperLeft > 0)
		{
			chocolate++;
		}

		return chocolate;
	}

}
