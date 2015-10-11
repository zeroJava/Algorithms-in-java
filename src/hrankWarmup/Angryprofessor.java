package hrankWarmup;

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

		System.out.println("Enter nuber of testcase");
		int index = input.nextInt();

		System.out.println("Enter number of number in a class, and the threshold");
		for (int i = 0; i < index; i++)
		{
			// number of students and treshold to decide if class is open of not
			int numberOfStudent = input.nextInt();
			int threshold = input.nextInt();
			String[] arrive = new String[numberOfStudent];
			for (int a = 0; a < numberOfStudent; a++)
			{
				// assign each student a time
				arrive[a] = input.next();
			}
			checkIfClassIsCancelledOrNot(threshold, numberOfStudent, arrive);
		}
		input.close();
	}

}
