public class StackArrayImplementation {
	int top;
	int capacity;
	int[] stack;
	
	StackArrayImplementation() {
		top = -1;
		capacity = 10;
		stack = new int[capacity];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == capacity-1;
	}
	
	public int push(int data) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		return stack[++top] = data;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		return stack[top--];
	}
	
	public int peek() {
		return stack[top];
	}
	
	public void display() {
		for(int i : stack) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] agrs) {
		StackArrayImplementation st = new StackArrayImplementation();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		System.out.println(st.capacity);
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.display();
	}
}
