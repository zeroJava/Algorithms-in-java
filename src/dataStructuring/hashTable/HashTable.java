package dataStructuring.hashTable;

import dataStructuring.linkindList.LinkedListTut;

public class HashTable {
	
	private LinkedListTut[] hashArray;
	private static final int SIZE = 10; 

	/* HashTable is a data structure that store and retrieves data(item) like lists and sets, but unlike the lists 
	   and sets, the way it interacts(stores & retrieves) with data(item) is different */
	
	/* List and set tend to associate with item(data) the value it holds, in other words the value becomes the 
	   items ID e.g. an item with the value apple will have the ID apple, and item pear will have the ID pear */
	
	/* HashTable doesn't follow the same rule as list and set, instead it the hashTable tends to associate
	   its item with a hash function, in other words is gives each item an ID(hash function) e.g.
	   the item apple is given an ID, which is associates with rather than the value, so item apple with the 
	   value apple is given the value apple, and ID 1001. */
	
	public HashTable()
	{
		hashArray = new LinkedListTut[SIZE];
		for(int index = 0; index < hashArray.length; index++)
		{
			hashArray[index] = new LinkedListTut();
		}
	}
	
	private int createHashValue(String value)
	{
		int hash = 0;
		for(int index = 0; index < value.length(); index++)
		{
			hash += value.charAt(index);
		}
		return hash % SIZE;
	}
	
	public boolean containString(String value)
	{
		int hash = createHashValue(value);
		LinkedListTut list = hashArray[hash];
		if(list.contains(value))
		{
			return true;
		}
		return false;
	}
	
	public void put(String insertValue)
	{
		int hash = createHashValue(insertValue);
		LinkedListTut list = hashArray[hash];
		if(!list.contains(insertValue))
		{
			hashArray[hash].add(insertValue);
		}
	}
	
	public static void main(String[] args)
	{
		HashTable hashTable = new HashTable();
		hashTable.put("frog");
		hashTable.put("donky");
		
		System.out.println(hashTable.containString("frog"));
		System.out.println(hashTable.containString("bird"));
	}

}
