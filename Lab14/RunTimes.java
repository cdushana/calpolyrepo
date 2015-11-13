import java.util.*;

public class RunTimes
{
	public static void main(String[] args)
	{

		System.out.println("Logarithmic algorithm’s running times: ");
		long input = 10000;
		while(input < 1000000000)
		{
			Algorithms.logarithmicAlgTime(input); // CHECK
			long runTime = nanoTime() / 1000000;
			System.out.println("T(" + input + ") = " + runTime);	// T(10000) = 0, 10000 = N	
			input *= 2;
		}
		System.out.println(); // blank line

		System.out.println("Linear algorithm’s running times:");
		input = 10000;
		while(input < 1000000000)
		{
			Algorithms.Algorithms.linearAlgTime(input); // CHECK
			long runTime = nanoTime() / 1000000; // while loop
			System.out.println("T(" + input + ") = " + runTime);	// T(10000) = 0, 10000 = N
			input *= 2;
		}
		System.out.println(); // blank line

		System.out.println("NlogN algorithm's running times: ");
		input = 10000;
		while(input < 1000000000)
		{
			Algorithms.NlogNAlgTime(input);
			long runTime = nanoTime() / 1000000;
			System.out.println("T(" + input + ") = " + runTime);	// T(10000) = 0, 10000 = N
			input *= 2;
		}
		System.out.println(); // blank line

		System.out.println("NQuadratic algorithm’s running times: ");
		input = 10000;
		while(input < 1000000000)
		{
			Algorithms.quadraticAlgTime(input);
			long runTime = nanoTime() / 1000000;
			System.out.println("T(" + input + ") = " + runTime);	// T(10000) = 0, 10000 = N
			input *= 2;
		}
		System.out.println(); // blank line
	}	
}