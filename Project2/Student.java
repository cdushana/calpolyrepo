/* Student creates Student objects which will later form a collection to be arranged as a heap.
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Project 2
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/21/15
 */

import java.util.*;

public class Student implements Comparable<Student>
{
	// holds long value for Student objects' ID
	private long studentID;
	// holds string value for Student objects' last name
	private String lastName;

	/*
	 * Constructor that creates a Student object with a student ID and last name
	 */
	public Student(long studentID, String lastName)
	   {
	      this.studentID = studentID;
	      this.lastName = lastName;
	   }

	/*
	 * Compares two Student objects and determines which is greater than or less than the other. 
	 * Excludes equal names; impossible to have multiple students with the same ID.
	 * > = 1; < = -1; exclude 0
	 * @param other - another student object to be compared to
	 * @return returns int value that states one is greater/less than the other Student object.
	 */
	public int compareTo(Student other)
	{
		if(studentID > other.studentID)
		{
			return 1;
		}
		else if(studentID < other.studentID)
		{
			return -1;
		}
		return 0;
	}

	/*
	 * @Override
	 */ 
	public String toString()
	{
		return "{ id: " + studentID + ", name: " + lastName + " }";	
	}
}