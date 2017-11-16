package java_test_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.GridGenerator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.graphicGraph.GraphPosLengthUtils;

public class compareDistance {
	
	// graph
	static Graph grid = new SingleGraph( "grid");
	
	// node to connect
	static Node n1 = grid.getNode( "2_2" ) ;
	
	// list of distance ( ? )
	static ArrayList<Double> listDistFromN1 = new ArrayList<Double> ();
	
	// map of distance ( id string , double distance ) 
	static Map<String , Double> mapDist = new HashMap< String , Double > () ;
	

	public static void main(String[] args) {
		
		// create graph
		createGraph ( );
		
		// create list of distance
		createList();
		
		// sorted list
		// ask nearest node
		//create connection
		
		// display graph
	//	grid.display(false);
				
	}
	
	
	
	
	// method to create list of distance
	public static void createList() {
		
		ArrayList<String> listId = new ArrayList<String> ();
		for ( Node a : grid.getEachNode()) {
			listId.add(a.getId()) ; 
			}
			System.out.println(listId);
			
	
	// iterator
	Iterator<Node> iterNode = grid.getNodeIterator();
	
	while (iterNode.hasNext()) {

		Node n = iterNode.next();
		
		double dist = 0 ;
		
		listId.remove(n);
		System.out.println(listId);
	
		}
		
	

	
	
	
	}


	

	
	
	
	
	// method compareTo
	
	// method to calculate distance between two nodes
	public static double calcDist (Node n1 , Node n2 ) {
		double dist ;
	
		double [] n1Coordinate = GraphPosLengthUtils.nodePosition(n1) ;
		double x1 = n1Coordinate [0];
		double y1 = n1Coordinate [1];
		double z1 = n1Coordinate [2];
		
		double [] n2Coordinate = GraphPosLengthUtils.nodePosition(n1) ;
		double x2 = n1Coordinate [0];
		double y2 = n1Coordinate [1];
		double z2 = n1Coordinate [2];
		
		double distSq = Math.pow( ( x1 - x2 ), 2 )  + Math.pow( ( y1 - y2 ), 2 ) + Math.pow( ( z1 - z2 ), 2 ) ;
		dist = Math.sqrt( distSq );
		
		return dist;
	}
	
	
	
	
	
	
	
	
	
	public static void createGraph ( ) {
		Generator gen = new GridGenerator(false, false);
		gen.addSink(grid);
		gen.begin();
		for(int i=0; i<5; i++) {	gen.nextEvents();	}
		gen.end();
	}
}
