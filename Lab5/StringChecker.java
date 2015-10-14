/* StringChecker checks if a given string has balanced brackets
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Lab 5
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/13/15
 */

import java.util.*;

public class StringChecker {
	
	/*
	 * Accepts a string and checks if this string has accurately balanced brackets, parentheses, and braces
	 * @param String str - string to be checked
	 * @return boolean - balanced string or not?
	 */
	public static boolean isBalanced(String str) {
		AStack<String> stack = new AStack<String>(8);
		
		// iterate over the string
		for(int i = 0; i < str.length(); i++) {
			String index = str.substring(i, i+1);
			
			// if opening char of interest, push to stack
			if(index.equals("(") || index.equals("[") || index.equals("{")) {
				stack.push(index);
			}
			
			// if closing char of interest, validate it
			else if(index.equals(")") || index.equals("]") || index.equals("}")) {
				if(stack.isEmpty()) {
					return false;
				}
				
				
			}
				
		}
		
		// stack should be empty at this point
		if(!stack.isEmpty()) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			
			boolean balanced = isBalanced(input);
			if(balanced) {
				System.out.println("The string is balanced.");
			}
			
			else {
				System.out.print("The string is not balanced.");
			}
		}
	}
}
