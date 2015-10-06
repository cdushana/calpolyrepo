import java.util.Scanner;

public class AStackDriver {

	public static void main(String[] args) {
		AStack<Integer> myQueue = new AStack<Integer>(5);
	
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
			String input = scanner.next();
			// string = string.trim(); //remove any leading or trailing spaces | might not be needed
			input = input.substring(0,1);
			
			switch(input)
			{
				case "a": 
					System.out.println("What would you like to enqueue?");
					int toQueue = scanner.nextInt();
					myQueue.enqueue(toQueue);
					System.out.println(toQueue + " enqueued");
					break;

				case "d": 
					try
					{
						System.out.println(myQueue.dequeue() + " dequeued");
					}
					catch(Exception e)
					{
						System.out.println("Invalid operation: queue is empty.");
					}
					break;

				case "e": 
					if(myQueue.isEmpty())
					{
						System.out.println("empty");
					}
					else
					{
						System.out.println("not empty");
					}
					break;

				case "q": 
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

