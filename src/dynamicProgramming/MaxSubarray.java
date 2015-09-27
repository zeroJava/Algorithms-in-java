package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSubarray {
	
	@SuppressWarnings("unused")
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		/*int testcase = input.nextInt();
		for(int run = 0; run < testcase; run++)
		{
			int size = input.nextInt();
			int[] array = new int[size];
			
			for(int index = 0; index < array.length; index++)
			{
				array[index] = input.nextInt();
			}
			
			System.out.println(algorithmMax(array) + " " + nonConti(array));
		}*/
		int[] ar = {1, -1, -1, -1, -1, 5};
		System.out.println(algorithmMax(ar) + " " + nonConti(ar));
	}
	
	public static int algorithmMax(int[] array)
	{
		List<Integer> holder = new ArrayList<Integer>();
		int number = Integer.MIN_VALUE;
		int currentMax = number;
		
		for(int cycle = 0; cycle < array.length; cycle++)
		{
			if(currentMax < 0)
			{
				currentMax = array[cycle];
			}
			else
			{
				currentMax += array[cycle];
			}
			
			if(currentMax > number)
			{
				number = currentMax;
				holder.add(number);
			}
		}
		
		return holder.get(holder.size() - 1);
	}
	
	public static int nonConti(int[] array)
	{
		int total = array[0];
		
		for(int cycle = 1; cycle < array.length; cycle++)
		{
			if(array[cycle] > 0)
			{
				total += array[cycle];
			}
		}
		
		return total;
	}
}
