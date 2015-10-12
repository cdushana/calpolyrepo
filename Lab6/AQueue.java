/* AQueue repesents a queue implemented as a circular array.
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Lab 6
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/----/15
 */

import java.util.*;

public class AQueue<T>
{
	private T[] arr;
	private int front;
	private int end;
	private int count;

	public static class MyException extends RuntimeException // check if RunTime is actually extending class?
	{
		public MyException() {
		}
		
		public MyException(String message) {
			throw new RuntimeException(message);
		}
	}
	
	public AQueue(int size)
	{
		arr = (T[]) new Object[size];
		front = 0;
		end = -1;
		count = 0;
	}	

	public void enqueue(T endValue)
	{
		if(count == arr.length - 1) // >=/== arr.length - 1? or just >=/== arr.length?
		{
			T[] arr2 = (T[]) new Object[arr.length * 2]; // new array doubled in size
			for(int i = 0; i < arr.length; i++) 
			{
				arr2[i] = arr[i];
			}
			
			arr = arr2; // point arr to new array
			front = 0; // set front to zero, beginning of array
			end = count - 1; // set end to the end of the array
		}

		end++;
		// wrapping around edge of array? 
		arr[count] = endValue;
	}

	public T dequeue()
	{
		if(isEmpty())
		{
			throw new MyException();
		}

		T dequeue = arr[front]; // save value before array manipulation
		arr[front] = null;

		if(front < arr.length - 1)
			front++;
		else
			front = 0;

		count--;

		return dequeue;
	}

	public boolean isEmpty()
	{
		if(count == 0)
		{
			return true;
		}
		return false;
	}

	public void printArray()
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
}