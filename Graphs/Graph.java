package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private int V=0;
	private int E=0;
	private List<Integer>[] adj;
	
	@SuppressWarnings("unchecked")
	public Graph(int V){
		if(V<0){
			throw new IllegalArgumentException("Number of verticies can't be negative");
		}
		this.V = V;
		this.E =0;
		adj = (ArrayList<Integer>[]) new ArrayList[V];
		for(int i=0; i<V; i++){
			adj[i] = new ArrayList<Integer>();
		}
	}
	
	
	public int V(){
		return V;
	}
	
	public int E(){
		return E;
	}
	
	public void validateVertex(int v){
		if(v<0 || v>=V){
			throw new IndexOutOfBoundsException("Invalid vertex");
		}
	}
	
	public void addEdge(int v, int w){
		validateVertex(v);
		validateVertex(w);
		E++;
		adj[v].add(w);
		adj[w].add(v);
	}
	
	public Iterable<Integer> adj(int v){
		validateVertex(v);
		return adj[v];
	}
	
	public int degree(int v){
		validateVertex(v);
		return adj[v].size();
	}
	
	public String toString() {
        StringBuilder s = new StringBuilder();
        String NEWLINE = System.getProperty("line.separator");
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (int w : adj[v]) {
                s.append(w + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }
}
