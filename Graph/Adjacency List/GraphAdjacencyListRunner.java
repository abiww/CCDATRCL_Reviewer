package Graph;

public class GraphAdjacencyListRunner {
	public static void main(String[] args) {
		GraphAdjacencyList graphAdjacencyList = new GraphAdjacencyList();
		
		graphAdjacencyList.addNode(new Node('A')); //index 0
		graphAdjacencyList.addNode(new Node('B')); //index 1
		graphAdjacencyList.addNode(new Node('C')); //index 2
		graphAdjacencyList.addNode(new Node('D')); //index 3
		graphAdjacencyList.addNode(new Node('E')); //index 4
		
		graphAdjacencyList.addEdge(0, 1); //A -> B 
		graphAdjacencyList.addEdge(1, 2); //B -> C
		graphAdjacencyList.addEdge(1, 4); //B -> E
		graphAdjacencyList.addEdge(2, 3); //C-> D
		graphAdjacencyList.addEdge(2, 4); //C -> E
		graphAdjacencyList.addEdge(4, 0); //E -> A
		graphAdjacencyList.addEdge(4, 2); //E -> C
		
		graphAdjacencyList.print();
	}
}
