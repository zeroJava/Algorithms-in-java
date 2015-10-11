package hrankWarmup;

import java.util.Scanner;

public class BigSumArray {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int testase = input.nextInt();
		int[] array = new int[testase];
				
		for(int i = 0; i < array.length; i++)
		{
			array[i] = input.nextInt();
		}
		
		System.out.println(totalValueofArray(array));
	}
	
	public static long totalValueofArray(int[] array)
	{
		long value = 0;
		
		for(int cycle = 0; cycle < array.length; cycle++)
		{
			value = value + array[cycle];
			System.out.println(value);
		}
		return value;
	}
}
