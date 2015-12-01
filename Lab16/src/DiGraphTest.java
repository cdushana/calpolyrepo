import java.util.Scanner;

public class DiGraphTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number of verteces");
		int size = scanner.nextInt();
		
		DiGraphAM graph = new DiGraphAM(size);
	
		System.out.println("Choose one of the following operations:");
		System.out.println("-- add edge (enter the letter a)");
		System.out.println("-- delete edge (enter the letter d)");
		System.out.println("-- count number of edges (enter the letter e)");
		System.out.println("-- count number of verteces (enter the letter v)");
		System.out.println("-- topological sort (enter the letter t)");
		System.out.println("-- quit (enter the letter q)");
		
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
					System.out.println("Enter two verteces separated by space");
					int a1 = scanner.nextInt();
					int a2 = scanner.nextInt();
					graph.addEdge(a1, a2);
					System.out.println("Edge (" + a1 + ", " + a2 + ") was added.");
					break;
					
				case 'd': 
					System.out.println("Enter two verteces separated by space");
					int d1 = scanner.nextInt();
					int d2 = scanner.nextInt();
					graph.addEdge(d1, d2);
					System.out.println("Edge (" + d1 + ", " + d2 + ") was removed.");
					break;

				case 'e': 
					System.out.println("# of edges: " + graph.edgeCount());
					break;

				case 'v': 
					System.out.println("# of verteces: " + graph.vertexCount());					
					break;

				case 'p': 
					graph.print();
					break;

				case 't': 
					int[] sort = graph.topSort();
					
					for(int i = 0; i < sort.length; i++) {
						System.out.print(i);	
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
		System.out.println("\nGoodbye!");		
	}
}
