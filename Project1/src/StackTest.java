/* StackTest tests the performance of MyStack.java
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Program 1
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/9/15
 */

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		// declare stack of type String
		MyStack<String> stack = new MyStack<String>();
	
		System.out.println("Choose one of the following operations:");
		System.out.println("-- push/add (enter the letter a)");
		System.out.println("-- pop/delete (enter the letter d)");
		System.out.println("-- peek at the top value of the stack (enter the letter p)");
		System.out.println("-- check if the stack is empty (enter the letter e)");
		System.out.println("-- quit (enter the letter q)");
		
		// create new scanner to take in user input
		Scanner scanner = new Scanner(System.in);
		
		// declare boolean to control while loop
		boolean run = true;

		while(run)
		{
			// declare variable to hold user input
			char result = ' ';

			// declare variable to hold entire line
			String input = scanner.nextLine();

			if(input.length() > 0)
			{
				// result will be first character of input (line)
				result = input.charAt(0);
			}
			
			switch(result)
			{
				case 'a':
					if(!scanner.hasNextInt() && !scanner.hasNextFloat())
					{
						System.out.println("push: ");
						// the String variable, to Push, is assigned to the entire line of input
						String toPush = scanner.nextLine();
						stack.push(toPush);
						System.out.println(toPush + " pushed");
					}
					else
					{
						System.out.println("Invalid value");
						scanner.nextLine(); // this is done to make sure any extra newlines are thrown away
					}
					break;

				case 'd': 
					try
					{
						System.out.println(stack.pop() + " popped");
					}
					catch(Exception e)
					{
						System.out.println("Invalid operation: stack is empty.");
					}
					break;
					
				case 'p': 
					try
					{
						System.out.println(stack.peek() + " is the top value");
					}
					catch(Exception e)
					{
						System.out.println("Invalid operation: stack is empty.");
					}
					break;
					
				case 'e': 
					if(stack.isEmpty())
					{
						System.out.println("empty");
					}
					else
					{
						System.out.println("not empty");
					}
					break;

				case 'q': 
					System.out.println("quitting");

					// break out of while loop
					run = false;
					break;
			
				default: 
					System.out.println("Invalid choice");
					break;
			}
		}
		scanner.close();
		System.out.println("Goodbye!");		
	}
}

