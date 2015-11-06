/* 
 * BSTDriver is a program to run the Binary Search Tree class
 *
 * @authors Christiana Ushana & Devon Grove (djgrove)
 * @version Program 3
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/6/15
 */

import java.util.*;

public class BSTDriver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BST<Integer> tree = new BST<Integer>();
		
		System.out.println("Choose one of the following operations by entering provided letter:");
		System.out.println("     a - add the element");
		System.out.println("     d - delete the element");
		System.out.println("     f - find the element");
		System.out.println("     e - check if the tree is empty");
		System.out.println("     k - make the tree empty");
		System.out.println("     n - get the number of nodes (the size) of the tree");
		System.out.println("     m - find the minimal element");
		System.out.println("     x - find the maximal element");
		System.out.println("     p - print the tree in preorder using iterator");
		System.out.println("     i - print the tree in inorder using iterator");
		System.out.println("     l - print the tree in levelorder using iterator");
		System.out.println("     t - print the tree using printTree");
		System.out.println("     o - output the tree using toString");
		System.out.println("     q - quit the program");
	
		boolean run = true;
	
			while(run)
			{
				// get user input
				String str = sc.next();
				char input = str.charAt(0);
				
				switch(input)
				{
					case 'a': 
						System.out.println("What number would you like to add to the tree?");
						int newNum = sc.nextInt();
						tree.insert(newNum);
						System.out.println(newNum + " was added to the tree.");
						break;
					case 'd': 
						System.out.println("What number would you like to try to delete from the tree?");
						int deleteNum = sc.nextInt();
						tree.delete(deleteNum);
						System.out.println(deleteNum + " was deleted from the tree if it existed.");
						break;
					case 'f':
						System.out.println("What would you like to search for?");
						int findNum = sc.nextInt();
						tree.find(findNum);
						break;
					case 'e': 
						if(tree.isEmpty())
							System.out.println("Tree is empty.");
						else
							System.out.println("Tree is not empty");
						break;
					case 'k': 
						tree.makeEmpty();
						System.out.println("Tree has been made empty.");
						break;
					case 'n': 
						System.out.println("Size of tree is " + tree.size());
						break;
					case 'm': 
						System.out.println("Minimum element is " + tree.findMinimum());
						break;
					case 'x': 
						System.out.println("Minimum element is " + tree.findMaximum());
						break;
					case 'p': 
						break;
					case 'i': 
						break;
					case 'l': 
						break;
					case 't': 
						tree.printTree();
						break;
					case 'o': 
						System.out.println(tree.toString());
						break;
					case 'q': 
						System.out.println("quitting");
						run = false;
						break;
					default: 
						System.out.println("Invalid option choice");
						break;
				}
			}
	
			sc.close();
	}
}
