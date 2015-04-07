package Graphs;

public class Main {
	public static void main(String[] args){
		Graph g = new Graph(10);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		System.out.println(g.toString());
	}
}
