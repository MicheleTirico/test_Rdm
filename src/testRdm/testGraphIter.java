package testRdm;

import java.util.Iterator;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

public class testGraphIter {
	
	public static void main(String args[]) {
		Graph graph = new SingleGraph("Tutorial 1");
		
		graph.addNode("A" );
		graph.addNode("B" );
		graph.addNode("C" );
		graph.addEdge("AB", "A", "B");
		graph.addEdge("BC", "B", "C");
		graph.addEdge("CA", "C", "A");
	
	//	graph.display();
		
	//	loop(graph);
	//	iter(graph);	
	}
	
	public static void loop (Graph graph) {
		
		for ( Node n : graph.getEachNode() ) {
			
			System.out.println(n.getId());
		}
	}
	
	public static void iter (Graph graph) {
		
		Iterator it = graph.iterator();
		
		while (it.hasNext()) {
				
			Node n = (Node) it.next();
			
			System.out.println(n.getId()); 
		}
	}
}


