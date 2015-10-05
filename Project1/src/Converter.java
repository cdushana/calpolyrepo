public class Converter
{
	public static String infixToPostfix (String expression)
	{
		// initialze locals
		String[] infix = expression.split(" ");
		MyStack<String> stack;
		String postfix = "";
		
		// check each character and handle with stack or string
		for(int i = 0; i < infix.length; i++) {
			
			// string is an operator
			if(infix[i].contains("^*/+-()")) {
				boolean notLarger = true;
				
				while(notLarger) {
					
					// if hand is lower precedence, pop and check again
					if() {
						postfix = postfix + stack.pop();
					}
					
					// if hand is higher precedence, push hand to stack & break
					else {
						stack.push(infix[i]);
						notLarger = false;	
					}
				}

			}
			
			// we know string is a number
			else {
				postfix = postfix + infix[i];
			}
		}
		
		return postfix;
	}

	public static double postfixValue (String expression)
	{
		
	}
}
