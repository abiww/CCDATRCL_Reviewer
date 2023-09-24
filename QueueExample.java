import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
	
	public static void main(String[] args ) {
		
		Queue<String> line = new LinkedList<String>();

		/* enqueue (insert) = offer(e), add(e)
		 * dequeue (delete) = poll(), remove()
		 * examine (check) = peek(), element() 
		 * System.out.print(line.isEmpty());
		 * System.out.print(line.size());
		 * System.out.print(line.contains(e));
		*/
		
		line.add("A");
		line.add("B");
		line.add("C");
		
		System.out.print(line);
		
	}
}
