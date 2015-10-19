/* Tester class for BinHeap
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Project 2
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/18/15
 */
import java.util.*;

public class HeapTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How large would you like your heap?");
		int wantSize = sc.nextInt();
		sc.nextLine(); // done to throw out extra newline character
		BinHeap<String> heap = new BinHeap<String>(wantSize);
		
		System.out.println("Choose one of the following operations:");
		System.out.println("-- insert element (enter the letter a)");
		System.out.println("-- delete smallest element (enter the letter d)");
		System.out.println("-- check if heap is empty (enter the letter e)");
		System.out.println("-- check size of collection (enter the letter s)");
		System.out.println("-- print the collection (enter the letter p)");
		System.out.println("-- quit (enter the letter q)");
		
		boolean run = true;

		while(run)
		{
			char result = ' ';
			String input = sc.nextLine();
			
			//strip down to first char only
			if(input.length() > 0)
			{
				result = input.charAt(0);
			}
			
			switch(result)
			{
				case 'a':
					System.out.println("What would you like to add to the heap?");
					String add = sc.nextLine();
					heap.insert(add);
					break;
					
				case 'd': 
					System.out.println(heap.deleteMin());
					break;
					
				case 'e':
					if(heap.isEmpty()) {
						System.out.println("The heap is empty");
					}
					else {
						System.out.println("The heap is not empty");
					}
					break;
					
				case 's':
					System.out.println(heap.size());
					break;

				case 'p':
					System.out.println(heap.toString());
					break;

				case 'q':
					run = false;
					break;
				default: 
					System.out.println("Invalid choice");
					break;
			}
		}
		sc.close();
		
		System.out.println("Quitting program");
	}
}