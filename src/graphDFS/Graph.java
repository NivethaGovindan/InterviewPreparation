package graphDFS;

import java.util.*;


public class Graph {
	
	int V;
	LinkedList<Integer>[] adjListArray;
	boolean[] visited;
	
	Graph(int V){
		this.V = V;
		adjListArray = new LinkedList[V];
		visited = new boolean[V];
		
		for(int v = 0; v<V; v++){
			adjListArray[v] = new LinkedList();
		}
	}
	
	void addEdge(int u, int v){
		adjListArray[u].add(v);
		adjListArray[v].add(u);
	}
	
	void resetVisitedArray(){
		for(int v=0; v<V; v++){
			visited[v] = false;
		}
	}
	
	void DFS(Graph g, int source){
		visited[source] = true;
		
		System.out.print(source+" ");
		
		for(int v: g.adjListArray[source]){
			if(!visited[v]){
				DFS(g,v);
			}
		}
	}
	
	void BFS(Graph g, int source){
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(source);
		visited[source] = true;
		
		while(!queue.isEmpty()){
			int v = queue.poll();
			System.out.print(v+" ");
			
			for(int u: g.adjListArray[v]){
				if(!visited[u]){
					queue.add(u);
					visited[u] = true;
				}
			}
		}
		
		
	}
	
	public static void main(String[] args){
		Graph g = new Graph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
        g.DFS(g,2);
        
        System.out.println();
        
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");
        g.resetVisitedArray();
        g.BFS(g,2);
		
	}
	
	

}
