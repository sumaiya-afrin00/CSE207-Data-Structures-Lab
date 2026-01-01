package linkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();

        System.out.println("Insert 2 nodes at start:");
        list.insertAtStart();
        list.insertAtStart();
        list.traverse();

        System.out.println("\nInsert 2 nodes at end:");
        list.insertAtEnd();
        list.insertAtEnd();
        list.traverse();

        System.out.println("\nInsert node at a specific position:");
        list.insertAtPosition();
        list.traverse();

        System.out.println("\nDelete first node:");
        list.deleteStart();
        list.traverse();

        System.out.println("\nDelete last node:");
        list.deleteEnd();
        list.traverse();

        System.out.println("\nDelete node at a specific position:");
        list.deleteAtPosition();
        list.traverse();

        System.out.println("\nTotal nodes now: " + list.countNodes());
        input.close();
    }
}
