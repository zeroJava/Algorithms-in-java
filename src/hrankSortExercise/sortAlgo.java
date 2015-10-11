package hrankSortExercise;

import java.util.ArrayList;
import java.util.List;

public class sortAlgo {
	
	private List<Integer> listOfNumbers = new ArrayList<Integer>();
	
	public sortAlgo()
	{
		
	}
	
	public void addDataToTheList(int numberOfData)
	{
		for(int index = 0; index < numberOfData; index++)
		{
			getListOfNumbers().add(index);
		}
	}

	public List<Integer> getListOfNumbers()
	{
		return listOfNumbers;
	}
	
	public void shuffleData()
	{
		
	}
}
