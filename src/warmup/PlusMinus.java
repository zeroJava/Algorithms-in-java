package warmup;

import java.util.Scanner;

public class PlusMinus {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int testcae = input.nextInt();
		int[] array = new int[testcae];
		for(int cycle = 0; cycle < testcae; cycle++)
		{
			array[cycle] = input.nextInt();
			input.nextLine(); // needed due to scanner fucnt
		}
		
		fractionPlusMinus(array);
	}
	
	public static void  fractionPlusMinus(int[] array)
	{
		double positiveNumber = 0;
		double negativeNumber = 0;
		double numberOne = 0 ;
		//double[] hold = new double[3];
		
		for(int index = 0; index < array.length; index++)
		{
			if(array[index] < 0)
			{
				negativeNumber++;
			}
			else if(array[index] > 0)
			{
				positiveNumber++;
			}
			else
			{	
				numberOne++;
			}
		}
		
		System.out.printf("%f\n%f\n%f\n", 
				positiveNumber / array.length, negativeNumber / array.length, numberOne / array.length);
	}
}
