import java.util.*;
import java.io.*;

public class ListPrinter
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		// holds Student type elements
		BinHeap<Student> binHeap = new BinHeap<Student>();

		Scanner getFile = new Scanner(System.in);
		System.out.println("Please enter a file name:");
		String filename = getFile.next();

		try
		{
			FileInputStream file = new FileInputStream(filename);

			Scanner otherScanner = new Scanner(file);

			Student student;
			long studentID;
			String lastName;
			Scanner line;
			
			while(otherScanner.hasNextLine())
			{
				line = new Scanner(otherScanner.nextLine());

				try
				{
					studentID = line.nextLong();
					lastName = line.next();

					if(!line.hasNext() && studentID > 0)
					{
						student = new Student(studentID, lastName);
						binHeap.insert(student);
					}
				}
				catch(NoSuchElementException e)
				{
					// skip to next line
				}
				
			}

			System.out.println("Student List: ");

			for(int i = 0; i < binHeap.size(); i++)
			{
				student = binHeap.deleteMin();
				System.out.println((i + 1) + ". " + student.toString());
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: File not Found");
		}
		
	}
}