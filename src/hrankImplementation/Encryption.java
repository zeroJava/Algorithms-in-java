package hrankImplementation;

import java.util.Scanner;

public class Encryption
{
	
	private Scanner input = new Scanner(System.in);
	
	public Encryption()
	{
		
		String string = input.nextLine();
		String stringWithnospaces = string.replace(" ", "");
		System.out.println(stringWithnospaces);
		
		double sqrootStr = Math.sqrt((double)stringWithnospaces.length());
		double column = Math.ceil(sqrootStr);
		double row = Math.ceil(sqrootStr);
		
		String[][] grid = generateGrid(stringWithnospaces, (int)row, (int)column);
		displayGrid(grid);
		
		String value = encrypt(grid);
		System.out.println(value);
	}
	
	private String[][] generateGrid(String string, int row, int column)
	{
		String[][] grid = new String[row][column];
		String temp = string;
		
		for(int rw = 0; rw < grid.length; rw++)
		{
			for(int col = 0; col < grid[0].length; col++)
			{
				
				if( !(temp.equals("")) && temp.length() > 0)
				{
					grid[rw][col] = temp.charAt(0)+"";
					temp = temp.substring(1);
					continue;
				}
				
				grid[rw][col] = "";
			}
		}
		
		return grid;
	}
	
	private String encrypt(String[][] grid)
	{
		String value = "";
		
		for(int column = 0; column < grid[0].length; column++)
		{
			for(int row = 0; row < grid.length; row++)
			{
				value = value + grid[row][column];
			}
			
			value = value + " ";
		}
		
		return value;
	}
	
	private void displayGrid(String[][] grid)
	{
		System.out.println();
		
		for(int row = 0; row < grid.length; row++)
		{
			for(int column = 0; column < grid[0].length; column++)
			{
				System.out.print(grid[row][column] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Encryption encryption = new Encryption();
	}
}
