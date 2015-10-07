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
		
		Scanner scanner = new Scanner(new File(filename));
		
		while(scanner.hasNext()) {
			if() {
				int num = Integer.parseInt(scanner.next());
				integers.push(num);
			}
			
			else if() {
				float num = Integer.parseFloat(scanner.next());
				floats.push(num);
			}
			
			else {
				strings.push(scanner.next());
			}
		}

		scanner.close();
		
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

