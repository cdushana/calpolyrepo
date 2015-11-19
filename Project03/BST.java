/* 
 * BST is a user-implemented Binary Search Tree.
 *
 * @authors Christiana Ushana (cushana) & Devon Grove (djgrove)
 * @version Program 3
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/6/15
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BST<T extends Comparable<? super T>> {
	private class BSTNode {
		// delcares element of BSTNode
		T element;
		// defines left and right nodes of the BST
		BSTNode left, right;

		// creates BSTNode with everything set to null
		public BSTNode() {
			element = null;
			left = null;
			right = null;
		}

		// creates BSTNode with everything set to what user wishes
		public BSTNode(T element, BSTNode left, BSTNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}
	}

	// sets root for tree
	private BSTNode root;

	/*
	 * Class for a pre-order iterator
	 */
	private class PreIter implements Iterator {
		// creates new stack for iterator
		private MyStack<BSTNode> iterStack = new MyStack<BSTNode>();
		
		// creates preorder iterator
		public PreIter() {
			// if the BST has nodes, push the root to iterator
			if(!isEmpty()) {
				iterStack.push(root);
			}
		}
		
		/*
		 * uses iterator to determine if there is a next value, boolean output
		 */
		// if iterStack is empty, we are at the end
		public boolean hasNext() {
			if(iterStack.isEmpty()) {
				return false;
			}
		
			else {
				return true;
			}
		}
		
		/*
		 *	uses iterator to output what the next value is, T output
		 */
		public T next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
			
			BSTNode current = iterStack.pop();
			
			if(current.right != null) {
				iterStack.push(current.right);
			}
			if(current.left != null) {
				iterStack.push(current.left);
			}
			
			return current.element;
		}
		
		// not allowed
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	/*
	 * Class for an in-order iterator
	 */
	private class InIter implements Iterator {
		// creates new stack for iterator
		private MyStack<BSTNode> iterStack = new MyStack<BSTNode>();
		
		// creates in order iterator
		public InIter() {
			// if the BST has nodes, push the root to iterator first
			if(!isEmpty()) {
				iterStack.push(root);
				
				BSTNode current = root;
				
				// traverse the tree to leftmost element
				while(current.left != null) {
					iterStack.push(current.left);
					current = current.left;
				}
			}
		}
		
		/*
		 * uses iterator to determine if there is a next value, boolean output
		 */
		// if iterStack is empty, we are at the end
		public boolean hasNext() {
			if(iterStack.isEmpty()) {
				return false;
			}
		
			else {
				return true;
			}
		}
		
		/*
		 *	uses iterator to output what the next value is, T output
		 */
		public T next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
			
			BSTNode current = iterStack.pop();
			
			if(current.right != null) {
				iterStack.push(current.right);
				// i think its missing something here
			}
			
			return current.element;
		}
		
		// not allowed
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	/*
	 * Class for a level-order iterator
	 */
	private class LevelIter implements Iterator {
		// creates new stack for iterator
		private LQueue<BSTNode> iterQueue = new LQueue<BSTNode>();
		
		// creates level order iterator
		public LevelIter() {
			// if the BST has nodes, push the root to iterator first
			if(!isEmpty()) {
				iterQueue.enqueue(root);
			}
		}
		
		/*
		 * uses iterator to determine if there is a next value, boolean output
		 */
		// if iterStack is empty, we are at the end
		public boolean hasNext() {
			if(iterQueue.isEmpty()) {
				return false;
			}
			else
			{
				return true;
			}
		}
		
		/*
		 *	uses iterator to output what the next value is, T output
		 */
		public T next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
			
			BSTNode current = iterQueue.dequeue();
			
			if(current.left != null) {
				iterQueue.enqueue(current.left);
			}
			if(current.right != null) {
				iterQueue.enqueue(current.right);
			}
			
			return current.element;
		}
		
		// not allowed
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	/*
	 * User-created exception class for exceptions in this class
	 */
	public static class MyException extends RuntimeException  {
		public MyException() {}
		
		public MyException(String message) 
		{
			throw new RuntimeException(message);
		}
	}

	/*
	 * Creates a new Binary Search Tree, initializing root to null
	 */
	public BST() {
		root = null;
	}

	/*
	 * Inserts a given item into the appropriate location in the tree
	 * @param T - element to be inserted
	 */
	public void insert(T item) {
		root = insert(item, root);
	}
	
	// recusive support method for above
	private BSTNode insert(T item, BSTNode current) {
		// if current node does not exist, make new node for item
		if(current == null) {
			current = new BSTNode(item, null, null);
		}
		
		// if new item is smaller, go to the left
		else if(item.compareTo(current.element) < 0) {
			current.left = insert(item, current.left);
		}
	
		// if new item is larger, go to the right
		else if(item.compareTo(current.element) > 0) {
			current.right = insert(item, current.right);
		}
		
		// otherwise we have duplicate and throw exception
		else {
			throw new MyException("Duplicate item");
		}
		
		return current;
	}


	/*
	 * Attempts to delete the given element from the tree, if it is present
	 * @param T - the element to delete from the tree;
	 */
	public void delete(T item) {
		root = delete(item, root);
	}
	
	// recursive support method for above
	private BSTNode delete(T item, BSTNode current) {
		// if current is null, nothing new to return
		if(current != null)
		{
			// if item is smaller, go left
			if(item.compareTo(current.element) < 0)
			{
				current.left = delete(item, current.left);
			}
			// if item is larger, go right
			else if(item.compareTo(current.element) > 0)
			{
				current.right = delete(item, current.right);
			}
			else
			{
				// get smallest of right subtree, then delete this node
				if(current.left != null && current.right != null)
				{
					current.element = findMinimum(current.right);
					current.right = delete(current.element, current.right);
				}
				//if only left child, replace with this
				else if(current.left != null  && current.right == null)
				{
					current = current.left;
				}
				// if only right child, replace with this
				else if(current.left == null && current.right != null)
				{
					current = current.right;
				}
				else
				{
					// if no children, delete node by setting to null
					current = null;
				}
			}
		}
		return current;
	}

	/*
	 * Searches the tree for the given item and returns true if it was found
	 * @param T - item to search for
	 * @return bool - whether the item was found or not
	 */
	public boolean find(T item) {
		return find(item, root);
	}
	
	// recursive support method for above
	private boolean find(T item, BSTNode current) {
		// if we are still looking and current node is null, wasn't found
		if(current == null) {
			return false;
		}
		
		// if element is equal, we are found
		else if(item.compareTo(current.element) == 0) {
			return true;
		}
		
		// if element is smaller than current node, go left
		else if(item.compareTo(current.element) < 0) {
			return find(item, current.left);
		}
		
		// element is bigger than current node, go right
		else {
			return find(item, current.right);
		}
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
		else
		{
			return findMaximum(current.right);
		}
	}
	
	/*
	 * creates a pre order iterator
	 */
	public Iterator<T> iteratorPre() {
		return new PreIter();
	}

	/*
	 * creates an in order iterator
	 */
	public Iterator<T> iteratorIn() {
		return new InIter();
	}

	/*
	 * Creates a level order iterator
	 */
	public Iterator<T> iteratorLevel() {
		return new LevelIter();
	}

	/*
	 * Prints all the elements of the tree
	 */
	public void printTree() {
		printTree(root, "");
	}

	// recursive support method for above
	private void printTree(BSTNode root, String indent)
	{
		if(root != null)
		{
			System.out.println(indent + root.element);
			printTree(root.left, indent + "    ");
			printTree(root.right, indent + "    ");
		}
	}

	/*
	 * Outputs the tree into a processable string format
	 * @return String - tree formatted as a string
	 */
	public String toString() {
		return toString("", root);
	}
	
	// recursive support method for above
	private String toString(String str, BSTNode current) {
		if(current != null) {
			str = current.element + " " + toString(str, current.left) + toString(str, current.right);
		}
		
		return str;
	}
}
