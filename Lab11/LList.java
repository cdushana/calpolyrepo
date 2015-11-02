public class LList<T>
{
	private Node head;

	private class Node
	{
		public T element;
		public Node link;

		public Node()
		{
			element = null;
			link = null;
		}

		public Node(T element, Node link)
		{
			this.element = element;
			this.link = link;
		}
	}

	private class Iter
	{
		public Node cursor;

		public Iter()
		{
			cursor = head;
		}

		public boolean hasNext()
		{

		}

		public T next()
		{

		}

		// remove method not supported...
		public void remove()
		{

		}

	}

	public LList()
	{
		head = null;
	}

	public void iterator()
	{

	}

	public void add(T item) // add to end of list, should NOT be using iterator here
	{

	}

}