/* AQueueDriver tests implementation of AQueue.
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Lab 6
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/12/15
 */

import java.util.*;

public class AQueueDriver {

	public static void main(String[] args) {
		AQueue<Integer> queue = new AQueue<Integer>(5);
	
		System.out.println("Choose one of the following operations:");
		System.out.println("-- enqueue/add (enter the letter a)");
		System.out.println("-- dequeue/delete (enter the letter d)");
		System.out.println("-- check if the queue is empty (enter the letter e)");
		System.out.println("-- print the array (enter the letter p)");
		System.out.println("-- quit (enter the letter q)");
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;

		while(run)
		{
			// get only the first character of user input to scan
			char result = ' ';
			String input = scanner.nextLine();
			if(input.length() > 0)
			{
				result = input.charAt(0);
			}
			
			switch(result)
			{
				case 'a': 
					System.out.println("enqueue: ");
					if(!scanner.hasNextInt())
					{
						System.out.println("Invalid value");
						scanner.nextLine(); // this is done to make sure any extra newlines are thrown away
					}
					else
					{
						int toQueue = scanner.nextInt();
						scanner.nextLine(); // this is done to make sure any extra newlines etc. are thrown away
						queue.enqueue(toQueue);
						System.out.println(toQueue + " enqueued");
					}
					break;
					
				case 'd': 
					try
					{
						System.out.println(queue.dequeue() + " dequeued");
					}
					catch(Exception e)
					{
						System.out.println("Invalid operation: queue is empty.");
					}
					break;

				case 'e': 
					if(queue.isEmpty())
					{
						System.out.println("empty");
					}
					else
					{
						System.out.println("not empty");
					}
					break;

				case 'p':
					queue.printArray();
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
		
		// print what is left in the queue
		if(queue.isEmpty())
		{
			System.out.println("There is nothing left in the queue.");
		}
		else
		{
			System.out.print("Queue: ");
			while(!queue.isEmpty()) {
				System.out.print(queue.dequeue() + " ");
			}
		}
		
		System.out.println("\nGoodbye!");		
	}
}
