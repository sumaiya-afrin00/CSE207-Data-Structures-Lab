package stackOperations;

public class Test {
	public static void main(String[] args) {
		
	final int size = 5;
	int [] stack = new int[size];
	
	Operations op = new Operations(stack);
	System.out.println("Performing popping elements:\n");
	op.pop();
	System.out.println("Pushing Elements onto Stack:\n");
	op.push(10);
	op.push(20);
	op.push(30);
	op.push(40);
	op.push(50);
	op.push(60);
	System.out.println();
	op.printStack();
	
	System.out.println("Performing popping elements:");
	op.pop();
	op.printStack();

	op.peek();
	System.out.println();
	op.printStack();

	}
}
