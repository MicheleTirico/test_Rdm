package testViz;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.ViewerListener;
import org.graphstream.ui.view.ViewerPipe;

public class vizGraph {
	
	static Graph graph = new SingleGraph("triangle");	 
	static Viewer viewer ;
	
	public static void main ( String []  args) {
		
		ViewerPipe ViewerPipe = viewer.newViewerPipe();
		
		ViewerPipe.pump();
		
		createGraph() ;
		
		setVizStyle(graph);
	
		viewer = graph.display( ) ;
		
	}	
	
	public static void createGraph() {
			
		graph.addNode("A" );
		graph.addNode("B" );
		graph.addNode("C" );
		graph.addEdge("AB", "A", "B");
		graph.addEdge("BC", "B", "C");
		graph.addEdge("CA", "C", "A");
	}
	
	public static void setVizStyle ( Graph graph ) {
		
		graph.addAttribute("ui.stylesheet", "graph { fill-color : green ; }");
		
		graph.addAttribute("ui.stylesheet", "node { fill-color : red ; }" );
		
		String idNode = "A";
		String styleNode = " node#"+idNode+ " {		"
				+ "shape: box;	size: 15px, 20px;	"
				+ "fill-mode: plain;   "
				+ "fill-color: red;   "
				+ "stroke-mode: plain; 	"
				+ "stroke-color: blue; "
				+ "}";
		
		graph.addAttribute ("ui.stylesheet",  styleNode );
		
		
	}
	



}
	


