package hrankSortExercise;

import java.util.Random;

public class Insertsort2 {

	public static void main(String[] args)
	{
		Random random = new Random();
		int size = 10;
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
		{
			array[i] = random.nextInt(100);
		}
		insertionSortPart2(array);
	}

	public static void insertionSortPart2(int[] ar)
	{

		for (int i = 1; i < ar.length; i++)
		{
			int index = i;
			int newValue = ar[index];

			while (index > 0 && ar[index - 1] > newValue)
			{
				int temp1 = ar[index];
				int temp2 = ar[index - 1];
				ar[index] = temp2;
				ar[index - 1] = temp1;
				index--;
			}
			ar[index] = newValue;
			printArray2(ar);
		}
	}

	public static void sortiNumber2(int[] ar)
	{
		int index = 0;

		// printArray(ar);
		while (index < (ar.length - 1))
		{
			if (index < 0)
			{
				index++;
			}

			if (ar[index] == ar[index + 1])
			{
				index++;
			} 
			else if (ar[index] > ar[index + 1])
			{
				printArray2(ar);
				int temp1 = ar[index];
				int temp2 = ar[index + 1];
				ar[index] = temp2;
				ar[index + 1] = temp1;
				index--;
			} 
			else
			{
				// printArray(ar);
				index++;
			}
		}
		printArray2(ar);
	}

	public static void printArray(int[] array)
	{
		for (int element : array)
		{
			System.out.println(element + " ");
		}
		System.out.println("");
	}

	private static void printArray2(int[] array)
	{
		for (int element : array)
		{
			System.out.print(element + " ");
		}
		System.out.println("");
	}
}
