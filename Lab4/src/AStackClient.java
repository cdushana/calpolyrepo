import java.io.File;
import java.util.Scanner;

public class AStackClient {

	public static void main(String[] args) {
		AStack<String> strings = new AStack<String>(5);
		AStack<Float> floats = new AStack<Float>(5);
		AStack<Integer> integers = new AStack<Integer>(5);
	
		System.out.println("Please enter a file name:");
		
		Scanner getFile = new Scanner(System.in);
		String filename = getFile.next();
		getFile.close();
		
		Scanner lineScanner = new Scanner(new File(filename));
		Scanner lineParser = new Scanner(" ");
		
		while(lineScanner.hasNextLine()) {
			lineParser = new Scanner(lineScanner.nextLine());

			while(lineScanner.hasNext())
			{
				if(lineParser.hasNext()) {
				integers.push(lineParser.nextInt());
				}
				
				else if(lineParser.hasNextFloat()) {
					floats.push(lineParser.nextFloat());
				}
				
				else if(lineParser.hasNextInt()) {
					strings.push(lineParser.next());
				}
			}
		}

		lineScanner.close();
		lineParser.close();
		
		System.out.print("Strings: ");
		while(!strings.isEmpty())
		{
			System.out.print(strings.pop() + " ");
		}
		System.out.println("\nFloats: ");		
		while(!floats.isEmpty())
		{
			System.out.print(floats.pop() + " ");
		}
		System.out.println("\nIntegers: ");		
		while(!integers.isEmpty())
		{
			System.out.print(integers.pop() + " ");
		}
	}
}

