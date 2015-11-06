/* 
 * DictionaryMaker is a class to use a BST to sort words alphabetically
 * much like a dictionary, outputting to a text file
 *
 * @authors Christiana Ushana () & Devon Grove (djgrove)
 * @version Program 3
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/6/15
 */

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Scanner;

public class DictionaryMaker {
	
	public static void main(String[] args) {
		// create new scanner
		Scanner sc = new Scanner(System.in);
		
		// get input/output filenames
		System.out.println("Please type the filepath of the input file you wish to use.");
		String inFilepath = sc.next();
		
		System.out.println("Please type the filepath of the desired output file.");
		String outFilepath = sc.next();
		sc.close();
		
		// create new BST to store the dictionary
		BST<String> bst = new BST<String>();
		
		try {
			// create output and input streams to parse file and output
			FileInputStream inFile = new FileInputStream(inFilepath);
			PrintStream outFile = new PrintStream(outFilepath);
			Scanner fileScanner = new Scanner(inFile);
			// relevant stuff to try ends here
			
			// get next word
			String word = "";
			
			while(fileScanner.hasNextLine()) {
				word = fileScanner.next();
				
				// if word not found, insert it into the tree
				if(!bst.find(word)) {
					bst.insert(word);
				}
			}
			
			// create iterator, then iterate over tree while there is a next element
			Iterator<String> itr = bst.iteratorIn();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
		catch(Exception e) {
			System.out.println("One of the filepaths could not be resolved to a file.");
		}
	}	
}
