package dataStructuring.arrayy;

import java.util.Arrays;
import java.util.Random;

public class Arraystruc {
	
	// way of making arrays
	
	// one dimensional array data structure
	public int[] array1 = {1, 4, 9, 3, 5};
	public int[] array2 = new int[5];
	public int[] array3 = new int[]{8, 5, 3, 7 ,2, 48, 672, 347, 348}; // anonymous array
	
	// two dimensional array data structure
	public int[][] twoArray1 = { {1, 2, 2}, 
								 {4, 5, 6} }; // [2 rows] [3 columns] e.g. each row holds 3 arrays 
	
	public int[][] twoArray2 = new int[3][5];
	
	public int[][] twoArray3 = new int[][] { {12, 30, 86, 54}, 
										 	 {75, 24, 82, 647},
										 	 {647, 3215, 756, 2347} }; //[3 rows][4 columns] anonymous array
	                           
	// three dimensional array data structure
	
	public void linearSearch(int number, int[] array)
	{
		int size = array.length, theValueLookingFor = number;
		for(int i = 0; i < size; i++)
		{
			if(theValueLookingFor == array[i])
			{
				System.out.println("Found it, found " + array[i]);
				return;
			}
		}
		System.out.println("Couldn't find it.");
	}
	
	public void binarySearch(int number, int[] array)
	{
		System.out.println(Arrays.toString(bubbleSortAr(array)));
		//System.out.println(11 ^ 12);
		int[] arraySorted = bubbleSortAr(array);
		int lowestIndex = 0, highesIndex = arraySorted.length - 1, middleIndex, searchValue = number;
		
		while(lowestIndex <= highesIndex)
		{
			middleIndex = (lowestIndex + highesIndex) / 2; 
			if(searchValue > arraySorted[middleIndex])
			{
				lowestIndex = middleIndex + 1;
			}
			else if(searchValue < arraySorted[middleIndex])
			{
				highesIndex = middleIndex - 1;
			}
			else
			{
				break;
			}
		}
		
		if(lowestIndex > highesIndex)
		{
			System.out.println("Couldn't find it");
		}
		else
		{
			System.out.println("found" );
		}
	}
	
	private int[] bubbleSortAr(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = i + 1; j < array.length; j++)
			{
				if(array[i] >= array[j])
				{
					int firstArray = array[i];
					int secondArray = array[j];
					array[i] = secondArray;
					array[j] = firstArray;
				}
			}
		}
		return array;
	}
	
	public boolean doesThisElementExist(int element, int[] array)
	{
		for(int number : array)
		{
			if(element == number)
			{
				return true;
			}
		}
		return false;
	}
	
	public void deleteIndex(int element, int[] array)
	{
		for(int index = element; index < (array.length - 1); index++)
		{
			int value = array[index + 1];
			array[index] = value;
		}
		
		array[array.length - 1] = 0;
	}
	
	public void insertValue(int value, int[] array)
	{
		for(int index = 0; index < array.length; index++)
		{
			if(array[index] == 0)
			{
				array[index] = value;
				return;
			}
		}
		System.out.println("There was no emptys space avaialable.");
	}
	
	public void assignValue()
	{
		Random random = new Random();
		for(int indexForRow = 0; indexForRow < twoArray2.length; indexForRow++)
		{
			for(int indexForColumn = 0; indexForColumn < twoArray2[0].length; indexForColumn++)
			{
				twoArray2[indexForRow][indexForColumn] = random.nextInt();
			}
		}
	}
	
	public int getValueOfIndex(int index, int[] array)
	{
		return array[index];
	}
	
	public void printArray(int[] array)
	{
		for(int intValue = 0; intValue < array.length; intValue++)
		{
			System.out.print("| " + intValue);
			System.out.println(" | " + array[intValue] + " | ");
			System.out.println("--------");
		}
	}
	
	public int generateValuesForArray(int rangeBetween)
	{
		return (int)(Math.random()* rangeBetween);
	}
}
