package dataStructuring.tree;

import java.util.Scanner;

public class TreesBinarytreeData {
	
	/* A tree is a hierarchical data structure, which is unlike the usual data data structures, the sense it doesn't 
	   function linearly, meaning it doesn't store data in sequence like list, set, array and queues */
	
	/* tree is hierarchical data structure meaning it takes the form of a tree*/

	private Node root;
	
	public TreesBinarytreeData()
	{
		root = null;
	}
	
	public void add(int item)
	{
		root = inserIntoSubtree(item, root);
	}
	
	public boolean contain(int item)
	{
		return isInTheTree(item, root);
	}
	
	public void outPut()
	{
		out(root);
	}
	
	private void out(Node subRoot)
	{
		if (subRoot != null)
        {
            out(subRoot.leftSubtree);
            System.out.print(subRoot.item + " ");
            out(subRoot.rightSubtree);
        }
	}
	
	private Node inserIntoSubtree(int item, Node subRoot)
	{
		if(subRoot == null)
		{
			return root = new Node(item, null, null);
		}
		else if(item < subRoot.item)
		{
			subRoot.leftSubtree = inserIntoSubtree(item, subRoot.leftSubtree);
			return subRoot;
		}
		else
		{
			subRoot.rightSubtree = inserIntoSubtree(item, subRoot.rightSubtree);
			return subRoot;
		}
	}
	
	private boolean isInTheTree(int item, Node subRoot)
	{
		if(subRoot == null)
		{
			return false;
		}
		else if(subRoot.item == item)
		{
			return true;
		}
		else if(item < subRoot.item)
		{
			return isInTheTree(item, subRoot.leftSubtree);
		}
		else
		{
			return isInTheTree(item, subRoot.rightSubtree);
		}
	}
	
	private class Node
	{
		private int item;
		private Node leftSubtree;
		private Node rightSubtree;
		
		private Node()
		{
			item = 0;
			leftSubtree = null;
			rightSubtree = null;
		}
		
		private Node(int item, Node leftSubtree, Node rightSubtree)
		{
			this.item = item; 
			this.leftSubtree = leftSubtree;
			this.rightSubtree = rightSubtree;
		}
	} 
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		TreesBinarytreeData tree = new TreesBinarytreeData();

		System.out.println("Enter a list of nonnegative integers.");
		System.out.println("Place a negative integer at the end.");
		//int next = input.nextInt();
		int i = 0;
		while (i < 100)
		{
			int next = (int)(Math.random()*10000) + 1;
			tree.add(next);
			i++;
			//next = input.nextInt();
		}

		System.out.println("In sorted order:");
		tree.outPut();
	}

}
