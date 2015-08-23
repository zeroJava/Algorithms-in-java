package hackString;

public class LexicograhicallyGreat {

	public static void main(String[] args)
	{
		biggerIsGreater("hello");
	}

	public static void biggerIsGreater(String string)
	{
		
		char[] letters = string.toCharArray();
		
		for(char character : letters)
		{
			int i = Character.getNumericValue(character);
			System.out.println(i);
		}
	}
}
