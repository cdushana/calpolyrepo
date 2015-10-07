import java.util.Scanner;

public class AStackClient {

	public static void main(String[] args) {
		AStack<Integer> stack = new AStack<Integer>(5);
	
		System.out.println("Choose one of the following operations:");
		System.out.println("-- push/add (enter the letter a)");
		System.out.println("-- pop/delete (enter the letter d)");
		System.out.println("-- peek at the top value of the stack (enter the letter p)");
		System.out.println("-- check if the stack is empty (enter the letter e)");
		System.out.println("-- quit (enter the letter q)");
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;

		while(run)
		{
			char result = ' ';
			String input = scanner.nextLine();
			if(input.length() > 0)
			{
				result = input.charAt(0);
			}
			
			switch(result)
			{
				case 'a': 
					System.out.println("What would you like to push?");
					int toPush = scanner.nextInt();
					scanner.nextLine();
					stack.push(toPush);
					System.out.println(toPush + " pushed");
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

