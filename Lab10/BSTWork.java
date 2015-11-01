/* BSTWork tests implementation of BasicBST
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Lab 10
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/1/15
 */

import java.util.*;

public class BSTWork {
	
	public static void main(String[] args) {
		BasicBST tree = new BasicBST();
		
		System.out.println("Choose one of the following operations:");
		System.out.println("-- add an element to the tree (enter the letter a)");
		System.out.println("-- find the number of odds values in the tree (enter the letter o)");
		System.out.println("-- find the height of the tree (enter the letter h)");
		System.out.println("-- find the number of leaves in the tree (enter the letter l)");
		System.out.println("-- find the number of one-child nodes in the tree (enter the letter c)");
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
					System.out.println("What would you like to add to the tree?");
					int toAdd = scanner.nextInt();
					scanner.nextLine(); // this is done to make sure any extra newlines etc. are thrown away
					tree.insert(toAdd);
					System.out.println(toAdd + " added to tree");
					break;

				case 'o': 
					System.out.println("The number of odd values in the tree is " + tree.countOdds());
					break;

				case 'h': 
					System.out.println("The height of the tree is " + tree.height());
					break;
					
				case 'l': 
					System.out.println("The number of leaves in the tree is " + tree.countLeaves());
					break;

				case 'c': 
				System.out.println("The number of one-child nodes in the tree is " + tree.countOneChildParents());
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
