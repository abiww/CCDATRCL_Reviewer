package Graph;

import java.util.*;

public class GraphAdjacencyList {
	ArrayList<LinkedList<Node>> alist;
		
		GraphAdjacencyList() {
			alist = new ArrayList<>();
		}
		
		public void addNode(Node node) {
			LinkedList<Node> currentList = new LinkedList<>();
			currentList.add(node);
			alist.add(currentList);
		}
		
		public void addEdge(int source, int destination) {
			LinkedList<Node> currentList = alist.get(source);
			Node destinationNode = alist.get(destination).get(0);
			currentList.add(destinationNode);
		}
		
		public boolean checkEdge(int source, int destination) {
			LinkedList<Node> currentList = alist.get(source);
			Node destinationNode = alist.get(destination).get(0);
			
			for (Node node : currentList) {
				if (node == destinationNode) {
					return true;
				}
			}
			return false;
		}
		
		public void print() {
			for (LinkedList<Node> currentList : alist) {
				for (Node node : currentList) {
					System.out.print(node.data + " -> ");
				}
				System.out.println();
			}
		}
}
