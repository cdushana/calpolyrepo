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

import java.util.Scanner;

public class DictionaryMaker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type the filepath of the input file you wish to use.");
		String inFilepath = sc.next();
		
		System.out.println("Please type the filepath of the desired output file.");
		String outFilepath = sc.next();
		
		BST<String> bst = new BST<String>();
		
		// get next word
		String word = "";
		
		// if word not found, insert it into the tree
		if(!bst.find(word)) {
			bst.insert(word);
		}
		
		sc.close();
	}	
}
