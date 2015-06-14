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
		
	}// end of inner class
	
	public void addToList(String item)
	{
		head = new GeNode<String>(item, head);
	}

	public void deletetem()
	{
		
	}
}
