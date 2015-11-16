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
			long startTime = System.nanoTime();
			Algorithms.logarithmicAlgTime(input); // CHECK
			long estimatedTime = (System.nanoTime() - startTime) / 1000000;
			System.out.println("T(" + input + ") = " + estimatedTime);	// T(10000) = 0, 10000 = N	
			input *= 2;
		}
		System.out.println(); // blank line

		System.out.println("Linear algorithm’s running times:");
		input = 10000;
		while(input < 1000000000)
		{
			long startTime = System.nanoTime();
			Algorithms.linearAlgTime(input); // CHECK
			long estimatedTime = (System.nanoTime() - startTime) / 1000000;
			System.out.println("T(" + input + ") = " + estimatedTime);	// T(10000) = 0, 10000 = N
			input *= 2;
		}
		System.out.println(); // blank line

		System.out.println("NlogN algorithm's running times: ");
		input = 10000;
		while(input < 1000000000)
		{
			long startTime = System.nanoTime();
			Algorithms.NlogNAlgTime(input);
			long estimatedTime = (System.nanoTime() - startTime) / 1000000;
			System.out.println("T(" + input + ") = " + estimatedTime);	// T(10000) = 0, 10000 = N
			input *= 2;
		}
		System.out.println(); // blank line

		System.out.println("NQuadratic algorithm’s running times: ");
		input = 10000;
		while(input < 800000)
		{
			long startTime = System.nanoTime();
			Algorithms.quadraticAlgTime(input);
			long estimatedTime = (System.nanoTime() - startTime) / 1000000;
			System.out.println("T(" + input + ") = " + estimatedTime);	// T(10000) = 0, 10000 = N
			input *= 2;
		}
		System.out.println(); // blank line
	}	
}