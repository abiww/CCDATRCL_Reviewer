import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args ) {
		
		Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		queue.offer("B");
		queue.offer("E");
		queue.offer("C");
		queue.offer("A");
		queue.offer("D");
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
