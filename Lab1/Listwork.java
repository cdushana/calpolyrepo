/**
 * ListWork class is designed around user input, array 
 * manipulation, and a search & print function
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Lab 1
 * @version CPE103-9/10
 * @version Fall 2015
 */

 import java.util.*;

 public class ListWork
 {
 	public static final int MAX_LIMIT = 10;

 	public static <T> boolean search(T[] arr, T target)
 	{
 		boolean found = false;

 		for(int i = 0; i < arr.length; i++)
 		{
 			if(arr[i].equals(target))
 			{
 				found = true;
 			}
 		}
 		return found;
 	}

 	public static <T> void print(T[] arr)
 	{
 		for(int i = 0; i < arr.length; i++)
 		{
 			System.out.println(arr[i]);
 		}
 	}

 	public static void main(String[] args)
 	{
 		// declarations
 		Integer[] numbers = new Integer[MAX_LIMIT];
 		Scanner scanner = new Scanner(System.in);
 		Integer input = null;
 		int i = 0;

 		// prompt user
 		System.out.println("Enter at least 10 integers.");

 		while(i != MAX_LIMIT)
 		{
 			if(i > MAX_LIMIT)
 			{
 				scanner.close();
 			}
 			try
 			{
 				input = scanner.nextInt();
 				numbers[i] = input;
 				i++;
 			}
 			catch(Exception e)
 			{
 				scanner.next();
 			}
 		}

 		String str = "";
 		Integer target;
 		Scanner scanner2 = new Scanner(System.in); // new scanner for user input
 		System.out.println("Input an integer to search for an element within your array.\nPress 'q' to quit.");
 		while(!scanner2.hasNext("q"))
 		{
 			if(scanner2.hasNext())
 			{
 				str = scanner2.next();
 			}
 			try
 			{
 				target = Integer.parseInt(str);
 				if(search(numbers, target) == true)
 				{
 					System.out.println("//found\n");
 				}
 				else
 				{
 					System.out.println("//not found\n");
 				}
 				//System.out.println(search(numbers, target));
 			}
 			catch(NumberFormatException e)
 			{
 				System.out.println("//invalid value.\n");
 			}
 			System.out.println("Enter an integer to search for within your array.\nPress 'q' to quit.");
 		}

 		System.out.println(""); // adds a line to seperate the list of #'s
 		print(numbers);
 		

 		scanner2.close();
 	}
 }
