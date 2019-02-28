package problem03;

public class MyStack {
	
	private int top = -1;
	private String[] buffer;
	private int size = 0;
	
	public MyStack( int size ) {
		this.buffer = new String[size];
	}
	
	public void push(String item) {
		if(size() >= buffer.length) {
			throw new StackOverflowError();
		}
		
		size++;
		buffer[++top] = item;
	}

	public String pop() {
		
		if(top == -1) {
			throw new StackUnderflowError();
		}
		
		size--;
		return buffer[top--];
	}

	public boolean isEmpty() {
		return top == -1 ? true : false;
	}
	
	public int size() {
		return size;
	}
	
	class StackUnderflowError extends RuntimeException {
		
	}
}