package sortExercise;

public class Insersort1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public static void insertIntoSorted(int[] ar)
	{
		int lastIndex = ar.length - 1;
		int usortedValue = ar[lastIndex];

		for (int i = lastIndex; i >= 0; i--)
		{
			if (ar[i] == usortedValue)
			{
				continue;
			} 
			else if (usortedValue < ar[i] && ar[i] > ar[i - 1])
			{
				ar[i + 1] = ar[i];
				System.out.println(ar[0] + " " + ar[1] + " " + ar[2] + " "
						+ ar[3] + " " + ar[4]);
			} 
			else if (usortedValue > ar[i])
			{
				ar[i] = 3;
				System.out.println(ar[0] + " " + ar[1] + " " + ar[2] + " "
						+ ar[3] + " " + ar[4]);
			}
		}
	}

}
