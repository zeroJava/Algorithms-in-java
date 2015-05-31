package dataStructuring.cipherin;

import java.util.ArrayList;
import java.util.List;

public class Cipherin {

	public static List<Character> deChipherNumber(int item)
	{
		List<Character> covertedValue = new ArrayList<Character>();
		String[] numbers = Integer.toString(item).split("");
		int size = numbers.length;
		
		for(int index = 0; index < size; index++)
		{
			char letter = letters(Integer.parseInt(numbers[index]));
			//Character leter = letter;
			covertedValue.add(letter);
		}
		return covertedValue;
	}
	
	private static char letters(int number)
	{
		switch (number)
		{
		case 0:
			return ' ';
		case 1:
			return 'A';
		default:
			break;
		}
		return 0;
	}
}
