package hrankWarmup;

public class LibraryFine {

	public static void main(String[] args)
	{
		/*
		 * 2 7 1014
		 * 1 1 1015
		 * 
		 * 28 2 2015
		 * 15 4 2015
		 */
		System.out.println(fine("28 2 2015", "15 4 2015"));
	}

	public static int fine(String actual, String expected)
	{
		String[] dateReturned = actual.split(" ");
		String[] expectedReturned = expected.split(" ");
		
		int returnedDay = Integer.parseInt(dateReturned[0]);
		int returnedMonth = Integer.parseInt(dateReturned[1]);
		int returnedYear = Integer.parseInt(dateReturned[2]);
		
		int expectedDay = Integer.parseInt(expectedReturned[0]);
		int expectedMonth = Integer.parseInt(expectedReturned[1]);
		int expectedYear = Integer.parseInt(expectedReturned[2]);
		
		if(returnedYear <= expectedYear)
		{
			if(returnedMonth > expectedMonth && returnedYear < expectedYear)
			{
				return 0;
			}
			else if(returnedMonth <= expectedMonth)
			{
				if(returnedDay > expectedDay && returnedMonth < expectedMonth)
				{
					return 0;
				}
				else if(returnedDay <= expectedDay)
				{
					return 0;
				}
				else
				{
					return 15 * (returnedDay - expectedDay);
				}
			}
			else
			{
				return 500 * (returnedMonth - expectedMonth);
			}
		}
		else
		{
			return 10000;
		}
	}
}
