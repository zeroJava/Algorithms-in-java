package hrankWarmup;

public class FaberSomething {

	public static void fabDoin(int maxIteration)
	{
		long firstNumber = 0, secondNumber = 1;
		
		for(int iter = 0; iter < maxIteration; iter++)
		{
			long thidNumber = firstNumber + secondNumber;
			System.out.println(thidNumber);
			firstNumber = secondNumber; 
			secondNumber = thidNumber;
		}
	}
	
	public static void main(String[] args)
	{
		fabDoin(10);
	}

}
