/* MyList is a user-created linked list class
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Lab 8
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/26/15
 */

public class MyList {
	
	private Node head = new Node();
	
	private class Node {
		public int element;
		public Node link;
		
		// create a new node
		public Node() {
			element = 0;
			link = null;
		}
		
		// create a node with element and link
		public Node(int element, Node link) {
        		this.element = element;
        		this.link = link;
		}
	}
	
	// constructs a new MyList object
	public MyList() {
		head = new Node();
	}
	
	// adds a new element to list at new head, linking to previous head node
	public void add(int newElement) {
		// if head has NOT been touched, create the head
		if(head.element == 0 && head.link == null) {
			head.element = newElement;
		}
		
		// otherwise, replace the head with new node and save the link
		else {
			Node newNode = new Node(newElement, head);
			head = newNode;
		}
	}
	
	/*
	 * returns true/false if the provided element was found in the linked list
	 * @param int - the element to find in the linked list
	 * @return boolean - t/f whether or not element was found
	 */

	public boolean find(int findElement) {
		if(head.element == findElement) {
			return true;
		}
		
		else if(head.link == null) {
			return false;
		}
		
		else {
			return find(findElement, head.link);
		}
	}
	
	// support method for public find() method above
	private boolean find(int findElement, Node current) {
		if(current.element == findElement) {
			return true;
		}
		
		else if(current.link == null) {
			return false;
		}
		
		else {
			return find(findElement, current.link);
		}
	}
	
	// prints each element of the linked list
	public void print() {
		if(head.element == 0 && head.link == null) {
	
		}
		
		else if(head.link == null) {
			System.out.println(head.element + " ");
		}
		
		else {
			print(head.link);
			System.out.print(" " + head.element);
		}
	}
	
	// support method for public print() method above
	private void print(Node current) {
		if(current.link == null) {
			System.out.print(current.element);
		}
		
		else {
			print(current.link);
			System.out.print(" " + current.element);
		}
	}
	
	// returns the sum of all the elements of the linked list
	public int sum() {
		int sum = 0;
		
		if(head.element == 0 && head.link == null) {
			return sum;
		}
		
		sum += head.element;
		
		if(head.link == null) {
			return sum;
		}
		
		else {
			return (sum + sum(head.link));
		}
	}
	
	// support method for public sum() method above
	private int sum(Node current) {
		int sum = 0;
		
		sum += current.element;
		
		if(current.link == null) {
			return sum;
		}
		
		else {
			return (sum + sum(current.link));
		}
	}
}
