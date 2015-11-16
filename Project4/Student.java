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

	}
}