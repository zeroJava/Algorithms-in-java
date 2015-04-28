package warmup;

import java.util.Scanner;

public class Angryprofessor {

	public static void checkIfClassIsCancelledOrNot(int threshold, int nOfStu, String[] nOArrived)
	{
		int studentsOnTime = 0;

		for (int index = 0; index < nOfStu; index++)
		{
			int arrived = Integer.parseInt(nOArrived[index]);
			if (arrived <= 0)
			{
				studentsOnTime++;
			}

			if (studentsOnTime >= threshold)
			{
				System.out.println("NO");
				break;
			}
		}

		if (studentsOnTime < threshold)
		{
			System.out.println("YES");
		}
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int index = input.nextInt();

		for (int i = 0; i < index; i++)
		{
			int numberOfStudent = input.nextInt();
			int threshold = input.nextInt();
			String[] arrive = new String[numberOfStudent];
			for (int a = 0; a < numberOfStudent; a++)
			{
				arrive[a] = input.next();
			}
			checkIfClassIsCancelledOrNot(threshold, numberOfStudent, arrive);
		}
		input.close();
	}

}
