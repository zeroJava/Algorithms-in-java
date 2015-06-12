package dataStructuring.stacksNqueues;

import java.util.Arrays;

public class Stackin {
	
	/* Stacks hold data. With a stack, the data that has been added first will be retrieved last; 
	 * and the data place last will be retrieved(deleted) first. */
	// An example of how stack work
	private int position = -1;
	private int[] array; 
	
	public Stackin(int[] array)
	{
		this.array = array;
	}
	
	public void fillArray(int[] array)
	{
		if(array.length != 0)
		{
			for (int index = 0; index < array.length; index++)
			{
				pushDataIntoStack((int) (Math.random() * 99) + 1);
			}
		} 
	}

	public void pushDataIntoStack(int value)
	{
		// .push is how you insert a value into a stack
		if(position + 1 < array.length)
		{
			position++;
			array[position] = value;
			printAraay();
		}
		else
		{
			System.out.println("Stack is full");
		}
	}
	
	public void popDataFromTheStack()
	{
		if(position >= 0)
		{
			array[position] = 0;
			position--;
			printAraay();
		}
		else
		{
			System.out.println("There was no data");
		}
	}
	
	public void popAllDataInStack()
	{
		while(position != -1)
		{
			popDataFromTheStack();
		}
	}
	
	public int peakCheakTheStack()
	{
		System.out.println(array[position]);
		return array[position];
	}
	
	private void printAraay()
	{
		System.out.println(Arrays.toString(array));
	}
	
	public static void main(String[] args)
	{
		int[] array = new int[15];
		//Arrays.fill(array, -2);
		Stackin stackin = new Stackin(array);
		stackin.fillArray(array);
		stackin.popAllDataInStack();
	}

}
