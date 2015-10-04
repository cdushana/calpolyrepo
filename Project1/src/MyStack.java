import java.util.*;

public class MyStack<T>
{
	private class Node
	{
		public T element;
		public Node link;
	}

	private Node top;

	public MyStack()
	{
		top = null;
	}

	// - push: a void method with a T type parameter; the parameter object is added on the top of
	// the stack (to the beginning of the linked list).
	public void push(T addThis)
	{
		Node next = new Node();
		next.element = addThis;
		next.link = top; //isnt it null?
		top = next;
	}

	// - pop: has no parameters and returns a T type value; the top element is removed from the
	// stack (the first node of the linked list is deleted) and is returned by the method.
	public T pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException("Invalid operation on an empty stack");
		}
		T topElement = top.element;
		top = top.link;
		return topElement;
	}

	// - peek: has no parameters and returns a T type value – the value of the top element (the first
	// element of the list) – without removing it from the list.
	// If the stack is empty, throws an EmptyStackException type exception
	public T peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException("Invalid operation on an empty stack");
		}
		return top.element;
	}

	// - isEmpty: has no parameters and returns a boolean value – true if the stack is empty, and
	// false otherwise.
	public boolean isEmpty()
	{
		return (top == null);
	}
}
