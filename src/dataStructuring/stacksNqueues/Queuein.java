package dataStructuring.stacksNqueues;

import java.util.Arrays;

public class Queuein {
	
	/* Queues are the opposite of stack; whereas stack follow the 'first in last out' approach, 
	 * and queues follow the 'first in first out' approach
	 * With queues, the data inserted first will be the first data to be deleted */
	
	private int[] array;
	private int number = 0;
	private int frontPosition; // Uninitialised primitive variable will have the default variable of 0
	private int backPosition; // uninitialised reference(class type) will have the default variable of null;

	public Queuein(int[] array)
	{
		this.array = array;
	}
	
	public void insert(int value)
	{
		if(number < array.length)
		{
			array[backPosition] = value;
			backPosition++;
			number++;
			diplayDataInQueue(array);
		}
		else
		{
			System.out.println("no space left");
		}
	}
	
	public void remove()
	{
		if(number > 0)
		{
			array[frontPosition] = 0;
			frontPosition++;
			number--;
			diplayDataInQueue(array);
		}
		else
		{
			System.out.println("no values iserted");
		}
	}
	
	public void checkThePeakOfQueue()
	{
		System.out.println("first element is " + array[frontPosition]);
	}
	
	public void priorityInsertDataIntoLQueue(int value)
	{
		int num;
		
		if(this.number == 0)
		{
			insert(value);
		}
		else
		{
			for(num = number - 1; num >= 0; num--)
			{
				if(value > array[num])
				{
					array[num + 1] = array[num];
					diplayDataInQueue(array);
				}
				else
				{
					break;
				}
			}
			
			array[num + 1] = value;
			//printttt(array);
			backPosition++;
			number++;
		}
	}
	
	public void assignValueToObjects()
	{
		for(int index = 0; index < array.length; index++)
		{
			insert((int)(Math.random()*100) + 1);
		}
	}
	
	private void diplayDataInQueue(int[] array)
	{
		System.out.println(Arrays.toString(array));
	}
	
	public static void main(String[] args)
	{
		int[] array = new int[10];
		Arrays.fill(array, 0);
		Queuein queuein = new Queuein(array);
		//queuein.giveData();
		//queuein.reemovee();
		//queuein.peekkk();
		queuein.priorityInsertDataIntoLQueue(54);
		queuein.priorityInsertDataIntoLQueue(5);
		queuein.priorityInsertDataIntoLQueue(753);
		queuein.priorityInsertDataIntoLQueue(404);
		queuein.priorityInsertDataIntoLQueue(100);
		queuein.priorityInsertDataIntoLQueue(347);
		queuein.remove();
	}

}
