package linkedList;
import java.util.Scanner;
public class DoubleLinkedList {
    Node start;
    
    public DoubleLinkedList() {
        start = null;
    }
    Node getNode() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter data: ");
        int data = input.nextInt();
        return new Node(data);
    }
   public int countNodes() {
        int count = 0;
        Node temp = start;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertAtStart() {
        Node newNode = getNode();
        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
        System.out.println("Node inserted at start");
    }
    void insertAtEnd() {
        Node newNode = getNode();
        if (start == null) {
            start = newNode;
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println("Node inserted at end");
    }

    void insertAtPosition() {
        if (start == null) {
            System.out.println("List is empty. Inserting at start.");
            start = getNode();
            System.out.println("Node inserted at start");
            return;
        }

        System.out.print("Enter the position to insert the node: ");
        Scanner input = new Scanner(System.in);
        int position = input.nextInt();
        int total = countNodes();

        if (position < 1 || position > total + 1) {
            System.out.println("Invalid position. Valid positions: 1 to " + (total + 1));
            return;
        }

        if (position == 1) {
            insertAtStart();
            return;
        }

        if (position == total + 1) {
            insertAtEnd();
            return;
        }


        Node newNode = getNode();
        int c = 1;
        Node temp = start;
        while (c < position - 1) {
            temp = temp.next;
            c++;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        System.out.println("Node inserted at position " + position);
    }

    void deleteStart() {
        if (start == null) {
            System.out.println("List is empty");
        } else {
            System.out.println(start.data + " deleted from start");
            start = start.next;
            if (start != null) {
                start.prev = null;
            }
        }
    }

    void deleteEnd() {
        if (start == null) {
            System.out.println("List is empty");
        } else if (start.next == null) {
            System.out.println(start.data + " deleted from end");
            start = null;
        } else {
            Node temp = start;
            while (temp.next != null && temp.next.next != null) {
                temp = temp.next;
            }
            if (temp.next != null) {
                System.out.println(temp.next.data + " deleted from end");
                temp.next = null;
            }
        }
    }

    void deleteAtPosition() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Enter the position to delete the node: ");
        Scanner input = new Scanner(System.in);
        int position = input.nextInt();
        int total = countNodes();

        if (position < 1 || position > total) {
            System.out.println("Invalid position. Valid positions: 1 to " + total);
            return;
        }
        if (position == 1) {
            deleteStart();
            return;
        }
        if (position == total) {
            deleteEnd();
            return;
        }
        int c = 1;
        Node temp = start;
        while (c < position - 1) {
            temp = temp.next;
            c++;
        }
        if (temp.next != null) {
            System.out.println(temp.next.data + " deleted from position " + position);
            temp.next = temp.next.next;
            if (temp.next != null) {
                temp.next.prev = temp;
            }
        }
    }

    void traverse() {
        if (start == null) {
            System.out.println("List is empty");
        } else {
            Node temp = start;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) {
                    System.out.print(" <-> ");
                }
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
