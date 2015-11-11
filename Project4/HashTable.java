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
		// element aspect of Hash Entry - data
		public Object element;
		// boolean aspect of Hash Entry - is active or not
		public boolean isActive;

		// check
		// constructor to create an entry into the hash table
		public HashEntry(Object entry)
		{
			element = entry;
			isActive = true;
		}
	}

	// array of objects to hold the table
	private HashEntry table[];
	// int var to hold # of occupied cells in table (active and inactive)
	private int occupiedCells;

	/*
	 * constructor to create an empty hash table
	 * @param numOfElem - number of elements in the collection (NOT table size)
	 */
	public HashTable(int numOfElem)
	{
		table = new HashEntry[nextPrime(2 * numOfElem)];
		occupiedCells = 0;
	}

	// check
	private int nextPrime(int size)
	{
		int i = size + 1;
		while(!isPrime(i))
		{
			i++;
		}
		return i;
	}

	// referenced code from: 
	// http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
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

	// incomplete
	/*
	 *
	 */
	private class Iter implements Iterator
	{
		// index of an array cell (active entry)
		// if inactive, pass over entry
		public int cursor;

		// costructs new iterator
		public Iter()
		{
			cursor = 0;
		}

		// 
		public boolean hasNext()
		{
			return false;
		}

		//
		public Object next()
		{
			return null;
		}
	}

	// adds item to the table
	public void insert(Object item)
	{
		// nothing will be done if item is already in table & active
		// does not allow duplicates

	}

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






















