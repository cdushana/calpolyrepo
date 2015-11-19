/* ListPrinter tests the implentation of BinHeap.
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Project 2
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/21/15
 */

import java.util.*;
import java.io.*;

public class ListPrinter
{
	public static void main(String[] args)
	{
		// holds Student type elements
		BinHeap<Student> binHeap = new BinHeap<Student>();

		// scans user input
		Scanner getFile = new Scanner(System.in);
		System.out.println("Please enter a file name:");

		// creates string for file name
		String filename = getFile.next();

		try
		{
			// creates new file input stream
			FileInputStream file = new FileInputStream(filename);

			// scans file
			Scanner scanner = new Scanner(file);

			// Holds student object
			Student student;

			// holds student ID value (long)
			long studentID;

			// holds string value, last name of student object
			String lastName;

			// scanner that reads each line of file
			Scanner line;
			
			while(scanner.hasNextLine())
			{
				line = new Scanner(scanner.nextLine());

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

			// print out list
			System.out.println("Student List: ");

			int size = binHeap.size();
			for(int i = 0; i < size; i++)
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