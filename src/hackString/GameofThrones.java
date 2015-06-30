package hackString;

import java.util.Scanner;

public class GameofThrones {

	private static boolean checkAnagramIsPalidrome(String stringData)
	{
		return false;
	}

	public static String returnDecision(String value)
	{
		return checkAnagramIsPalidrome(value) ? "YES" : "NO";
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int testCase = input.nextInt();
		for (int i = 0; i < testCase; i++)
		{
			String value = input.next();
			System.out.println(returnDecision(value));
		}

		input.close();
	}

}
