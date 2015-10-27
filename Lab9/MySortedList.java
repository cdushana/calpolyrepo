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
		// case: list is empty, head needs to be set to a point 
		// to a new node containing item
		// item is <= to the value in the first node. Item needs
		// to be added to the front of list which will cause
		// head to change

		if(isEmpty())
		{
			head = new Node(item, null);	// sets head to new Node
		}
		else if(item <= head.element)
		{
			Node temp = new Node();
			temp.element = item;
			temp.link = head;
			head = temp;
		}
		else
		{
			Node current = head;

			while(current.next != null && current.next.element < item)
			{
				current = current.next;
			}

			Node temp = new Node(item, null);

			if(current.next != null)
			{
				temp.next = current.next;
			}

			current.next = temp; 		// reset current to new Node

		}
	}

	/*
	 * deletes the first occurrence of element provided from the list if it exists
	 * @param int - the element to remove from the list
	 */
	public void delete(int item) {

	}

	/*
	 * finds the maximum element of the list
	 * @return int - the largest value of the list
	 */
	public int max() {

	}

	/*
	 * finds the minimum element of the list
	 * @return int - the smallest value of the list
	 */
	public int min() {

	}

	/*
	 * prints out the entire list, separating each element with a space
	 */
	public void print() {

	}

	/*
	 * checks whether or not the list is empty
	 * @return boolean - is the list empty or not?
	 */
	public boolean isEmpty() {

	}

}