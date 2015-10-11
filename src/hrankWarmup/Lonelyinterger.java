package hrankWarmup;

import java.util.Scanner;

public class Lonelyinterger {

	public static int lonelyinteger(int[] a)
	{
		int result = 0;
		for (int i = 0; i < a.length; i++)
		{
			result = result ^ a[i];
		}
		return result;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int res;

		int _a_size = Integer.parseInt(input.nextLine());
		int[] _a = new int[_a_size];
		int _a_item;
		String next = input.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++)
		{
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		res = lonelyinteger(_a);
		System.out.println(res);
		input.close();
	}

}
