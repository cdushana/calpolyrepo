public class MyList {
	
	private Node head = new Node();
	
	private class Node {
		public int element;
		public Node link;
		
		// create a new node
		public Node() {
			element = null;
			link = null;
		}
		
		// create a node with link
		public Node(T element, Node link) {
            this.element = element;
            this.link = link;
        }
	}
	
	
	public void add(int newElement) {
		if(head.element == null) {
			head.element == newElement;
		}
		
		else {
			Node new = new Node(element, head);
			head = new;
		}
	}
	
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
	
	public void print() {
		if(head.link == null) {
			System.out.println(head.element + " ");
		}
		
		else {
			print(head.link);
		}
	}
	
	private void print(Node current) {
		if(head.link == null) {
			System.out.println(head.element + " ");
		}
		
		else {
			print(current.link);
		}
	}
	
	public int sum() {
		int sum = 0;
		
		if(head.element == null) {
			return sum
		}
		
		sum += head.element;
		
		if(head.link == null) {
			return sum;
		}
		
		else {
			return ()sum + sum(head.next));
		}
	}
	
	private int sum(Node current) {
		int sum = 0;
		
		sum += current.element;
		
		if(current.link == null) {
			return sum;
		}
		
		else {
			return (sum + sum(current.next));
		}
	}
}
