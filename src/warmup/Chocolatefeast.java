package warmup;

import java.util.Scanner;

public class Chocolatefeast {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++)
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

		while (c <= moneyLeft)
		{
			chocolate++;
			wrapper++;
			moneyLeft = moneyLeft - c;
		}

		while (wrapper >= m)
		{
			chocolate++;
			wrapper = wrapper - m;
			wrapperLeft = wrapper;
		}

		if (wrapperLeft > 0)
		{
			chocolate++;
		}

		return chocolate;
	}

}
