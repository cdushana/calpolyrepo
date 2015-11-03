import java.util.*;

public class LList<T>
{
	private Node head;

	private class Node {
		public T element;
		public Node link;

		public Node() {
			element = null;
			link = null;
		}

		public Node(T element, Node link) {
			this.element = element;
			this.link = link;
		}
	}

	private class Iter implements Iterator {
		public Node cursor;

		public Iter() {
			cursor = head;
		}

		public boolean hasNext() {
			return (cursor.link != null);
		}

		public T next() {
			// check javadoc for what we do here
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
			
			T item = cursor.element;
            cursor = cursor.link;
            return item;
		}

		// this method is not supported
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	public LList() {
		head = null;
	}

	public Iter iterator() {
		return new Iter();
	}

	// add to end of list, should NOT be using iterator here 
	public void add(T item) {
		if(head == null) {
			head = new Node(item, null);
		}
		
		else {
			Node current = head;
			while(current.link != null) {
				current = current.link;
			}
			
			current.link = new Node(item, null);
		}
	}
}
