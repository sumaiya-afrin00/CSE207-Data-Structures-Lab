package stackOperations;

public class Operations {
	
	private int [] stack;
	private int top;
	
	public Operations(int []stack) {
		top = 0;
		this.stack = stack;
	}
	
	public void push(int item) {
		
		if(top == stack.length) {
			System.out.println("Stack is full. Can't push more!!");
		}else {
			stack[top] = item;
			top ++;
			System.out.println("pushed "+item);
		}
	}
	
	public void pop() {
		if(top == 0) {
			System.out.println("Stack is Empty. Nothing to pop!!");
		}else {
			top --;
			System.out.println("Popped 1st element!");
		}
		System.out.println();
	}
	
	public int peek() {
		if(top == 0) {
			System.out.println("Stack is Empty. Noting to peek!");
			return -1;
		}else {
		int peekElement = stack[top - 1];
		System.out.println("Peeked "+peekElement);
		return peekElement;
		}
	}
	
	public void printStack() {
		System.out.println("Current elements in the stack: ");
		for(int i = top -1; i>=0; i--) {
			System.out.println(stack[i]);
		}
		System.out.println();
	}
}