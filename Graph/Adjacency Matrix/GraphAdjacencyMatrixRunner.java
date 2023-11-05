package Graph;

public class GraphAdjacencyMatrixRunner {
	
	public static void main(String[] args) {
		GraphAdjacencyMatrix graphAdjacentMatrix = new GraphAdjacencyMatrix(5);
		
		graphAdjacentMatrix.addNode(new Node('A')); //index 0
		graphAdjacentMatrix.addNode(new Node('B')); //index 1
		graphAdjacentMatrix.addNode(new Node('C')); //index 2
		graphAdjacentMatrix.addNode(new Node('D')); //index 3
		graphAdjacentMatrix.addNode(new Node('E')); //index 4
		
		graphAdjacentMatrix.addEdge(0, 1); //A -> B 
		graphAdjacentMatrix.addEdge(1, 2); //B -> C
		graphAdjacentMatrix.addEdge(1, 4); //B -> E
		graphAdjacentMatrix.addEdge(2, 3); //C-> D
		graphAdjacentMatrix.addEdge(2, 4); //C -> E
		graphAdjacentMatrix.addEdge(4, 0); //E -> A
		graphAdjacentMatrix.addEdge(4, 2); //E -> C
		
		graphAdjacentMatrix.print();
		System.out.println(graphAdjacentMatrix.checkEdge(0, 1)); //check if there's an edge between nodes or vertices
	}

}
