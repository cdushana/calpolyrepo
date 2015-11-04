import java.util.*;

public class BSTDriver {
	Scanner sc = new Scanner(System.in);
	BST<Integer> tree = new BST<Integer>;

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
			String str = scanner.next();
			char input = str.charAt(0);
			
			switch(input)
			{
				case 'a': 
					break;
				
				case 'd': 
					break;
				case 'f': 
					break;
				case 'e': 
					break;
				case 'k': 
					break;
				case 'n': 
					break;
				case 'm': 
					break;
				case 'x': 
					break;
				case 'p': 
					break;
				case 'i': 
					break;
				case 'l': 
					break;
				case 't': 
					break;
				case 'o': 
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
