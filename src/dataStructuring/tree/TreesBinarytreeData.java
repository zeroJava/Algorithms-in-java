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
			/* if no node exist, then we make one */
			return root = new Node(item, null, null);
		}
		else if(item < subRoot.item)
		{
			/* when a node comes into existence, it only has the data(int value), but it doesn't have a subtrees.
			   So we make one, what we are really doing is making an object which will be the value of 
			   subRoot.leftsubtree */
			
			/* when the insert method is executed in the add(5, root) method, the program comes to this section
			   of the if-else, here we forces it to do a recursion(re-run insert method inside the insert method)
			   with the same item value, but with different sub-root argument, which is leftSubtree variable of the
			   previous node(root). 
			   Now forcing it to run again makes it run through the branching mechanism again, and this the first 
			   section(if section) is executed returning a new node for the left subtree section for the 
			   previous node */
			
			/* reusing the insertIntoSubtree, with the leftSubtree variable of the previous node, means we create
			   a another "root node" within a another pocket dimension which turns out to be house in the 
			   previous nodes leftSubtree variable(pocket-verse). 
			   The leftSubtree variable pocket-verse spits out the "root node" of that dimension, only to become the
			   sub node of the main tree (main universe) */
			
			/* Now subRoot.leftSubtree value is new node which is positioned in the left section of the previous
			   node */
			
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
		input.close();
	}

}
