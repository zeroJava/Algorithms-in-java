package warmup;

import java.util.Scanner;

public class DiagonalDiff {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		int rowNcolumn = input.nextInt();
		int[][] multiarray = new int[rowNcolumn][rowNcolumn]; // [rows][columns]
		
		for(int outter = 0; outter < multiarray.length; outter++)
		{
			for(int inner = 0; inner < multiarray[0].length; inner++)
			{
				multiarray[outter][inner] = input.nextInt();
			}
		}
		
		System.out.println(matrixDiff(multiarray));
	}
	
	public static int matrixDiff(int[][] multiarray)
	{
		int firstEqu = 0;
		int second = 0;
		int finVal = 0;
		
		for(int row = 0; row < multiarray.length; row++)
		{
			int colums = (multiarray[0].length - 1) - row;
			firstEqu = firstEqu + multiarray[row][colums];
		}
		
		for(int reverseRow = (multiarray.length - 1); reverseRow > -1; reverseRow--)
		{
			int column = reverseRow;
			second = second + multiarray[reverseRow][column];
		}
		
		finVal = firstEqu - second;
		return Math.abs(finVal);
	}
}
