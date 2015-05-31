package dataStructuring.linkedLis;

public class SingleListnode {
	
	private SingleListnode previous = null;
	private String name;
	private int ID;
	private SingleListnode next = null;
	
	public SingleListnode(String name, int ID)
	{
		addName(name);
		addID(ID);
	}
	
	public void addName(String name)
	{
		this.name = name;
	}
	
	public void addID(int ID)
	{
		this.ID = ID;
	}
	
	public int getID()
	{
		return this.ID;
	}
	
	public String getName()
	{
		return name;
	}
}
