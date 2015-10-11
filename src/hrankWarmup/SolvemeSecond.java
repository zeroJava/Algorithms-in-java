package hrankWarmup;

import java.util.Scanner;

public class SolvemeSecond {

	static int solveMeSecond(int a, int b)
	{
		return a + b;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int t;
		int sum;
		int a, b;
		t = input.nextInt();
		for (int i = 0; i < t; i++)
		{
			a = input.nextInt();
			b = input.nextInt();
			sum = solveMeSecond(a, b);
			System.out.println(sum);
		}
		input.close();
	}

}
