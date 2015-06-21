package dataStructuring.set;

public class SetDataStructure {
	
	private Node head;
	
	public SetDataStructure()
	{
		head = null;
	}
	
	public void add(String item)
	{
		if(!contains(item))
		{
			head = new Node(item, head);
		}
	}
	
	private boolean contains(String item)
	{
		Node temp = head;
		while(temp != null)
		{
			String itemValue = temp.item;
			if(itemValue.equals(item))
			{
				return true;
			}
			temp = temp.link;
		}
		return false;
	}
	
	public void outPut()
	{
		Node posNode = head;
		while(posNode != null)
		{
			System.out.println(posNode.item);
			posNode = posNode.link;
		}
	}
	
	private class Node
	{
		private String item;
		private Node link;
		
		private Node()
		{
			item = null;
			link = null;
		}
		
		private Node(String Item, Node link)
		{
			this.item = Item;
			this.link = link;
		}
	}

	public static void main(String[] args)
	{
		SetDataStructure seT = new SetDataStructure();
		seT.add("Pine");
		seT.add("Dell");
		seT.add("apple");
		seT.add("lychee");
		seT.add("apple");
		seT.outPut();
	}

}
