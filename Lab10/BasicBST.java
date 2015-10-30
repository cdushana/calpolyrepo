import java.util.*;

public class BasicBST
{
	private class BSTNode
	{
		int element;			// element of collection
		BSTNode left, right; 	// left and right children
	}

	private BSTNode root;

	public BSTNode()
	{
		root = null;
	}

	public void insert(int value)
	{
		insert(value, root);
	}
	
	protected void insert(int value, BSTNode root)
	{
		if(root == null)
		{
			root.element = value;
		}
		else if()
	}

	public int countOdds()
	{

	}
	
	protected int countOdds()
	{
		
	}
	
	public int height()
	{

	}
	
	protected int height()
	{
		
	}

	public int countLeaves()
	{

	}
	
	protected int countLeaves()
	{
		
	}

	public int countOneChildParents()
	{

	}
	
	protected int countOneChildParents()
	{
		
	}
}
