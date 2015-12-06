package hrankImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int testcase = input.nextInt();

		for (int index = 0; index < testcase; index++)
		{
			int num = input.nextInt();
			int[] numbers = getNumber(num);

			int cycle = 0;

			for (int index1 = 0; index1 < numbers.length; index1++)
			{
				// System.out.println(numbers[index1] + " number ");
				if (numbers[index1] == 0)
				{
					continue;
				}

				if (num % numbers[index1] == 0)
				{
					cycle++;
				}
			}

			System.out.println(cycle);
		}
	}

	public static int[] getNumber(int number)
	{

		List<Integer> list = new ArrayList<Integer>();

		while (number > 0)
		{
			int ber = number % 10;
			list.add(ber);
			number = number / 10;
		}

		int[] num = new int[list.size()];
		int len = num.length - 1;

		for (int index = 0; index < num.length; index++)
		{
			num[len - index] = list.get(index);
		}

		return num;
	}
}
