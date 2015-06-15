package dataStructuring.linkindList;

public class LinkedListTut {
	
	private Nodee head;
	
	public LinkedListTut()
	{
		head = null;
	}
	
	public void add(int count, String item)
	{
		head = new Nodee(count, item, head);
		/* by doing this, we are overriding head with a new value, but we are also backing up the previous value
		 * of head in the nodee(head) argument as links 
		 
		 * basically when linked list comes into exists(executed), it comes with an empty node(head), and decides
		 * there needs to be more nodes So using the addStart power, it creates another node, and saves(backs up) 
		 * the previous node(data), by creating a link(kind of DNA), which when harnessed(getLink) takes you to 
		 * the previous node */
	}
	
	public void deleteItemFromList()
	{
		if(head != null)
		{
			head = head.getLink();
			/* we are overriding the value of head with its previous value, which has been backed up as a link.
			 
			 * getLink() acts as the magical DNA, when harnessed(executed) magically teleport's as to get the 
			 * ancestor of the current node: the previous node. 
			 
			 * using this method we're allowing evil previous head(item: node) absorbs the current head, killing it, 
			 * and taking its position as the current value of head */
		}
	}
	
	public boolean contains(String item)
	{
		return (findNode(item) != null ? true : false);
	}
	
	public Nodee findNode(String item )
	{
		Nodee node = head;
		while(node != null)
		{
			if(node.getItem().equals(item))
			{
				return node; 
			}
			node = node.getLink();
		}
		return null;
	}
	
	public boolean isListEmpty()
	{
		return (numberOfItems() == 0 ? true : false);
	}
	
	public int numberOfItems()
	{
		int count = 0;
		Nodee node = head;
		while(node != null)
		{
			count++;
			node = node.getLink(); // overriding node value of previous data that getlink() backed up
			// getlink() act kind of like a back, because it hold the reference to the previous item(node)
		}
		return count;
	}
	
	public void clear()
	{
		while(head != null)
		{
			head = head.getLink();
			/* heads first point when given life is null, but since we've been giving it values; so when we use it
			 * now, it will holding the latest value e.g item(node): banana
			
			 * using the method, we are kind of doing a time reversal, meaning the current value of head is
			 * being absorbed by its ancestor, and this will continue until we come to the first point */
		}
	}
	
	public void outPutList()
	{
		Nodee position = head;
		while(position != null)
		{
			System.out.println(position.getCount() + " " + position.getItem() + " " + position.getLink());
			position = position.getLink();
		}
	}
	
	public static void main(String[] args)
	{
		LinkedListTut linkeddListtt = new LinkedListTut();
		System.out.println(linkeddListtt.isListEmpty());
		linkeddListtt.add(45, "Apples");
		linkeddListtt.add(75, "Tree");
		linkeddListtt.add(25, "Cat");
		linkeddListtt.outPutList();
		System.out.println(linkeddListtt.contains("Apples"));
		System.out.println(linkeddListtt.isListEmpty());
		linkeddListtt.clear();
		linkeddListtt.outPutList();
		
		GenericLinkedListt<String> gLinkedList = new GenericLinkedListt<String>();
		gLinkedList.addToList("Donket");
		gLinkedList.addToList("king");
		gLinkedList.addToList("frog");
		gLinkedList.outPutList();
	}

}
