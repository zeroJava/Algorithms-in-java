package sortExercise;

import java.util.Scanner;

public class Insersort1 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] array = new int[size];
		
		for(int index = 0; index < size; index++)
		{
			array[index] = input.nextInt();
		}
		
		insertIntoSorted(array);
		input.close();
	}

	public static void insertIntoSorted(int[] ar)
	{
		int lastIndex = ar.length - 1;
		int usortedValue = ar[lastIndex];
		boolean nothingHappen = true;

		for (int i = lastIndex; i > -1; i--)
		{
			if (ar[i] == usortedValue)
			{
				continue;
			} 
			else if (ar[i] > usortedValue)
			{
				ar[i + 1] = ar[i];
				printArray(ar);
			} 
			else if (ar[i] < usortedValue)
			{
				System.out.println("check " + ar[i] + " " + ar[i + 1]);
				ar[i + 1] = usortedValue;
				nothingHappen = false;
				System.out.println("check " + ar[i] + " " + ar[i + 1]);
				break;
			}
		}
		
		if (nothingHappen == true)
		{
			ar[0] = usortedValue;
		}
		printArray(ar);
	}

	private static void printArray(int[] ar)
	{
		for (int n : ar)
		{
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
