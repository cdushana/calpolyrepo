/* ConTest tests the performance of Converter.java
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Program 1
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/9/15
 */

import java.util.*;

public class ConTest
{
	public static void main(String[] args)
	{
		// declare new converter class
		Converter converter = new Converter();

		System.out.println("Choose one of the following operations:");
		System.out.println("- Infix to postfix conversion (enter the letter i)");
		System.out.println("- Postfix expression evaluation (enter the letter p)");
		System.out.println("- Arithmetic expression evaluation (enter the letter a)");
		System.out.println("- Quit the program (enter the letter q)");
		
		// declare scanner to take in user input
		Scanner scanner = new Scanner(System.in);

		// declare string to hold expression input
		String expression;
		
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
				case 'i':
					System.out.println("Enter infix expression:");

					// expression is assigned to the entire line of input
					expression = scanner.nextLine();
					System.out.println("the postfix expression is: " + converter.infixToPostfix(expression));
					break;

				case 'p': 
					System.out.println("Enter postfix expression:");

					// expression is assigned to the entire line of input
					expression = scanner.nextLine();
					System.out.println("the value of the postfix expression is: " + converter.postfixValue(expression));
					break;

				case 'a': 
					System.out.println("Enter infix expression:");

					// expression is assigned to the entire line of input
					expression = scanner.nextLine();
					System.out.println("the value of the arithmetic expression is: " + converter.postfixValue(converter.infixToPostfix(expression)));
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