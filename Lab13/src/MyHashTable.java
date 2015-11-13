import java.util.*;

public class MyHashTable<T>
{
	// array of LinkedList<T> type objects
	public LinkedList<T>[] array;

	// constructor: creates array of LL objects of given size 
	//  and initializes components to empty lists
	public MyHashTable(int size) {
		array =  (LinkedList<T>[]) new LinkedList[size];

		// initialize each component to empty list
		for(int i = 0; i < array.length; i++) {
			array[i] = new LinkedList<T>();
		}
	}

	// returns int value - the hash value of the parameter - object for your table
	// obtain hasCode of param object, take val and get modulus over array.length
	private int hash(T item) {
		return item.hashCode() % array.length;
	}

	public void insert(T item) {
		array[hash(item)].addFirst(item);
	}

	public void delete(T item) {
		array[hash(item)].remove(item);
	}

	public boolean find(T item) {
		return array[hash(item)].contains(item);
	}

	public boolean isEmpty()
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].size() > 0)
			{
				return false;
			}
		}

		return true;
	}

	public void print()
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(i + ": ");
			for(int j = 0; j < array[i].size(); j++)
			{
				System.out.print(array[i].get(j) + " ");
			}
			System.out.println();
		}
	}
	
	/*
	 * Resets the hash table by clearing all linked lists
	 */
	public void makeEmpty() {
		// reset each array element to empty linked list
		for(int i = 0; i < array.length; i++) {
			array[i] = new LinkedList<T>();
		}
	}
	
	/*
	 * Returns the size of the hash table by getting the number of elements
	 * @return int - the number of elements in the table
	 */
	public int size() {
		return 0;
	}
	
	/*
	 * Class for a hash table iterator
	 */
	private class Iter implements Iterator {
		// track the element in hash table to visit next
		private int i;
		private int j;
		
		// creates preorder iterator
		public Iter() {
		}
		
		/*
		 * uses iterator to determine if there is a next value, boolean output
		 */
		public boolean hasNext() {
		}
		
		/*
		 *	uses iterator to output what the next value is, T output
		 */
		public T next() {
			return null;
		}
		
		// not allowed
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}