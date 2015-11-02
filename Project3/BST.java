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

	}

	public void delete(T item)
	{

	}

	public boolean find(T item)
	{

	}

	public boolean isEmpty()
	{
		return (root == null);
	}

	public void makeEmpty()
	{

	}

	public int size()
	{

	}

	public T findMinimum()
	{

	}

	public T findMaximum()
	{

	}

	public Iterator<T> iteratorPre()
	{

	}

	public Iterator<T> iteratorIn()
	{

	}

	public Iterator<T> iteratorLevel()
	{

	}

	public void printTree()
	{

	}

	public String toString()
	{

	}




}