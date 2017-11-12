package testRdm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.GridGenerator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

public class testGetNeig {
	

	public static void main (String[] args)  {
		
		Graph graph = new SingleGraph("test");
		Map<String, Double> map0 = new HashMap<String, Double> ();
		Map<String, Double> map1 = new HashMap<String, Double> ();	
		
		createGrid(graph, 3);
		setAttr(graph);
		createColl(graph, map0);
		
		
		//		graph.display();
		exploreGraph(graph);
		System.out.println("map0 = " + map0);
		

		
		

	}
	
	public static void createGrid (Graph graph, int size) {		
		Generator GsGen4 = new GridGenerator(false, false);
		GsGen4.addSink(graph);
		GsGen4.begin();
		for(int i = 0 ; i < size ; i++) { 	GsGen4.nextEvents(); 	}
		GsGen4.end();
	}
	
	public static void setAttr (Graph graph) {
		Iterator<Node> it = graph.iterator();
		
		while (it.hasNext() ) {
			Node n = it.next();
			n.addAttribute("marked", 0 );	
			n.addAttribute("act", .5);
			
		}
	}
	
	public static void createColl (Graph graph, Map map0) {
	
		for (Node n : graph.getEachNode()) {
			map0.put(n.getId(), n.getAttribute("act"));
		}	
	}
	
	public static void exploreGraph ( Graph graph) {
		
		Node n =  graph.getNode(0_0);
		
		Iterator<Node> it = n.getNeighborNodeIterator();
								//testare anche n.getBreadthFirstIterator()
		  
		while (it.hasNext()) {
			
			n = it.next();
			
			double act = n.getAttribute("act");
			System.out.println(n);
			double dif1;
			
			
			
			
			
			
			
		}		
	}
}
