package bst;

import java.util.Scanner;

public class BstOperations {
	Node root;
	
	public BstOperations() {
		root = null;
	}
	
	public Node getNode(int item) {
		Node newNode = new Node();
		
		newNode.data = item;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
	
	 public void insertRecursiveHelper(int item) {
	        root = insertRecursive(root, item);
	    }

	    public Node insertRecursive(Node temp, int item) {
	        if (temp == null) {
	            return getNode(item);
	        }
	        else if (item < temp.data) {
	            temp.left = insertRecursive(temp.left, item);
	        }
	        else if (item > temp.data) {
	            temp.right = insertRecursive(temp.right, item);
	        }
	        return temp;
	    }

	    public void printInOrder(Node temp) {
	        if (temp != null) {
	            printInOrder(temp.left);
	            System.out.println(temp.data);
	            printInOrder(temp.right);
	        }
	    }

	    public void printPreOrder(Node temp) {
	        if (temp != null) {
	            System.out.println(temp.data);
	            printPreOrder(temp.left);
	            printPreOrder(temp.right);
	        }
	    }

	    public void printPostOrder(Node temp) {
	        if (temp != null) {
	            printPostOrder(temp.left);
	            printPostOrder(temp.right);
	            System.out.println(temp.data);
	        }
	    }

	    public void delete(int item) {
	        root = dltRcrsv(root, item);
	    }

	    public Node dltRcrsv(Node temp, int item) {
	        if (temp == null) {
	            return null;
	        }
	        else if (item < temp.data) {
	            temp.left = dltRcrsv(temp.left, item);
	        }
	        else if (item > temp.data) {
	            temp.right = dltRcrsv(temp.right, item);
	        }
	        else {
	            if (temp.left == null && temp.right == null) {
	                return null;
	            }
	            else if (temp.left == null) {
	                return temp.right;
	            }
	            else if (temp.right == null) {
	                return temp.left;
	            }

	            Node temp2 = findMin(temp.right);
	            temp.data = temp2.data;
	            temp.right = dltRcrsv(temp.right, temp2.data);
	        }
	        return temp;
	        
	    }

	    public Node findMin(Node temp) {
	        while (temp.left != null) {
	            temp = temp.left;
	        }
	        return temp;
	    }

	    public boolean search(int item) {
	        return searchRecursive(root, item);
	    }

	    public boolean searchRecursive(Node temp, int item) {
	        if (temp == null) {
	            return false;
	        }
	        else if (item == temp.data) {
	            return true;
	        }
	        else if (item < temp.data) {
	            return searchRecursive(temp.left, item);
	        }
	        else {
	            return searchRecursive(temp.right, item);
	        }
	    }

}
