public class MySortedList
{
	private class Node
	{
		int element;
		Node link;

		public Node(int element, Node link)
		{
			this.element = element;
			this.link = link;
		}
	}

	private Node head;

	public MySortedList()
	{
		head = null;
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

	public void delete(int item)
	{

	}

	public int max()
	{

	}

	public int min()
	{

	}

	public void print()
	{

	}

	public isEmpty()
	{

	}

}