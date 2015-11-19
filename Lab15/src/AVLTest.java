/* 
 * Driver class to run the AVL tree
 *
 * @authors Christiana Ushana (cushana) & Devon Grove (djgrove)
 * @version Lab 15
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/22/15
 */
import java.util.Scanner;

public class AVLTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // create scanner to take input
		BasicAVL treeAVL = new BasicAVL(); // create new AVL tree

		System.out.println("Choose one of the following operations:");
		System.out.println("-- add an element to the AVL tree (enter the letter a)");
		System.out.println("-- print out the AVL tree (enter the letter p)");
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
					System.out.println("What would you like to add to the AVL tree?");
					int toAdd = scanner.nextInt();
					scanner.nextLine(); // this is done to make sure any extra newlines etc. are thrown away
					treeAVL.insert(toAdd);
					System.out.println(toAdd + " added to hash table");
					break;
				case 'p': 
					treeAVL.print();
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