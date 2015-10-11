package hrankWarmup;

public class Staricase {

	public static void main(String[] args)
	{
		stairs(6);
	}

	private static void stairs(int size)
	{
		char[] symbol = new char[size];
		for(int cycle = 0; cycle < symbol.length; cycle++)
		{
			symbol[cycle] = '#';
		}
		
		String n = new String(symbol);
		
		for(int index = n.length()- 1; index >= 0; index--)
		{
			System.out.printf("%"+n.length()+"s"+"%n", n.substring(index));
		}
	}
}
