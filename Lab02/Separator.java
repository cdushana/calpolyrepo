/**
 * Christiana Ushana & Devon Grove
 * Lab 2
 */

 import java.util.*;

 public class Separator
 {
 	public static final int N = 5;

 	public static void main(String[] args)
 	{
 		Scanner scanner = new Scanner(System.in);
 		int intCounter = 0;
 		int floatCounter = 0;
 		int[] intArray = new int[N];
 		float[] floatArray = new float[N];

 		System.out.println("Input a series of integer and float values.");
 		while(!scanner.hasNext("q") && intCounter <= N && floatCounter <= N)
 		{
 			// ints should be first
 			if(scanner.hasNextInt() && intCounter < N)
 			{
 				intArray[intCounter] = scanner.nextInt();
 				intCounter++;
 			}
 			else if(scanner.hasNextFloat() && floatCounter < N && !scanner.hasNextInt())
 			{
 				floatArray[floatCounter] = scanner.nextFloat();
 				floatCounter++;
 			}
 			else
 			{
 				break;
 			}
 		}
 		
 		scanner.close();

 		System.out.print("Integers:");
 		for(int i = 0; i < intArray.length; i++)
 		{
 			if(intArray[i] != 0)
 			{
 	 			System.out.print(" " + intArray[i]);
 			}
 		}

 		System.out.print("\nFloats:");
 		for(int j = 0; j < floatArray.length; j++)
 		{
 			if(floatArray[j] != 0.0)
 			{
 	 			System.out.print(" " + floatArray[j]);
 			}
 		}
 	}
 }