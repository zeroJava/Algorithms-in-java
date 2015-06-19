package dataStructuring.linkindList;

public class DoubleLinkedLis {

	private Node head;
	
	public DoubleLinkedLis()
	{
		head = null;
	}
	
	public void add(String item)
	{
		Node tempHead = new Node(item, null, head);
		/* we are making a temp which will contain the value, and act as a place to decide in how it will be used 
		   
		   basically here we know the future, but we do not know the past */
		if(head != null)
		{
			head.previous = tempHead; 
			/* we some how have a future without a past.
			 * so the past become the present value from our pocket universe tempHead */
		}
		head = tempHead; // tempHead also become the present
	}
	
	public void remove()
	{
		if(head != null)
		{
			head = head.previous;
		}
	}
	
	public void outPut()
	{
		Node pus = head;
		while(pus != null)
		{
			System.out.println(pus.item);
			pus = pus.next;
		}
	}
	
	private class Node
	{
		private String item;
		private Node previous;
		private Node next;
		
		private Node()
		{
			this.item = null;
			this.previous = null;
			this.next = null;
		}
		
		private Node(String item, Node previous, Node next)
		{
			this.item = item;
			this.previous = previous;
			this.next = next;
		}
		
		public String toString()
		{
			return item ;
		}
	}
	
	public static void main(String[] args)
	{
		DoubleLinkedLis list = new DoubleLinkedLis();
		list.add("apple");
		list.add("pear");
		list.add("lychee");
		list.outPut();
	}

}
