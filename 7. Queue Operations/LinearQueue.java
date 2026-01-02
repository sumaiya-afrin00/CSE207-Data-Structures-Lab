package queue;

public class LinearQueue {
	private int []data;
	private int front;
	private int rear;
	
	public LinearQueue(int size) {
		this.data = new int[size];
		front = 0;
		rear = 0;
	}
	
	public void linEnqueue(int item) {
		if(rear == data.length) {
			System.out.println("Queue full.");
		}
		else {
			data[rear] = item;
			rear++;
		}
	}
	
	public void linDequeue() {
		if(front == rear) {
			System.out.println("Empty Queue!");
		}
		else {
		System.out.println(data[front]+" deleted!");
		front ++;
		}
	}
	
	public void printLin() {
		if(front == rear) {
			System.out.println("Empty Queue!");
		}
		else {
			System.out.println("Linear Queue Elements: ");
			for(int i = front; i<rear; i++) {
				System.out.println(data[i]+" ");
			}
			System.out.println();
		}
	}
}
