package hrankWarmup;

public class TimeConversion {

	public static void main(String[] args)
	{
		System.out.println(convertTo24h("12:45:54PM"));
	}
	
	public static String convertTo24h(String time)
	{
		String rtrnValue = time.substring(0, time.length() - 2);
		
		if(time.contains("PM") || Integer.parseInt(time.substring(0, 2)) == 12)
		{
			String hour = time.substring(0, 2);
			String minutesAndSeconds = time.substring(2, (time.length() - 2) );
			String hour24 = (Integer.parseInt(hour) + 12) + "";
			
			if(hour24.equals("24"))
			{
				hour24 = "00";
				if(time.contains("PM"))
				{
					hour24 = "12";
				}
			}
			
			rtrnValue = hour24 + minutesAndSeconds;
			return rtrnValue;
		}
		
		return rtrnValue;
	}
	
}
