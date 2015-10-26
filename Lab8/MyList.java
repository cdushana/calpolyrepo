public class MyList {
	
	private Node head;
	
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
		
	}
	
	public boolean find(int findElement) {
		return find(findElement, head);
	}
	
	private boolean find(int findElement, Node first) {
		
	}
	
	public void print() {
		
	}
	
	private void print(Node first) {
		
	}
	
	public int sum() {
		
	}
	
	private int sum(Node first) {
		
	}
}
