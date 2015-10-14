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
		AStack<Character> stack = new AStack<Character>(8);
		
		// iterate over the string
		for(int i = 0; i < str.length(); i++) {
			char index = str.charAt(i);
			
			// if opening char of interest, push to stack
			if(index == '(' || index == '[' || index == '{') {
				stack.push(index);
			}
			
			// if closing char of interest, validate it
			else if(index == ')' || index == ']' || index == '}') {
				if(stack.isEmpty()) {
					return false;
				}
				
				// sneaky way of converting chars to ascii values to see if they are matching pair
				int indexASCII = (int)index;
				int topASCII = (int)stack.pop();
				if(indexASCII > (topASCII + 2)) {
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
		System.out.println("Enter a string to be checked:");
		
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			
			boolean balanced = isBalanced(input);
			if(balanced) {
				System.out.println("The string is balanced.");
			}
			
			else {
				System.out.println("The string is not balanced.");
			}
			System.out.println("Enter another string to be checked:");
		}
	}
}
