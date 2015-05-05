package sortExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Sortinumber {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		for (int index = 0; index < 10; index++)
		{
			array[index] = input.nextInt();
		}

		System.out.println(Arrays.toString(array));

		insertIntoSorted(array);
		
		System.out.println(Arrays.toString(array));
		input.close();
	}

	public static void insertIntoSorted(int[] ar)
	{
		for (int index1 = 0; index1 < ar.length; index1++)
		{
			for (int index2 = index1 + 1; index2 < ar.length; index2++)
			{
				if (ar[index1] >= ar[index2])
				{
					int tempA = ar[index1];
					int tempB = ar[index2];
					ar[index1] = tempB;
					ar[index2] = tempA;
				}
			}
		}
	}
}
