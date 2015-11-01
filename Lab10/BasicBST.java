/* BasicBST creates a Basic Binary Tree with different methods.
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Lab 10
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/1/15
 */

import java.util.*;

public class BasicBST
{
	private class BSTNode
	{
		int element;			// element of collection
		BSTNode left, right; 	// left and right children
	}

	private BSTNode root;

	public BasicBST()
	{
		root = null;
	}

	public void insert(int value)
	{
		root = insert(value, root);
	}
	
	protected BSTNode insert(int value, BSTNode node)
	{
		if(node == null)
		{
			node = new BSTNode();
			node.element = value;
		}
		else
		{
			if(node.element > value)
			{
				node.left = insert(value, node.left);
			}
			else if(node.element < value)
			{
				node.right = insert(value, node.right);
			}
		}
		return node;
	}

	public int countOdds()
	{
		return countOdds(root);
	}
	
	protected int countOdds(BSTNode node)
	{
		if(node == null)
		{
			return 0;
		}

		if(node.element % 2 != 0)
		{
			return countOdds(node.left) + countOdds(node.right) + 1;
		}

		return countOdds(node.left) + countOdds(node.right);
	}
	
	public int height()
	{
		return height(root);
	}
	
	protected int height(BSTNode node)
	{
		if(node == null)
		{
			return -1;
		}

		int leftHeight = height(node.left);
		int rightHeight = height(node.right);

		if(leftHeight > rightHeight)
		{
			return leftHeight + 1;
		}
		else
		{
			return rightHeight + 1;
		}
	}

	public int countLeaves()
	{
		return countLeaves(root);
	}
	
	protected int countLeaves(BSTNode node)
	{
		int leaves = 0;

		if(node == null)	// return 0 if there are no leaves
		{
			leaves = 0;
		}
		else if(node.left == null && node.right == null)		// return 1 if there is only one node
		{
			leaves = 1;
		}
		else											
		{
			leaves = countLeaves(node.left) + countLeaves(node.right);		// recursively add together all nodes
		}

		return leaves;
	}

	public int countOneChildParents()
	{
		return countOneChildParents(root);
	}
	
	protected int countOneChildParents(BSTNode node)
	{
		if(node == null)
		{
			return 0;
		}
		else if(node.left != null && node.right != null)
		{
			return countOneChildParents(node.left) + countOneChildParents(node.right);
		}
		else if(node.left == null && node.right == null)
		{
			return 0;
		}
		else if(node.left != null)
		{
			return 1 + countOneChildParents(node.left);
		}
		else
		{
			return 1 + countOneChildParents(node.right);
		}
	}
}
