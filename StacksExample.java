import java.util.Stack;

public class StacksExample {
	
	public static void main(String[] args) {
		
		Stack<Character> tower = new Stack<Character>();
		
		/*
		tower.pop();
		tower.push('W');
		tower.peek();
		tower.size();
		tower.search('R');
		
		for (int i = 0; i < 10; i++) {
			tower.push('W');
		}	
		*/
		
		tower.push('R');
		tower.push('B');
		tower.push('Y');
		
		System.out.print(tower);
		
	}
}
