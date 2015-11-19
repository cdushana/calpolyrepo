public class MySortedList
{
	private class Node
	{
		int element;
		Node link;

		public Node()
		{
			this.element = 0;
			this.link = null;
		}
		
		public Node(int element, Node link)
		{
			this.element = element;
			this.link = link;
		}
	}

	private Node head;

	public MySortedList()
	{
		head = new Node();
	}

	public void add(int item)
	{
		// if list is empty, head is now a new node with this new element
		if(isEmpty())
		{
			head = new Node(item, null);	// sets head to new Node
		}
		
		// if new element is the smallest, it's node becomes the new head
		else if(item <= head.element)
		{
			Node newNode = new Node();
			newNode.element = item;
			newNode.link = head;
			head = newNode;
		}
		
		// find where the new element belongs in the list, it gets link of preceding node, preceding node links to it
		else
		{
			Node current = head;

			while(current.link != null && current.link.element < item)
			{
				current = current.link;
			}

			Node newNode = new Node(item, null);

			if(current.link != null)
			{
				newNode.link = current.link;
			}

			current.link = newNode;
		}
	}

	/*
	 * deletes the first occurrence of element provided from the list if it exists
	 * @param int - the element to remove from the list
	 */
	public void delete(int item) {
		
		Node current = head;
		
		// if head is the first match
		if(!isEmpty() && head.element == item) {
			head = head.link;
		}
		
		// iterate through until a match is found or search item becomes bigger than elements
		while(current.link != null && current.link.element <= item)
		{
			
			if(current.link.element == item) {
				current.link = current.link.link;
				break;
			}
			
			current = current.link;
		}
	}

	/*
	 * finds the maximum element of the list
	 * @return int - the largest value of the list
	 */
	public int max() {
		Node current = head;
		
		while(current.link != null) {
			current = current.link;
		}
		
		return current.element;
	}

	/*
	 * finds the minimum element of the list
	 * @return int - the smallest value of the list
	 */
	public int min() {
		return head.element;
	}

	/*
	 * prints out the entire list, separating each element with a space
	 */
	public void print() {
		if(!isEmpty()) {
			Node current = head;
			System.out.print(current.element + " ");
			
			while(current.link != null) {
				current = current.link;
				System.out.print(current.element + " ");
			}
		}
		System.out.println();
	}

	/*
	 * checks whether or not the list is empty
	 * @return boolean - is the list empty or not?
	 */
	public boolean isEmpty() {
		boolean empty = false;
		
		if(head == null || (head.link == null && head.element == 0)) {
			empty = true;
		}
		
		return empty;
	}

}
