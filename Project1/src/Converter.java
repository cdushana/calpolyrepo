import java.util.*;

public class Converter
{
	public static String infixToPostfix (String expression)
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
	 			
	 			
	 		}
	 		
	 		// higher precedence operators
	 		else if(current.equals("/") || current.equals("*")) {
	 			
	 			if(expressionStack.isEmpty() || expressionStack.peek().equals("(") || expressionStack.peek().equals("+") || expressionStack.peek().equals("-")) {
	 				expressionStack.push(current);
	 			}
	 			
	 			// top of stack is another mult or divide
	 			else {
	 				
	 				while(expressionStack.peek().equals("*") || expressionStack.peek().equals("/")) {
	 					postfix = postfix + expressionStack.pop() + " ";
	 				}
	 				
	 				expressionStack.push(current);
	 			}
	 			
	 		}
	 		
	 		// lower precedence operators
	 		else if(current.equals("+") || current.equals("-")) {
	 			
	 		}
	 		
	 		// operands case
	 		else {
	 			
	 		}
	 	}
		
	 	return postfix;
	 }

	public static double postfixValue (String expression)
	{
		MyStack<Double> stack = new MyStack<Double>();

		Scanner scanner = new Scanner(expression);

		String operator = " ";

		while(scanner.hasNext())
		{
			if(scanner.hasNextDouble())
			{
				stack.push(scanner.nextDouble());
			}
			else
			{
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
