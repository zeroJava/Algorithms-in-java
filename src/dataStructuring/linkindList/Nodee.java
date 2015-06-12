package dataStructuring.linkindList;

public class Nodee {
	
	private int count;
	private String item;
	private Nodee link;
	
	public Nodee()
	{
		setCount(0);
		setItem(null);
		setLink(null);
	}
	
	public Nodee(int count, String item, Nodee link)
	{
		setCount(count);
		setItem(item);
		setLink(link);
	}
	
	
	public int getCount()
	{
		return count;
	}


	public void setCount(int count)
	{
		this.count = count;
	}


	public String getItem()
	{
		return item;
	}


	public void setItem(String item)
	{
		this.item = item;
	}


	public Nodee getLink()
	{
		return link;
	}


	public void setLink(Nodee link)
	{
		this.link = link;
	}


	public String toString()
	{
		return count + " " + item;
	}
}
