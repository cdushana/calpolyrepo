/* 
 * MyHashTable is a user-implemented hash table
 *
 * @authors Christiana Ushana (cushana) & Devon Grove (djgrove)
 * @version Program 3
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/6/15
 */

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

	/*
	 * Obtain the hash code of the given element
	 * @param T - the object to obtain hash code for
	 * @return int - hash value of the parameter for the table
	 */
	private int hash(T item) {
		return item.hashCode() % array.length;
	}

	/*
	 * Inserts the given item into the appropriate hash value of the table
	 * @param T - element desired to add
	 */
	public void insert(T item) {
		array[hash(item)].addFirst(item);
	}

	/*
	 * Attempts to delete the given item from the hash table if it exists
	 * @param T - the element desired to delete
	 */
	public void delete(T item) {
		array[hash(item)].remove(item);
	}

	/*
	 * Attempts to find the given item in the hash table and returns true if found
	 * @param T - the element to attempt to find
	 * @return boolean - whether the item could be found or not
	 */
	public boolean find(T item) {
		return array[hash(item)].contains(item);
	}

	/*
	 * Checks if the hash table is empty
	 * @boolean - whether the hash table is empty or not
	 */
	public boolean isEmpty()
	{
		for(int i = 0; i < array.length; i++) {
			if(array[i].size() > 0) {
				return false;
			}
		}

		return true;
	}

	/*
	 * Prints the hash table
	 */
	public void print() {
		for(int i = 0; i < array.length; i++) {
			System.out.print(i + ": ");
			
			for(int j = 0; j < array[i].size(); j++) {
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
		int elements = 0;
		
		for(int i = 0; i < array.length; i++) {
			elements = elements + array[i].size();
		}
		
		return elements;
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
			
			// find first non-empty linked list
			for(int k = 0; i < array.length; i++) {		
				if(!array[k].isEmpty()) {
					i = k;
					break;
				}
			}
			
			int j = 0;
		}
		
		/*
		 * uses iterator to determine if there is a next value, boolean output
		 * @return boolean - whether iterator has a next value or not
		 */
		public boolean hasNext() {
			if(i < array.length) {
				return true;
			}
			
			return false;		
		}
		
		
		/*
		 * uses iterator to output what the next value is, T output
		 * @return T - the next element output by the iteraotr
		 */
		public T next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
			
			// get the current element iteraotr is on to return later
			T element = array[i].get(j);
			
			//increment j if still in same linked list
			if(j < (array.length - 1)) {
				j++;
			}
			
			// skip to next i value and reset j
			else {
				j = 0;
				i++;
				for(int k = 0; k < array.length; k++) {
					
					if(!array[i].isEmpty()) {
						i = k;
						break;
					}
				}
			}
			
			return element;
		}
		
		// not allowed
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
	public Iterator<T> iterator() {
		return new Iter();
	}
}