import java.util.*;
import java.lang.System;

public class RunTimes
{
	public static void main(String[] args)
	{
		
	 // ... the code being measured ...
	 

		System.out.println("Logarithmic algorithm’s running times: ");
		long input = 10000;
		while(input < 1000000000)
		{
			Algorithms.logarithmicAlgTime(input); // CHECK
			long startTime = System.nanoTime();
			long estimatedTime = (System.nanoTime() - startTime) / 1000000;
			System.out.println("T(" + input + ") = " + estimatedTime);	// T(10000) = 0, 10000 = N	
			input *= 2;
		}
		System.out.println(); // blank line

		System.out.println("Linear algorithm’s running times:");
		input = 10000;
		while(input < 1000000000)
		{
			Algorithms.linearAlgTime(input); // CHECK
			long startTime = System.nanoTime();
			long estimatedTime = (System.nanoTime() - startTime) / 1000000;
			System.out.println("T(" + input + ") = " + estimatedTime);	// T(10000) = 0, 10000 = N
			input *= 2;
		}
		System.out.println(); // blank line

		System.out.println("NlogN algorithm's running times: ");
		input = 10000;
		while(input < 1000000000)
		{
			Algorithms.NlogNAlgTime(input);
			long startTime = System.nanoTime();
			long estimatedTime = (System.nanoTime() - startTime) / 1000000;
			System.out.println("T(" + input + ") = " + estimatedTime);	// T(10000) = 0, 10000 = N
			input *= 2;
		}
		System.out.println(); // blank line

		System.out.println("NQuadratic algorithm’s running times: ");
		input = 10000;
		while(input < 1000000000)
		{
			Algorithms.quadraticAlgTime(input);
			long startTime = System.nanoTime();
			long estimatedTime = (System.nanoTime() - startTime) / 1000000;
			System.out.println("T(" + input + ") = " + estimatedTime);	// T(10000) = 0, 10000 = N
			input *= 2;
		}
		System.out.println(); // blank line
	}	
}