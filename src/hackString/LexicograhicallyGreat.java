package hackString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LexicograhicallyGreat {

	public static void main(String[] args)
	{
		biggerIsGreater("dkhc");
	}

	public static void biggerIsGreater(String string)
	{
		Random random = new Random();
		char[] letters = string.toCharArray();
		
		if(letters.length <= 1)
		{
			System.out.println("no answer");
			return;
		}
		
		Set<String> set = new HashSet<String>();
		set.add(string);
		for(int iter = 0; iter < 100000; iter++)
		{
			
			int firstIndex = random.nextInt(letters.length);
			int secondIndex = random.nextInt(letters.length);
			
			if( !(firstIndex == secondIndex) )
			{
				char value1 = letters[firstIndex];
				char value2 = letters[secondIndex];
				letters[firstIndex] = value2;
				letters[secondIndex] = value1;
				String word = new String(letters);
				
				if(string.compareTo(word) < 0)
				{
					//System.out.println(word);
					set.add(word);
					//break;
				}
			}
		}
		
		if(set.size() <= 1)
		{
			System.out.println("no answer");
			return;
		}
		
		List<String> list = new ArrayList<String>();
		for(String str : set)
		{
			list.add(str);
		}
		sorted(list);
		System.out.println(list);
		String[] array = listToArray(list);
		for(int index = 0; index < array.length; index++)
		{
			if(array[index].equals(string))
			{
				if(index + 1 < array.length)
				{
					System.out.println(array[index + 1]);
				}
			}
		}
	}
	
	public static List<String> sorted(List<String> list)
	{
		//System.out.println(list);
		Collections.sort(list, new Comparator<String>()
		{

			@Override
			public int compare(String o1, String o2)
			{
				return o1.compareTo(o2);
			}
		});
		return list;
	}
	
	public static String[] listToArray(List<String> list)
	{
		String[] array = new String[list.size()];
		for(int index = 0; index < array.length; index++)
		{
			array[index] = list.get(index);
		}
		return array;
	}
}
