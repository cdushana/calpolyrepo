import java.util.*;

public class StackTest
{
	// I am testing this out with GitHub
	MyStack stringStack = new MyStack();
	Scanner scanner = new Scanner(System.in);

	System.out.println("Choose one of the following operations:\n
			- push/add (enter the letter a)
			- pop/delete (enter the letter d)
			- peek (enter the letter p)
			- check if the list is empty (enter the letter e)
			- Quit (enter the letter q)");

	while(!scanner.hasNext("q"))
	{ //SUBSTRING // String class: getChars() OR charAt()
		String input = new String();
		input = scanner.next();
		switch(input)
		{
			case "a": System.out.println(push(input) + "pushed in");

			case "d": System.out.println(pop() + "pushed out");

			case "p": System.out.println(peek() + "on the top"); // input read as one line

			case "e": if(isEmpty()){System.out.println("empty");}
					  else{System.out.println("not empty");}

			case "q": System.out.println("quitting");
				
			default: System.out.println("Invalid choice");
		}

		System.out.println("Goodbye!"); // 5. Farewell message
	}

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