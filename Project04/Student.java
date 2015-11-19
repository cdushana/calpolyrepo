/* 
 * Student is a class to represent a student by ID and last name.
 *
 * @authors Christiana Ushana (cushana) & Devon Grove (djgrove)
 * @version Program 4
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/20/15
 */

public class Student
{
	private long id;
	private String lastName;

	public Student(long id, String lastName)
	{
		this.id = id;
		this.lastName = lastName;
	}

	public boolean equals(Object other)
	{
		if(id == ((Student)other).id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString()
	{
		return "{id: " + id + ", name: " + lastName + "}";
	}

	public int hashCode()
	{
		return ((Long)id).hashCode();
	}
}