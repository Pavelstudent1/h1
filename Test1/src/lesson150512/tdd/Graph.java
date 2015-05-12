package lesson150512.tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Graph {
	
	List<Integer>[] edges; //массив из списков целых чисел
	int edgeCount;

	public Graph(final int vertices) {
		if (vertices <= 0){
			throw new IllegalArgumentException("can't be zero");
		}
		edges = new List[vertices];
		for (int i = 0; i < edges.length; i++) {
			edges[i] = new ArrayList<Integer>();
		}
	}

	public void addEdge(final int from, final int to) {
		if (from >= edges.length || to >= edges.length){
			throw new IllegalArgumentException();
		}
		
		edges[from].add(to);
		edges[to].add(from);
		
		edgeCount++;
	}

	public int getEdges() {
		return edgeCount;
	}

	public boolean connected(final int i, final int j) {
		return edges[i].contains(j) && edges[j].contains(i);
	}

	public Iterable<Integer> adjacent(final int vertice) {
		return Collections.unmodifiableList(edges[vertice]);
	}
	
	

}
