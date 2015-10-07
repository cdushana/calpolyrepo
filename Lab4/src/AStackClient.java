import java.util.Scanner;

public class AStackClient {

	public static void main(String[] args) {
		AStack<String> strings = new AStack<String>(5);
		AStack<Float> floats = new AStack<Float>(5);
		AStack<Integer> integers = new AStack<Integer>(5);
	
		System.out.println("Please enter a file name:");
		
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.next();
		
		scanner.close();
		
		System.out.println("Strings: ");
		System.out.println("Floats: ");		
		System.out.println("Integers: ");		
	}
}

