/* BST is a user-implemented Binary Search Tree.
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Project 3
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/6/15
 */

import java.util.*;

public class BST<T extends Comparable<? super T>>
{
	private class BSTNode
	{
		T element;
		BSTNode left, right;

		public BSTNode()
		{
			element = null;
			left = null;
			right = null;
		}

		public BSTNode(T element, BSTNode left, BSTNode right)
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


	/*
	 * 
	 */
	public void delete(T item)
	{

	}

	/*
	 * 
	 */
	public boolean find(T item)
	{
		return false;

	}


	/*
	 * Checks root to see if tree is empty or not
	 */
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
