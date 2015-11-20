/* 
 * Driver class to test HashTable implementation
 *
 * @authors Christiana Ushana (cushana) & Devon Grove (djgrove)
 * @version Program 4
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/20/15
 */

import java.util.*;
import java.io.*;

public class HTDriver
{
	public static void main(String[] args)
	{
		try
		{
			// scanner to get file name
			Scanner scanner = new Scanner(System.in);
			// prompts user to input file name
			System.out.println("Enter an input file: ");
			// creates string for file name
			String filename = scanner.nextLine();	

			// declaration of id
			Long id;
			// declaration of Student
			Student student;
			// declaration of name of Student
			String lastName;
			// scanner to parse through lines of file
			Scanner line;

			//
			FileInputStream input = new FileInputStream(filename);
			// reading the file
			Scanner sc = new Scanner(input);

			// define count for hash table
			int count = sc.nextInt();
			// create hash table with defined size
			HashTable table = new HashTable(count);

			while(sc.hasNextLine())
			{	
				// create line scanner
				line = new Scanner(sc.nextLine());

				try
				{
					id = line.nextLong();
					lastName = line.next();

					if(!line.hasNext() && id > 0)
					{
						student = new Student(id, lastName);
						table.insert(student);
					}
				}
				catch(NoSuchElementException e) {}
			}

			System.out.println("Choose one of the following operations by entering provided letter:");
			System.out.println("     a - add the element");
			System.out.println("     d - delete the element");
			System.out.println("     f - find and retrieve the element");
			System.out.println("     n - get the number of elements in the collection");
			System.out.println("     e - check if the collection is empty");
			System.out.println("     k - make the hash table empty");
			System.out.println("     p - print the content of the hash table");
			System.out.println("     o - output the elements of the collection");
			System.out.println("     q - quit the program");

			boolean run = true;

			while(run)
			{
				// get user input
				String str = scanner.next();
				char character = str.charAt(0);
				
				switch(character)
				{
					case 'a':
						System.out.println("Enter a Student ID and last name (separated by a space):");
						if(scanner.hasNextLine()) {
							scanner.nextLine(); // done to read out extra newline character
							line = new Scanner(scanner.nextLine());

							try {
								id = line.nextLong();
								lastName = line.next();

								if(!line.hasNext() && id > 0){
									student = new Student(id, lastName);
									table.insert(student);
									System.out.println(student.toString() + " added to table");
								}
				
								else {
									System.out.println("Incorrect input");
								}
							}
							catch(NoSuchElementException e) {}
						}
						else
						{
							System.out.println("Incorrect input");
						}
						break;

					case 'd':
						System.out.println("Enter one (type long) integer: ");
						if(scanner.hasNextLine())
						{
							scanner.nextLine();
							id = scanner.nextLong();

							if(id > 0)
							{
								Student temp = new Student(id,"");
								temp = (Student) table.find(temp);
								if(temp != null) {
									table.delete(temp);
									System.out.println(temp.toString() + " deleted.");
								}
								else {
									System.out.println("ID was not found in database");
								}
							}
							else
							{
								System.out.println("Invalid ID");
							}	
						}
						
						else {
							System.out.println("Incorrect input");
						}
						break;

					case 'f':
						System.out.println("Enter one (type long) integer: ");
						if(scanner.hasNextLine())
						{
							scanner.nextLine();
							id = scanner.nextLong();

							if(id > 0)
							{
								Student temp = new Student(id,"");
								temp = (Student) table.find(temp);
								
								if(temp != null) {
									System.out.println(temp.toString() + " found");
								}
								else {
									System.out.println("ID not found.");
								}
								scanner.nextLine();
							}
							else
							{
								System.out.println("Incorrect input");
							}
						}
						else
						{
							System.out.println("Incorrect input");
						}
						break;

					case 'n':
						System.out.println(table.elementCount() + " elements in table");
						break;

					case 'e':
						if(table.isEmpty())
							System.out.println("Table is empty.");
						else
							System.out.println("Table is not empty");
						break;

					case 'k':
						table.makeEmpty();
						System.out.println("Table is now empty.");
						break;

					case 'p':
						table.printTable();
						break;

					case 'o':
						Iterator iter = table.iterator();

						while(iter.hasNext())
						{
							System.out.println(iter.next());
						}
						break;

					case 'q': 
						System.out.println("quitting");
						run = false;
						break;
					default: 
						System.out.println("Invalid option choice");
						break;
				}
			}

			scanner.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found.");
		}
	}	
}
