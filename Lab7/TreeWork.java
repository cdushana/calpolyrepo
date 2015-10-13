import java.util.*;

public class TreeWork
{
	//Reminder: a complete binary tree can be stored in an array.

	public static <T extends Comparable<? super T>> boolean isHeap (T[] arr, int N)
	{
		/*isHeap is a generic method. Given a complete binary tree, this method determines whether 
		 it is a heap or not. isHeap gets 2 parameters representing the tree: (i) the array where elements are 
		 stored, and (ii) the number of elements in the tree. If the order property of the heap is satisfied, 
		 this method returns true (the structure property is already satisfied – the array content represents 
		 a complete tree); false is returned otherwise.
		 Precondition: the given tree is not empty (i.e. number of elements is not 0).*/
	}

	public static <T > void printTree (T[] arr, int N)
	{
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