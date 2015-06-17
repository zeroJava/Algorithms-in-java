package dataStructuring.linkindList;

public class GenericLinkedListt<T> {
	
	private GeNode<String> head;
	
	private class GeNode<T>
	{
		private T item;
		private GeNode<T> link;
		
		private GeNode()
		{
			this.item = null;
		}
		
		private GeNode(T item, GeNode<T> link)
		{
			this.item = item;
			this.link = link;
		}
		/* the outer class has access to all the variables and constructor of the inner class, even though 
		 * the access type is private. This because the outer class to everything */
		
		public String toString()
		{
			return item + " " + link;
		}
	}// end of inner class
	
	public void addToList(String item)
	{
		head = new GeNode<String>(item, head);
	}

	public void deletetem()
	{
		if(head != null)
		{
			head = head.link;
		}
		else
		{
			System.out.println("Nothing to delete");
		}
	}
	
	public boolean contain(String item)
	{
		return (find(item) != null ? true : false);
	}
	
	public GeNode<String> find(String item)
	{
		while(head != null)
		{
			if(head.item.equals(item))
			{
				return head;
			}
			head = head.link;
		}
		return null;
	}
	
	public void outPutList()
	{
		GeNode<String> position = head;
		while(position != null)
		{
			System.out.println(position.item + " " + position.link);
			position = position.link;
		}
	}
}
