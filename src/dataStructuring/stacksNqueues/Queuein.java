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
	
	public void inser(int value)
	{
		if(number < array.length)
		{
			array[backPosition] = value;
			backPosition++;
			number++;
			printttt(array);
		}
		else
		{
			System.out.println("no space left");
		}
	}
	
	public void reemovee()
	{
		if(number > 0)
		{
			array[frontPosition] = 0;
			frontPosition++;
			number--;
			printttt(array);
		}
		else
		{
			System.out.println("no values iserted");
		}
	}
	
	public void peekkk()
	{
		System.out.println("first element is " + array[frontPosition]);
	}
	
	public void privInser(int value)
	{
		int num;
		
		if(this.number == 0)
		{
			inser(value);
		}
		else
		{
			for(num = number - 1; num >= 0; num--)
			{
				if(value > array[num])
				{
					array[num + 1] = array[num];
					printttt(array);
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
	
	public void giveData()
	{
		for(int index = 0; index < array.length; index++)
		{
			inser((int)(Math.random()*100) + 1);
		}
	}
	
	private void printttt(int[] array)
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
		queuein.privInser(54);
		queuein.privInser(5);
		queuein.privInser(753);
		queuein.privInser(404);
		queuein.privInser(100);
		queuein.privInser(347);
		queuein.reemovee();
	}

}
