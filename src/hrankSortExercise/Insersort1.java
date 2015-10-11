package hrankSortExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Insersort1 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] array = new int[size];
		int[] array2 = array;
		
		for(int index = 0; index < size; index++)
		{
			array[index] = input.nextInt();
		}
		
		insertIntoSorted(array);
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("If data was scruble way.. ");
		sortinumber1(array2);
		System.out.println(Arrays.toString(array2));
		
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
	
	public static void sortinumber1(int[] ar)
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

	private static void printArray(int[] ar)
	{
		for (int n : ar)
		{
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
