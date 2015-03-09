package dataStructuring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DtaStruct {
	/**
	 * Data structure means how data is stored and manipulated. This class will
	 * demonstrate data structures.
	 */
	private List<Integer> makeExistingData = new ArrayList<Integer>(20);
	private Random randomNumberValue = new Random();

	public void gnerateData(int sizeOfData)
	{
		for (int i = 0; i < sizeOfData; i++)
		{
			makeExistingData.add(randomNumberValue.nextInt(90) + 10);
		}
	}

	public void removeCertainData()
	{
		List<Integer> tempList = new ArrayList<Integer>();
		showAllData();
		int i = 0;
		while (i < makeExistingData.size())
		{
			if ((i % 2) != 0)
			{
				// tempList.add(randomNumberValue.nextInt(100) + 100);
				// makeExistingData.set(i, randomNumberValue.nextInt(100) + 100);
				makeExistingData.add(i, randomNumberValue.nextInt(100) + 100);
			}
			i++;
		}
		/*
		 * makeExistingData.removeAll(makeExistingData);
		 * if(makeExistingData.isEmpty()) { for(Integer integer : tempList) {
		 * makeExistingData.add(integer); } }
		 */
		System.out.println("-------------");
	}

	public void showAllData()
	{
		for (Integer integer : makeExistingData)
		{
			System.out.println(integer);
		}
	}
}
