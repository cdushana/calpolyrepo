import java.util.*;

public class BST<T extends Comparable<? super T>>
{
	private class BSTNode
	{
		// element of the node
		T element;
		// left and right children of node
		BSTNode left, right;

		// basic constructor
		public BSTNode()
		{
			element = null;
			left = null;
			right = null;
		}

		// constructor with multiple parameters
		public BSTNode(int element, BSTNode left, BSTNode right)
		{
			this.element = element;
			this.left = left;
			this.right = right;
		}
	}

	private BSTNode root;

	private class PreITer
	{
		
	}

	private class InIter
	{

	}

	private class LevelIter
	{

	}

	public static class MyException extends RuntimeException 
	{
		public MyException() {}
		
		public MyException(String message) 
		{
			throw new RuntimeException(message);
		}
	}

	public BST()
	{
		root = null;
	}

	public void insert(T item)
	{
		if(root == null) {
			root = new BSTNode(item, null, null);
		}
		
		// need to iterate over tree
	}

	public void delete(T item)
	{

	}

	public boolean find(T item)
	{

	}

	// Checks root to see if tree is empty or not
	public boolean isEmpty()
	{
		return (root == null);
	}

	// makes the tree empty by setting root to null
	public void makeEmpty()
	{
		root = null;
	}

	public int size()
	{
		if(root == null) {
			return 0;
		}
		
		
	}

	public T findMinimum()
	{
		if(isEmpty()) {
			throw new MyException();
		}
	}

	public T findMaximum()
	{
		if(isEmpty()) {
			throw new MyException();
		}
	}

	public Iterator<T> iteratorPre()
	{
		return new PreIter();
	}

	public Iterator<T> iteratorIn()
	{
		return new InIter();
	}

	public Iterator<T> iteratorLevel()
	{
		return new LevelIter();
	}

	public void printTree()
	{

	}

	public String toString()
	{

	}
}
