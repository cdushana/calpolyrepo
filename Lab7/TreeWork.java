import java.util.*;

public class TreeWork
{
	//Reminder: a complete binary tree can be stored in an array.

	public static <T extends Comparable<? super T>> boolean isHeap (T[] arr, int N)
	{
		for(int i = 0; i < (N - 1) / 2; i++)
		{
			if((i * 2 + 2) < N)
			{
				if(arr[i].compareTo(arr[i * 2 + 1]) > 0)
				{
					return false;
				} 
				else if(arr[i].compareTo(arr[i * 2 + 2]) > 0)
				{
					return false;
				}
			}
			else
			{	
				if(arr[i].compareTo(arr[i * 2 + 1]) > 0)
				{
					return false;
				}
			}
		}
		return true;
	}

	public static <T > void printTree (T[] arr, int N)
	{

		int i = 0;
	      for(int j = 0; j < Math.log(N)/Math.log(2); j ++)
	      {
	         System.out.println();

	         for(i = 0; i < Math.pow(2,j); i++)
	         {
	            if(i + (int)Math.pow(2,j) < N)
	            {
	               System.out.print(arr[i+(int)Math.pow(2,j)-1]);
	               System.out.print(" ");
	            }
	            else
	            {
	               break;
	            }
	         }
	      }
		/* printTree is a generic method that outputs the given complete binary tree on the screen 
		(see the output format below). printTree gets two parameters representing the tree: (i) the 
		array where elements are stored and (ii) the number of elements in the tree.
		Precondition: the given tree is not empty (i.e. number of elements is not 0).
		Note: since there is no specific handling of elements in the collection, this method can 
		be defined as a “normal” generic method intended for any type generic collection. Thus, the method header is:
		public static <T > void printTree (T[] arr, int N)
		Output format: This method outputs the content of the complete tree as a sequence of lines 
		where each line corresponds to one level of the tree – the i-th line contains all elements of 
		(i-1) level of the tree (elements on one line are separated by spaces). Thus, the first line 
		contains all elements of level 0, second line contains all elements of level 1, third line contains 
		all elements of level 2, etc.
		Note: the 0 level of the tree contains 1 node only, and at every i>0 level there are twice 
		as many elements as in the previous level, except the last level which may not be completely filled.
		Remember: the number of elements in the tree is given as a parameter (parameter N).*/
	}

}