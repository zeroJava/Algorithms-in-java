package dataStructuring.linkindList;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class LinkedListIteration {
	
	private Node head;
	
	public LinkedListIteration()
	{
		head = null;
	}
		
	public void add(String item)
	{
		head = new Node(item, head);
	}
	
	public void remove()
	{
		if(head != null)
		{
			head = head.link;
		}
	}
	
	public Iteration iteration()
	{
		return new Iteration();
	}
	
	public void outPut()
	{
		Node posNode = head;
		while(posNode != null)
		{
			System.out.println(posNode.item + " " + posNode.link);
			posNode = posNode.link;
		}
	}
	
	private class Node
	{
		private String item;
		private Node link;
		
		private Node()
		{
			this.item = null;
			this.link = null;
		}
		
		private Node(String item, Node link)
		{
			this.item = item;
			this.link = link;
		}
		
		public String toString()
		{
			return item + " " + link;
		}
	}// end of node inner class
	
	public class Iteration
	{
		private Node position;
		@SuppressWarnings("unused")
		private Node previous;
		
		public Iteration()
		{
			position = head;
			previous = null;
		}
		
		public void resart()
		{
			position = head;
			previous = null;
		}
		
		public String next()
		{
			if(!hasNext())
			{
				throw new NoSuchElementException();
			}
			
			String toReturn = position.item;
			previous = position;
			position = position.link;
			return toReturn;
		}
		
		public boolean hasNext()
		{
			return (position != null ? true : false); // just did it like because is looks cool
		}
		
	}// end of iteration class
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		LinkedListIteration list = new LinkedListIteration();
		
		System.out.println("Enter words");
		for(int i = 0; i < 5; i++)
		{
			list.add(input.next());
		}
				
		LinkedListIteration.Iteration iteration = list.iteration();
		while(iteration.hasNext())
		{
			System.out.println(iteration.next());
		}
		
		input.close();
	}

}
