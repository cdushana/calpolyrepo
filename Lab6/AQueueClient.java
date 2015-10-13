/* AQueueClient tests the functionality of AQueue
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Lab 6
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/12/15
 */

import java.util.*;

public class AQueueClient 
{
	public static void main(String[] args)
	{
		AQueue<Float> queue = new AQueue<Float>(5);
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("When you are finished inputting values, press CTRL + D.");
	    System.out.println("Enter Values:");

	    while(scanner.hasNext())
	    {
	    	if(scanner.hasNextFloat())
	    	{
	    		queue.enqueue(scanner.nextFloat()); // only enqueue elements that are of type float
	    	}
	    	else
	    	{
	    		scanner.next(); // exclude anything that is not float value
	    	}
	    }
	    System.out.print("Queue: ");
      	while(!queue.isEmpty()) 
      	{
        	System.out.print(queue.dequeue() + " "); // print out all dequeued values
      	}
      	System.out.println();
	}
}
