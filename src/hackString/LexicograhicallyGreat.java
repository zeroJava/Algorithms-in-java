package hackString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LexicograhicallyGreat {

	public static void main(String[] args)
	{
		
		biggerIsGreater("hefrtghbrtghn");
	}

	public static void biggerIsGreater(String string)
	{
		//Random random = new Random();
		char[] letters = string.toCharArray();
		
		if(letters.length <= 1)
		{
			System.out.println("no answer");
			return;
		}
		
		Set<String> set = new HashSet<String>();
		allCombinations(set, "", string);
		
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
		//System.out.println(list.size() + "" + list);
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
	
	public static void allCombinations(Set<String> set, String prefix, String string)
	{
		int length = string.length();
		
		if(length == 0)
		{
			set.add(prefix);
			//System.out.println(prefix);
		}
		else
		{
			for(int index = 0; index < length; index++)
			{
				allCombinations(set, prefix + string.charAt(index)
						, string.substring(0, index) + string.substring(index + 1, length));
			}
		}
	}
}
