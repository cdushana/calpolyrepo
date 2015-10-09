/* Converter implements the methods "infixToPostfix" and "postfixValue"
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Program 1
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/9/15
 */

import java.util.*;

public class Converter
{
	/**
	* Converts an infix notation expression to postfix notation
	* @param String expression - an mathematical expression in infix notation
	* @return String postfix - the given expression in postfix notation
	*/
	public static String infixToPostfix(String expression)
	{
	 	// initialze locals
	 	String[] infix = expression.split(" ");
	 	MyStack<String> expressionStack = new MyStack<String>();
	 	String postfix = "";
		
	 	// iterate over each character and handle with stack or string
	 	for(int i = 0; i < infix.length; i++) {
	 		String current = infix[i];
	 		
	 		// parentheses first
	 		if(current.equals("(")) {
	 			expressionStack.push(current);
	 		}
	 		
	 		else if(current.equals(")")) {
	 			
	 			while(!expressionStack.peek().equals("(")) {
	 				postfix = postfix + expressionStack.pop() + " ";
	 			}
	 			
	 			expressionStack.pop(); // at this point pop the left parenthesis
	 		}
	 		
	 		// higher precedence operators
	 		else if(current.equals("/") || current.equals("*")) {
	 			
	 			if(expressionStack.isEmpty() || expressionStack.peek().equals("(") || expressionStack.peek().equals("+") || expressionStack.peek().equals("-")) {
	 				expressionStack.push(current);
	 			}
	 			
	 			// top of stack is another mult or divide
	 			else {
	 				
	 				while(!expressionStack.isEmpty() && (expressionStack.peek().equals("*") || expressionStack.peek().equals("/"))) {
	 					postfix = postfix + expressionStack.pop() + " ";
	 				}
	 				
	 				expressionStack.push(current);
	 			}
	 			
	 		}
	 		
	 		// lower precedence operators
	 		else if(current.equals("+") || current.equals("-")) {
	 			
	 			if(expressionStack.isEmpty() || expressionStack.peek().equals("(")) {
	 				expressionStack.push(current);
	 			}
	 			
	 			else {
	 				
	 				while(!expressionStack.isEmpty() && (expressionStack.peek().equals("*") || expressionStack.peek().equals("/") ||  
	 						expressionStack.peek().equals("+") ||  expressionStack.peek().equals("-"))) {
	 					postfix = postfix + expressionStack.pop() + " ";
	 				}
	 				
	 				expressionStack.push(current);
	 			}
	 		}
	 		
	 		// operands case
	 		else {
	 			postfix = postfix + current + " ";
	 		}
	 	}
	 	
	 	while(!expressionStack.isEmpty()) {
	 		postfix = postfix + expressionStack.pop() + " ";
	 	}
		
	 	return postfix;
	 }

	 /**
	 * Method that evaluates the given postfix expression
	 *
	 * @param String expression - the user's input
	 * @return Double - final evaluated value from the calculation
	 */
	public static double postfixValue (String expression)
	{
		// declare new stack of generic type Double
		MyStack<Double> stack = new MyStack<Double>();

		// declare new scanner to take in some expression
		Scanner scanner = new Scanner(expression);

		// declare term operator to hold value
		String operator = " ";

		while(scanner.hasNext())
		{
			if(scanner.hasNextDouble())
			{
				stack.push(scanner.nextDouble());
			}
			else
			{
				// set operator to the following values; excludes extra unnecessary characters
				operator = scanner.next();

				if(operator.equals("+"))
				{
					stack.push(stack.pop() + stack.pop());
				}
				else if(operator.equals("-"))
				{
					stack.push(((-1 * stack.pop()) + stack.pop()));
				}
				else if(operator.equals("/"))
				{
					stack.push((1/stack.pop() * stack.pop()));
				}
				else if(operator.equals("*"))
				{
					stack.push(stack.pop() * stack.pop());
				}
			}
		}

		scanner.close();
		return stack.pop();
	}
}
