/* BST is a user-implemented Binary Search Tree.
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Project 3
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/6/15
 */

import java.util.Iterator;

public class BST<T extends Comparable<? super T>> {
	private class BSTNode {
		T element;
		BSTNode left, right;

		public BSTNode() {
			element = null;
			left = null;
			right = null;
		}

		public BSTNode(T element, BSTNode left, BSTNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}
	}

	private BSTNode root;

	/*
	 * Class for a pre-order iterator
	 */
	private class PreIter {
		private BSTNode current;
		
		public PreIter() {
			current = root;
		}
		
		public boolean hasNext() {
			return (current.left != null);
		}
		
		public void next() {
			
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	/*
	 * Class for an in-order iterator
	 */
	private class InIter {
		
		private BSTNode current;
		
		public InIter() {
			current = root;
		}
		
		public boolean hasNext() {
			return (current.left != null);
		}
		
		public void next() {
			
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	/*
	 * Class for a level-order iterator
	 */
	private class LevelIter {

		private BSTNode current;
		
		public LevelIter() {
			current = root;
		}
		
		public boolean hasNext() {
			return (current.left != null);
		}
		
		public void next() {
			
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	public static class MyException extends RuntimeException  {
		public MyException() {}
		
		public MyException(String message) 
		{
			throw new RuntimeException(message);
		}
	}

	public BST() {
		root = null;
	}

	public void insert(T item) {
		// if tree is empty, make new item the root node
		if(isEmpty()) {
			root = new BSTNode(item, null, null);
		}
		
		// if new item is smaller, go to the left
		else if(item.compareTo()) {
			
		}
		
		// if new item is larger, go to the right
		else if() {
			
		}
		
		// otherwise we have duplicate and throw exception
		else {
			
		}
	}


	/*
	 * 
	 */
	public void delete(T item) {

	}

	/*
	 * 
	 */
	public boolean find(T item) {
		return false;

	}


	/*
	 * Checks root to see if tree is empty or not
	 * @return boolean - empty status of the tree
	 */
	public boolean isEmpty() {
		return (root == null);
	}

	/*
	 * Makes tree empty by setting root to null
	 */
	public void makeEmpty()
	{
		root = null;
	}

	/*
	 * Gets the size of the tree
	 * @return int - the number of nodes in the tree.
	 */
	public int size() {
		return size(root);
	}
	
	// recursive support method for above
	private int size(BSTNode current) {
		if(current == null) {
			return 0;
		}
		
		else {
			return (1 + size(current.left) + size(current.right));
		}
	}

	/*
	 * Finds the smallest element in the tree by visiting leftmost
	 * @return T - the smallest element
	 */
	public T findMinimum() {
		if(isEmpty()) {
			throw new MyException();
		}
		
		return findMinimum(root);
	}

	// recursive support method for above
	private T findMinimum(BSTNode current) {
		if(current.left == null) {
			return current.element;
		}
		return findMinimum(current.left);
	}
	
	/*
	 * Finds the largest element in the tree by visiting rightmost
	 * @return T - the largest element
	 */
	public T findMaximum() {
		if(isEmpty()) {
			throw new MyException();
		}
		
		return findMaximum(root);
	}

	// recursive support method for above
	private T findMaximum(BSTNode current) {
		if(current.right == null) {
			return current.element;
		}
		return findMinimum(current.right);
	}
	
	// create pre iterator
	public Iterator<T> iteratorPre() {
		return new PreITer();
	}

	// create in iterator
	public Iterator<T> iteratorIn() {
		return new InIter();
	}

	// create level iterator
	public Iterator<T> iteratorLevel() {
		return new LevelIter();
	}

	/*
	 * Prints all the elements of the tree
	 */
	public void printTree() {
		
	}

	/*
	 * Outputs the tree into a processable string format
	 * @return String - tree formatted as a string
	 */
	public String toString() {

	}
}
