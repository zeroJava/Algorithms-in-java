package bitManipulation;

public class FlippingBit {

	public static void main(String[] args)
	{
		System.out.println(flip(67108864));
	}
	
	private static long flip(long number)
	{
		long[] flipedValue32 = new long[32];
		assigneZeroTo(flipedValue32);
		long value = number;
		
		String binarStr = Long.toBinaryString(~value);
		/* To get a full binary representation in 64 bit, use the bitwise ' ~ '.
		 * use bitwise ~ to get full 64 bit (long) binary representation in string, and return the a value using 
		 * two's compliment. and flip all bit to the opposite value 
		 * In order to return to original value, re-flip the 64 bits again.
		 */
		long[] longBinaryStr = strSplitInto(binarStr);
		
		for(int index = 0; index < flipedValue32.length; index++)
		{
			flipedValue32[index] = longBinaryStr[(longBinaryStr.length - 1) - index];
		}
		
		correctPosition(flipedValue32);
		
		String str = convertToStr(flipedValue32);
		long finalValue = Long.parseLong(str, 2);
		return finalValue;
	}
	
	private static void assigneZeroTo(long[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			array[i] = 0;
		}
	}
	
	private static long[] strSplitInto(String string)
	{
		long[] array = new long[string.length()];
		
		for(int index = 0; index < string.length(); index++)
		{
			array[index] = Long.parseLong(String.valueOf(string.charAt(index)));
		}
		
		return array;
	}
		
	private static void correctPosition(long[] array)
	{
		long[] inArray = new long[array.length];
		
		for(int idxInArray = 0; idxInArray < inArray.length; idxInArray++)
		{
			inArray[idxInArray] = array[(inArray.length - 1) - idxInArray];
		}
		
		for(int index = 0; index < array.length; index++)
		{
			array[index] = inArray[index];
		}
	}
	
	private static String convertToStr(long[] array)
	{
		String string = "";
		
		for(long l : array)
		{
			string += Long.toString(l);
		}
		return string;
	}
	
	public static void flipping(long[] array)
	{
		for(int index = 0; index < array.length; index++)
		{
			if(array[index] == 0)
			{
				array[index] = 1;
			}
			else if(array[index] == 1)
			{
				array[index] = 0;
			}
		}
	}
	
	public static void pr(long[] ar, String comment)
	{
		for(int in = 0; in < ar.length; in++)
		{
			System.out.print(ar[in]);
		}
		System.out.println(" " + comment);
	}
}
