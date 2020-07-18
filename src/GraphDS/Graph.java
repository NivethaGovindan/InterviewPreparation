package GraphDS;

import java.util.*;

public class Graph{
	int V;
	LinkedList<Integer>[] adjListArray;
	
	Graph(int V){
		this.V = V;
		adjListArray = new LinkedList[V];
		
		for(int i=0; i<V; i++){
			adjListArray[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v){
		adjListArray[u].add(v);
		adjListArray[v].add(u);
	}
	
	public void printGraph(Graph graph){
		for(int i=0; i<V; i++){
			System.out.println("Adjaceny list of vertex "+i);
			System.out.print("head");
			for(Integer edgeto : graph.adjListArray[i]){
				System.out.print("-->"+edgeto);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		int V = 5;
		Graph graph = new Graph(V);
		graph.addEdge(0,1);
		graph.addEdge( 0, 4);
		graph.addEdge( 1, 2);
		graph.addEdge( 1, 3);
		graph.addEdge( 1, 4);
		graph.addEdge( 2, 3);
		graph.addEdge( 3, 4);
		
		graph.printGraph(graph);
	}
	
	
	

}
