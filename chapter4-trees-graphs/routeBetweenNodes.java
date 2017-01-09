/*
4.1: Given a directed graph, design an algorithm to find out whether there is a route between two nodes.

Notes:
Utilizes BFS; Bidirectional Search would return faster solution
*/

boolean search(Graph g, Node start, Node end){
	if (start == end){
		return true;
	}
	// linked list operates as a queue
	LinkedList<Node> queue = new LinkedList<Node>();
	queue.add(start);

	while (!queue.isEmpty()){
		Node n = queue.removeFirst();
		if (!n.visited){
			if (n == end){
				return true;
			} else {
				for (Node k : k.getAdjacent()){
					queue.add(k);
				}
				n.visited = true;
			}
		}
	}
	return false;
}