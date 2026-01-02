package queue;

public class CirQueue {
	private int [] data;
	private int front;
	private int rear;
	private int count;
	
	public CirQueue(int size) {
		this.data = new int[size];
		front = 0;
		rear = 0;
		count = 0;
	}
	
	public void cirEnqueue(int item) {
		if(count == data.length) {
			System.out.println("Queue full");
		}else {
			data[rear] = item;
			rear = (rear + 1) % data.length;
			count ++;
		}
	}
	
	public void cirDequeue() {
		if(count == 0) {
			System.out.println("Empty Queue");
		}else {
			System.out.println(data[front] + " deleted!");
			front = (front + 1)% data.length;
			count --;
		}
	}
	
	public void printCir() {
		if(count == 0) {
			System.out.println("Empty Queue");
		}else {
			System.out.println("Circular Queue Elements: ");
			
			int f = front;
			int c = count;
			
			while(c>0) {
				System.out.println(data[f]+" ");
				f = (f+1)%data.length;
				c--;
			}
			System.out.println();
		}
	}

}
