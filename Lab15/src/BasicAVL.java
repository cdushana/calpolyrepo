/* 
 * Driver class to run the AVL tree
 *
 * @authors Christiana Ushana (cushana) & Devon Grove (djgrove)
 * @version Lab 15
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/28/15
 */

public class BasicAVL {
	
	private class AVLNode {
		int element;
		int height;
		AVLNode left;
		AVLNode right;
	}
	
	private AVLNode root;
	
	public BasicAVL() {
		root = null;
	}
	
	/*
	 * Inserts the given element into the appropriate location in the AVL tree
	 * @param int - the element to insert into the tree
	 */
	public void insert(int element) {
		root = insert(element, root);
	}
	
	private AVLNode insert(int element, AVLNode current) {
		if(current == null)
		{
			current = new AVLNode();
			current.element = element;
			current.left = current.right = null;
		}
		else if(element < current.element)
		{
			current.left = insert(element, current.left);
			if(height(current.left) - height(current.right) == 2)
			{
				if(element < current.left.element)
				{
					current = rotate1(current);
				}
				else
				{
					current = rotate2(current);
				}
			}
		}
		else if(element > current.element)
		{
			current.right = insert(element, current.right);
			if(height(current.right) - height(current.left) == 2)
			{
				if(element > current.right.element)
				{
					current = rotate4(current);
				}
				else
				{
					current = rotate3(current);
				}
			}
		}

		current.height = Math.max(height(current.left), height(current.right)) + 1;
		return current;
	}
	
	// insertion in the left sub-tree of left child
	private AVLNode rotate1(AVLNode n2) {
		AVLNode n1 = n2.left;
		n2.left = n1.right;
		n1.right = n2;

		// if(height(n2.left) < height(n2.right))
		// {
		// 	n2.height = 1 + height(n2.right);
		// }
		// else
		// {
		// 	n2.height = 1 + height(n2.left);
		// }

		// if(height(n1.left) < height(n1.right))
		// {
		// 	n1.height = 1 + height(n1.right);
		// }
		// else
		// {
		// 	n1.height = 1 + height(n1.left);
		// }

		return n1;
	}
	
	// insertion in the right sub-tree of left child
	private AVLNode rotate2(AVLNode n3) {
		n3.left = rotate4(n3.left);
		return rotate1(n3);
	}
	
	// insertion in the left sub-tree of right child
	private AVLNode rotate3(AVLNode n1) {
		n1.right = rotate1(n1.right);
		return rotate4(n1);
	}
	
	// insertion in the right sub-tree of right child
	private AVLNode rotate4(AVLNode n1) {
		AVLNode n2 = n1.right;
		n1.right = n2.left;
		n2.left = n1;

		// if(height(n1.left) < height(n1.right))
		// {
		// 	n1.height = 1 + height(n1.right);
		// }
		// else
		// {
		// 	n1.height = 1 + height(n1.left);
		// }

		// if(height(n2.left) < height(n2.right))
		// {
		// 	n2.height = 1 + height(n2.right);
		// }
		// else
		// {
		// 	n2.height = 1 + height(n2.left);
		// }

		return n2;
	}
	
	/*
	 * Private method to get height of tree
	 * @return int - the height of the AVL tree.
	 */
	private int height(AVLNode current) {
		// if(current != null)
		// {
		// 	return current.height;
		// }
		// else
		// {
		// 	return -1;
		// }

		if(current != null)
		{
			if(height(current.left) > height(current.right))
			{
				return 1 + height(current.left);
			}
			else
			{
				return 1 + height(current.right);
			}
		}

		return -1;
	}
	
	/*
	 * Recursively prints the tree
	 */
	public void print() {
		print(root, "");
	}
	
	// recursive support method for above
	private void print(AVLNode current, String space)
   {
      if(current != null)
      {
         System.out.print("\n" + space);
         System.out.print(current.element);
         space = space + "   ";
         print(current.left,space);
         print(current.right,space);
      }
   }
}
