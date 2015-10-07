import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AStackClient {

	public static void main(String[] args) throws FileNotFoundException {
		AStack<String> strings = new AStack<String>(5);
		AStack<Float> floats = new AStack<Float>(5);
		AStack<Integer> integers = new AStack<Integer>(5);
	
		Scanner getFile = new Scanner(System.in);
		System.out.println("Please enter a file name:");
		String filename = getFile.next();
		
		Scanner lineScanner = new Scanner(new File(filename));
		Scanner lineParser = new Scanner(" ");
		
		while(lineScanner.hasNextLine()) {
			lineParser = new Scanner(lineScanner.nextLine());

			while(lineScanner.hasNextLine())
			{
				if(lineParser.hasNextInt()) {
					integers.push(lineParser.nextInt());
				}
				
				else if(lineParser.hasNextFloat()) {
					floats.push(lineParser.nextFloat());
				}
				
				else if(lineParser.hasNext()) {
					strings.push(lineParser.next());
				}
				else {
					break;
				}
			}
		}

		lineScanner.close();
		lineParser.close();
		getFile.close();
		
		System.out.print("Strings: ");
		while(!strings.isEmpty())
		{
			System.out.print(strings.pop() + " ");
		}
		System.out.print("\nFloats: ");		
		while(!floats.isEmpty())
		{
			System.out.print(floats.pop() + " ");
		}
		System.out.print("\nIntegers: ");		
		while(!integers.isEmpty())
		{
			System.out.print(integers.pop() + " ");
		}
	}
}

