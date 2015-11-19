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
		MyList list = new MyList();
		
		System.out.println("Choose one of the following operations:");
		System.out.println("-- add an element to the list (enter the letter a)");
		System.out.println("-- find if a given element is in the list (enter the letter f)");
		System.out.println("-- print the list (enter the letter p)");
		System.out.println("-- sum the elements of the list (enter the letter s)");
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
					int toAdd = scanner.nextInt();
					scanner.nextLine(); // this is done to make sure any extra newlines etc. are thrown away
					list.add(toAdd);
					System.out.println(toAdd + " added to list");
					break;
					
				case 'f': 
					int toFind = scanner.nextInt();
					scanner.nextLine(); // this is done to make sure any extra newlines etc. are thrown away
					
					if(list.find(toFind)) {
						System.out.println(toFind + " was found in the list.");
					}	
					else {
						System.out.println(toFind + " was not found in the list.");
					}
					break;

				case 'p': 
					list.print();
					break;

				case 's':
					System.out.println("sum is " + list.sum());
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
