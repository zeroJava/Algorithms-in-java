package hrankImplementation;

import java.util.Scanner;

public class UtopianTree {

	public static Scanner input = new Scanner(System.in);

	public static int uTree(int cycles, int tree)
	{
		String season = "winter";
		for (int cy = 0; cy < cycles; cy++)
		{
			if (season.equalsIgnoreCase("winter"))
			{
				tree = tree * 2;
				season = "summer";
			} else
			{
				tree = tree + 1;
				season = "winter";
			}
		}
		return tree;
	}

	public static void main(String[] args)
	{

		int utopianTree = 1;
		int testCase = input.nextInt();
		int[] cycles = new int[testCase];

		for (int i = 0; i < cycles.length; i++)
		{
			cycles[i] = input.nextInt();
		}

		for (int a = 0; a < cycles.length; a++)
		{
			System.out.println(UtopianTree.uTree(cycles[a], utopianTree));
		}
	}

}
