import java.util.*;

public class TreeTest
{
	public static void main(String[] args)
	{
		Integer[] arr = new Integer[20];
	      int i = 0;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter values for the array:");
	      while(i < 20 && scanner.hasNextInt())
	      {
	         arr[i] = scanner.nextInt();
	         i++;
	      }

	      if(i == 0)
	      {
	         System.out.println("\nThe tree is empty.");
	         System.out.println();
	      }
	      else
	      {
	         if(TreeWork.isHeap(arr,i))
	         {
	            System.out.println("\nThe tree is a heap.");
	         }
	         else
	         {
	            System.out.println("\nThe tree is not a heap.");
	         }
	         TreeWork.printTree(arr,i+1);
	         System.out.println("\n");
	      }
	}
}