/* MyListDriver tests implementation of MyList.
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Lab 8
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/26/15
 */

import java.util.*;

public class MyListDriver {
	
	public static void main(String[] args) {
		MySortedList list = new MySortedList();
		
		System.out.println("Choose one of the following operations:");
		System.out.println("-- add an element to the list (enter the letter a)");
		System.out.println("-- delete first occurence of given element from the list (enter the letter d)");
		System.out.println("-- find the maxiumum value in the list (enter the letter x)");
		System.out.println("-- find the minimum value in the list (enter the letter m)");
		System.out.println("-- print the list (enter the letter p)");
		System.out.println("-- check if the list is empty (enter the letter e)");
		System.out.println("-- quit (enter the letter q)");
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;

		while(run)
		{
			// get user input
			String str = scanner.next();
			char input = str.charAt(0);
			
			switch(input)
			{
				case 'a': 
					System.out.println("What would you like to add to the list?");
					int toAdd = scanner.nextInt();
					scanner.nextLine(); // this is done to make sure any extra newlines etc. are thrown away
					list.add(toAdd);
					System.out.println(toAdd + " added to list");
					break;
					
				case 'd': 
					System.out.println("What would you like to try to delete from the list?");
					int toDelete = scanner.nextInt();
					scanner.nextLine(); // this is done to make sure any extra newlines etc. are thrown away
					list.delete(toDelete);
					break;
					
				case 'x': 
					try {
						System.out.println("The minimum of the list was " + list.max());
					}
					
					catch(Exception e) {
						System.out.println("Error: list was empty.");
					}
					break;
					
				case 'm': 
					try {
						System.out.println("The minimum of the list was " + list.min());
					}
			
					catch(Exception e) {
						System.out.println("Error: list was empty.");
					}
					break;

				case 'p': 
					list.print();
					break;

				case 'e':
					if(list.isEmpty()) {
						System.out.println("List is empty");
					}
					
					else {
						System.out.println("List is not empty");
					}
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
