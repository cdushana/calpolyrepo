import java.util.*;

public class StackTest
{
	public static void main(String[] args)
	{
		MyStack<String> stringStack = new MyStack<String>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose one of the following operations:\n- push/add (enter the letter a)\n- pop/delete (enter the letter d)\n- peek (enter the letter p)\n- check if the list is empty (enter the letter e)\n- Quit (enter the letter q)");

		String input = scanner.next();
		// string = string.trim(); //remove any leading or trailing spaces | might not be needed
		input = input.substring(0,1); // keep only the first character of input

		while(!input.equals("q"))
		{
			System.out.println(input);
			switch(input)
			{
				case "a": System.out.println("What would you like to push to stack?");
					String toPush = scanner.nextLine();
					stringStack.push(toPush);
					System.out.println(toPush + " pushed in");
					break;

				case "d": System.out.println(stringStack.pop() + " popped out");
						  break;

				case "p": System.out.println(stringStack.peek() + " on the top"); // input read as one line
						  break;

				case "e": if(stringStack.isEmpty()){System.out.println("empty");}
						  else{System.out.println("not empty");}
						  break;

				case "p": System.out.println(stringStack.peek() + " on the top"); // input read as one line
					break;

				case "e": if(stringStack.isEmpty()){System.out.println("empty");}
					else{System.out.println("not empty");}
					break;

				case "q": System.out.println("quitting");
						  break;
			
				default: System.out.println("Invalid choice");
						 break;
			}
			
			input = scanner.next();
			// string = string.trim(); //remove any leading or trailing spaces | might not be needed
			input = input.substring(0,1); // keep only the first character of input

		}

		System.out.println("Goodbye!");
		
		// 4. For as long as the user does not choose to quit, do the following:
		// - Prompt the user to enter a menu choice (do NOT print the menu here; remember, the menu
		// should be output ONLY ONCE, in step 3, before entering this loop).
		// - Input user’s choice. Although you need to input only one letter (a, d, p, e, q), read in the
		// whole line and use the first letter only; this will eliminate any future issues if the user
		// accidentally entered additional symbols here.
		// - Analyze user’s choice (use a switch statement with default case which will execute for
		// invalid menu choices). Arrange the execution of the requested operation; if necessary (push
		// operation), ask for an input value and input it from a separate line (DON’T enter the
		// input value on the same line as the user’s choice). After the execution of each request,
		// output one of the following messages respectively: “5 pushed in”, “5 popped out”, “5 on
		// the top”, “empty”, “not empty”, “quitting” (the value 5 is used just for an example).
		// Remember that your stack is defined to hold strings so you should not differentiate
		// numeric values from other strings.

		// 	Important:
		// 1. If the operation throws an exception (pop and peek), don’t let the program crash or
		// terminate, handle it by outputting a message “Invalid operation on an empty stack”.
		// 2. The input value for the push method is read as one whole line.
		// 3. If the user entered a wrong letter for a menu choice, output a message “Invalid choice”
		// and finish the execution of that request (do NOT try to loop in asking to correct it). 
		// 5. After the user chooses to quit, finish the program with a farewell message.
	}
}
