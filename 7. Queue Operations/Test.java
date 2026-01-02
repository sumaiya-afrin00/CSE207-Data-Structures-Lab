package queue;

public class Test {
	public static void main(String[] args) {
		LinearQueue lq = new LinearQueue(5);
		
		lq.linEnqueue(10);
		lq.linEnqueue(20);
		lq.linEnqueue(30);
		lq.linEnqueue(40);
		lq.linEnqueue(50);
		
		lq.printLin();
		
		lq.linDequeue();
		lq.linDequeue();
		
		lq.printLin();
		
		System.out.println("\n");
		
		CirQueue cq = new CirQueue(5);
		
		cq.cirEnqueue(5);
		cq.cirEnqueue(10);
		cq.cirEnqueue(15);
		cq.cirEnqueue(20);
		cq.cirEnqueue(25);
		
		cq.printCir();
		
		cq.cirDequeue();
		cq.cirDequeue();
		
		cq.printCir();
		
	}

}
