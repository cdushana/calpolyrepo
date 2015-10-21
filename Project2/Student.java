import java.util.*;

public class Student implements Comparable<Student>
{
	private long studentID;
	private String lastName;

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

	public String toString()
	{
		return "id: " + studentID + ", name: " + lastName;	
	}
}