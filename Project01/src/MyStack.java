/* The generic class MyStack<T> has been developed
 * to represent a stack implemented with a Linked List.
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Program 1
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/9/15
 */

import java.util.*;

public class MyStack<T>
{
	// this subclass declares what makes a Node
	private class Node
	{
		public T element;
		public Node link;
	}

	// private variable, top, is of type Node and represents
	// the top most value of the stack
	private Node top;

	// constructor that declares a new stack with top of the stack set to null
	public MyStack()
	{
		// top has been initialized to null
		top = null;
	}

	/**
	 * Void method that adds the parameter object to the top of the stack
	 * (beginning of the linked list).
	 *
	 * @param addThis - the T type parameter added to the top of the stack
	 */
	public void push(T addThis)
	{
		// declaration of new Node to hold data
		Node next = new Node();

		// next holds the parameter value
		next.element = addThis;

		// initialize link to null
		next.link = top;

		// new node assigned to top of the stack
		top = next;
	}

	/**
	 * Method that removes to the top most element from the stack
	 *
	 * @return T type value; top of stack is removed then returned
	 */
	public T pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}

		// temporarily holds the value of the element to be popped
		T topElement = top.element;

		// link is reassinged 
		top = top.link;
		return topElement;
	}

	/**
	 * Method that returns the value of the top most element without removing it from the list
	 *
	 * @throws EmptyStackExcpetion if stack is empty
	 * @return T type value; top of stack is returned
	 */
	public T peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return top.element;
	}

	/**
	 * Method that returns the status of the stack (empty/not empty).
	 *
	 * @return boolean type value; true = empty, false = not empty
	 */
	public boolean isEmpty()
	{
		return (top == null);
	}
}
