package java_test_02;

import java.util.List;


import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.GridGenerator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.geom.Point3;
import org.graphstream.ui.graphicGraph.GraphPosLengthUtils;
import org.graphstream.ui.view.Viewer;
import org.graphstream.algorithm.Toolkit.*;


public class coordinate {

	static Graph grid = new SingleGraph (" test ") ;
	
	public static void main(String[] args) {

		Generator gen = new GridGenerator(false, false);
		
		gen.addSink(grid);
		gen.begin();
		
		for(int i=0; i<2; i++) {
			gen.nextEvents();
		}
	
		gen.end();
		

		
		for ( Node n : grid.getEachNode()) {
			String id = n.getId() ;
			

	
			double [] p = GraphPosLengthUtils.nodePosition(n) ;
			int ax = 0 ; // if ax = 0, return x coordinate, else return y
			System.out.println(p[ax]) ;
			
			
			
			}

		
	}

}
