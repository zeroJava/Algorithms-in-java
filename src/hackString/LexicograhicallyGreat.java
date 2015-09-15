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
		for(int i = 0; i < 1; i++)
		{
			//System.out.println(i);
			biggerIsGreater("dkhwsdfgbnmrfgthujkldcfghjoiuytrdfgtpklkcj");
		}
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
		set.add(string);
		halfPremintion(set, string, string);
		
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
	
	public static void halfPremintion(Set<String> set, String string, String original)
	{
		if(string.length() < 8)
		{
			allCombinations(set, "", string, original);
		}
		else
		{
			int point = string.length() - 4;
			String firstSection = string.substring(0, point);
			String secondSection = string.substring(point);
			List<String> tempList = new ArrayList<String>();
			getAllComninations(tempList, "", secondSection, original);
			
			for(String str : tempList)
			{
				
				String value = firstSection + str;
				
				if(value.compareTo(original) > 0)
				{
					set.add(value);
				}
			}
		}
	}
	
	private static void getAllComninations(List<String> list, String prefix, String string, String original)
	{
		
		int length = string.length();
		if(length == 0)
		{
			list.add(prefix);
		}
		else
		{
			for(int in = 0; in < length; in++)
			{
				getAllComninations(list, prefix + string.charAt(in)
						, string.substring(0, in) + string.substring(in + 1, length), original);
			}
			
		}
	}
	
	public static void allCombinations(Set<String> set, String prefix, String string, String oringinal)
	{
		int length = string.length();
		
		if(length == 0)
		{
			if(prefix.compareTo(oringinal) > 0)
			{
				set.add(prefix);
			}
			//System.out.println(prefix);
		}
		else
		{
			for(int index = 0; index < length; index++)
			{
				allCombinations(set, prefix + string.charAt(index)
						, string.substring(0, index) + string.substring(index + 1, length), oringinal);
			}
		}
	}
		
	public static void randomlyChosen(Set<String> set, String original)
	{
		Random random = new Random();
		char[] array = original.toCharArray();
		
		for(int iteration = 0; iteration < 1000; iteration++)
		{
			int firstIndex = random.nextInt(array.length);
			int secondIndex = random.nextInt(array.length);
			
			if(firstIndex == secondIndex)
			{
				iteration--;
			}
			else
			{
				char temp1 = array[firstIndex];
				char temp2 = array[secondIndex];
				array[firstIndex] = temp2;
				array[secondIndex] = temp1;
				
				String newString = new String(array);
				if(newString.compareTo(original) > 0)
				{
					set.add(newString);
				}
			}
		}
	}
}
