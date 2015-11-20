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

public class HashTable {
	
	// class to save objects in the table
	private class HashEntry {
		public Object element; // data in hash entry
		public boolean isActive; // whether entry is active or not

		/*
		 * Creates an entry into hash table using provided data 
		 */
		public HashEntry(Object data) {
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
	public HashTable(int numOfElem) {
		table = new HashEntry[nextPrime(2 * numOfElem)];
		occupiedCells = 0;
	}
	
	/*
	 * Hash function to get hash code and make sure it is an index within the table length
	 * @param Object - the element to add to the hash table
	 */
	private int hash(Object element) {
		int hashCode = element.hashCode() % table.length;
		return hashCode;
	}

	/*
	 * Support method to find the next prime number in the sequence
	 * @param int - the number for which we want to find the next proceeding prime
	 11*/
	private int nextPrime(int num) {
		int i = num + 1;
		
		while(!isPrime(i)) {
			i++;
		}
		
		return i;
	}

	// referenced code from: 
	// http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
	/*
	 * Tests if provided number is prime or not
	 * @param int - the number to check for prime
	 */
	private boolean isPrime(int num) {
		
		// if number is even, it is not prime
		if(num % 2 == 0) {
			return false;
		}
		
		// check all other unique factors of the number
		for(int i = 3; i * i < num; i += 2) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	// iterator for the hash table
	private class Iter implements Iterator
	{
		public int cursor; // current index of iterator, pass over entry if inactive

		public Iter() {
			cursor = 0;
		}

		/*
		 * Check to see if Iter has a next object to visit
		 * @return boolean - whether another object exists or not
		 */
		public boolean hasNext() {
			return false;
		}

		/*
		 * Gets next object in iterator
		 * @return Object - the next object
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

	/*
	 * Adds the given item to the hash table
	 * @param Object - the item to add
	 */
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

	/*
	 * Attempts to find given item in the hash table and returns it
	 * @return Object/null - the object if it was found, null if it was not
	 */
	public Object find(Object item)	{
		
		
		return null;
	}

	/*
	 * Returns the number of elements in the hash table
	 * @return int - the number of elements in the table
	 */
	public int elementCount()
	{
		return 0;
	}

	/*
	 * Determines whether the hash table is empty or not
	 * @return boolean - TRUE if hash table is empty, FALSE if it is not
	 */
	public boolean isEmpty()
	{
		return false;
	}

	/*
	 * Resets the hash table
	 */
	public void makeEmpty()
	{
		
	}

	/*
	 * Prints out the hash table
	 */
	public void printTable()
	{

	}

	/*
	 * Returns a new Iter object
	 * @return Iterator - the new iterator
	 */
	public Iterator iterator()
	{
		return new Iter();
	}
}






















