package warmup;

import java.util.Scanner;

public class TimeinWords {

	public static void timeToWord(int hour, int minutes)
	{
       if(hour > 0 && minutes == 00)
       {
           System.out.println(TimeinWords.convertNumberToWord(hour) + " o' clock" );
       }
       else if (hour > 0 && minutes > 00 && minutes < 30 && minutes != 15)
       {
           System.out.println(TimeinWords.convertNumberToWord(minutes) + " minutes past " +
                              TimeinWords.convertNumberToWord(hour));
       }
       else if(hour > 0 && minutes == 15)
       {
           System.out.println("quarter past " + TimeinWords.convertNumberToWord(hour));
       }
       else if(hour > 0 && minutes == 30)
       {
           System.out.println("half past " + TimeinWords.convertNumberToWord(hour));
       }
       else if(hour > 0 && minutes > 30 && minutes > 30 && minutes <= 59 && minutes != 45)
       {    
           System.out.println(TimeinWords.convertNumberToWord(60 - minutes) + " minutes to " +
                              TimeinWords.convertNumberToWord(hour + 1));
       }
       else if(hour > 0 && minutes == 45)
       {
           System.out.println("quarter to " + TimeinWords.convertNumberToWord(hour + 1));
       }
	}

	public static String convertNumberToWord(int number)
	{
		switch (number)
		{
		case 00:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eigteen";
		case 19:
			return "nineteen";
		case 20:
			return "twenty";
		case 21:
			return "twenty one";
		case 22:
			return "twenty two";
		case 23:
			return "twenty three";
		case 24:
			return "twenty four";
		case 25:
			return "twenty five";
		case 26:
			return "twenty six";
		case 27:
			return "twenty seven";
		case 28:
			return "twenty eight";
		case 29:
			return "twenty nine";
		case 30:
			return "thirty";
		}
		return "";
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int hour = input.nextInt();
		int minutes = input.nextInt();
        TimeinWords.timeToWord(hour, minutes);
        input.close();
	}
}
