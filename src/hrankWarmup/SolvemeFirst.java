package hrankWarmup;

import java.util.Scanner;

public class SolvemeFirst {

	static int solveMeFirst(int a, int b)
	{
		return a + b;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a;
		a = input.nextInt();
		int b;
		b = input.nextInt();
		int sum;
		sum = solveMeFirst(a, b);
		System.out.println(sum);
		input.close();
	}

}
