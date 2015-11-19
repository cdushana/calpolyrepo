/* 
 * Hash Table represents a generic Hash Table ADT.
 *
 * @authors Christiana Ushana (cushana) & Devon Grove (djgrove)
 * @version Program 4
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/20/15
 */

import java.util.*;
import java.lang.Math;

public class HashTable
{
	/*
	 * class of which objects are saved in the table.
	 */
	private class HashEntry
	{
		public Object element; // data in hash entry
		public boolean isActive; // whether entry is active or not

		/*
		 * Creates an entry into hash table using provided data 
		 */
		public HashEntry(Object data)
		{
			element = data;
			isActive = true;
		}
	}

	private HashEntry table[]; 	// store the table
	private int occupiedCells; // # of occupied cells in hash table (active and inactive)

	/*
	 * constructor to create an empty hash table
	 * @param numOfElem - number of elements in the collection (NOT table size)
	 */
	public HashTable(int numOfElem)
	{
		table = new HashEntry[nextPrime(2 * numOfElem)];
		occupiedCells = 0;
	}

	// private support method to find next prime number
	private int nextPrime(int size)
	{
		int i = size + 1; // TODO: Should this check the original number first? (No + 1)
		while(!isPrime(i))
		{
			i++;
		}
		return i;
	}

	// referenced code from: 
	// http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
	// private support method to find next prime number
	private boolean isPrime(int num)
	{
		if(num % 2 == 0)
		{
			return false;
		}
		for(int i = 3; i * i < num; i += 2)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	// iterator for the hash table
	private class Iter implements Iterator
	{
		public int cursor; // current index of iterator, pass over entry if inactive

		/*
		 * Creates a new iterator
		 */
		public Iter()
		{
			cursor = 0;
		}

		/*
		 * Check to see if Iter has a next object to visit
		 */
		public boolean hasNext()
		{
			return false;
		}

		/*
		 * Gets next object in iterator
		 */
		public Object next()
		{
			if(!hasNext()) {
				throw new NoSuchElementException("Iterator did not have another element");
			}
			
			return null;
		}

		// not supported
		public void remove() {
			throw new UnsupportedOperationException("Iter.remove() is an unsupported function");			
		}
	}

	// adds item to the table
	public void insert(Object item)
	{
		// nothing will be done if item is already in table & active
		// does not allow duplicates

	}

	/*
	 * Removes the given item from the table
	 * @param Object - the item to remove from table
	 */
	public void delete(Object item)
	{

	}

	public Object find(Object item)
	{
		return null;
	}

	public int elementCount()
	{
		return 0;
	}

	public boolean isEmpty()
	{
		return false;
	}

	public boolean makeEmpty()
	{
		return false;
	}

	public void printTable()
	{

	}

	public Iterator iterator()
	{
		return new Iter();
	}
}






















