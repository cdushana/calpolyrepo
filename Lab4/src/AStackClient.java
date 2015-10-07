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
				integers.push(scanner.next());
			}
			
			else if() {
				floats.push(scanner.next());
			}
			
			else {
				strings.push(scanner.next());
			}
		}
		//scan file
		
		if(/*integer*/) {
			
		}
		
		scanner.close();
		
		System.out.println("Strings: ");
		System.out.println("Floats: ");		
		System.out.println("Integers: ");		
	}
}

