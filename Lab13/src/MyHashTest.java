/* 
 * MyHashTest runs the MyHashTable class
 *
 * @authors Christiana Ushana (cushana) & Devon Grove (djgrove)
 * @version Lab 13
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/13/15
 */

import java.util.*;

public class MyHashTest
{
	public static void main(String[] args)
	{
		// create scanner to take input
		Scanner scanner = new Scanner(System.in);
		
		// prompt user for int input to define size of table
		System.out.println("Input the size for your table.");
		
		// declare Hash Table with determined size
		MyHashTable<Integer>  hashTable = new MyHashTable<Integer>(scanner.nextInt());
		Iterator<Integer> i;

		System.out.println("Choose one of the following operations:");
		System.out.println("-- add an element to the hash table (enter the letter a)");
		System.out.println("-- find an element within the hash table (enter the letter f)");
		System.out.println("-- delete an element from the hash table (enter the letter d)");
		System.out.println("-- check if the hash table is empty (enter the letter e)");
		System.out.println("-- print everything in the hash table (enter the letter p)");
		System.out.println("-- clear the hash table (enter the letter k)");
		System.out.println("-- get the size of the hash table (enter the letter s)");
		System.out.println("-- output the hash table with an iterator (enter the letter o)");
		System.out.println("-- quit (enter the letter q)");
		
		boolean run = true;

		while(run)
		{
			// get user input
			String str = scanner.next();
			char input = str.charAt(0);
			
			switch(input)
			{
				case 'a': 
					System.out.println("What would you like to add to the hash table?");
					int toAdd = scanner.nextInt();
					scanner.nextLine(); // this is done to make sure any extra newlines etc. are thrown away
					hashTable.insert(toAdd);
					System.out.println(toAdd + " added to hash table");
					break;

				case 'f': 
					System.out.println("What integer would you like to find within the hash table?");
					int toFind = scanner.nextInt();
					scanner.nextLine();
					if(hashTable.find(toFind))
					{
						System.out.println("The integer is within the table.");
					}
					else
					{
						System.out.println("The integer is NOT within the table.");
					}
					break;

				case 'd': 
					System.out.println("What integer would you like to delete within the hash table?");
					int toDelete = scanner.nextInt();
					scanner.nextLine();
					hashTable.delete(toDelete);
					System.out.println(toDelete + " has been deleted if it was in the table.");
					break;
					
				case 'e': 
					if(hashTable.isEmpty())
					{
						System.out.println("The table is empty.");
					}
					else
					{
						System.out.println("The table is NOT empty.");
					}
					break;

				case 'p': 
					hashTable.print();
					break;
				case 'k':
					hashTable.makeEmpty();
					break;
				case 's':
					System.out.println("Hash table size is " + hashTable.size());
					break;
				case 'o':
					i = hashTable.iterator();
					System.out.println();
		
					while(i.hasNext()) { 
						System.out.print(i.next() + " "); 
					} 
		  
					// skip a line at the end
					System.out.println(""); 
					break;
				case 'q': 
					System.out.println("quitting");
					run = false;
					break;
			
				default: 
					System.out.println("Invalid choice");
					break;
			}
		}
		scanner.close();
	}
}
