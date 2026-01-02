package bst;

public class Test {
	    public static void main(String[] args) {

	        BstOperations tree = new BstOperations();
	        
	        tree.root = tree.insertRecursive(tree.root, 50);
	        tree.root = tree.insertRecursive(tree.root, 30);
	        tree.root = tree.insertRecursive(tree.root, 70);
	        tree.root = tree.insertRecursive(tree.root, 20);
	        tree.root = tree.insertRecursive(tree.root, 40);
	        tree.root = tree.insertRecursive(tree.root, 60);
	        tree.root = tree.insertRecursive(tree.root, 80);

	       
	        System.out.println("In-order:");
	        tree.printInOrder(tree.root);
	        System.out.println();

	        System.out.println("Pre-order:");
	        tree.printPreOrder(tree.root);
	        System.out.println();

	        System.out.println("Post-order:");
	        tree.printPostOrder(tree.root);
	        System.out.println();

	        System.out.println("Search 40: " + tree.search(40));
	        System.out.println("Search 90: " + tree.search(90));

	        tree.delete(70);

	        System.out.println("After deleting 70 (In-order):");
	        tree.printInOrder(tree.root);
	        System.out.println();
	    }


		}


