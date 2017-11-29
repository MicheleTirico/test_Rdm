package testGraph;

import java.io.IOException;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;



import org.graphstream.stream.file.FileSourceDGS;


public class testReadGraph {
	
	public static Graph graph = new SingleGraph("graph");
	
	public static void main ( String[ ] args ) throws IOException   {

		String nameFile = "gino.dgs";
		String dossier	= "C:\\Users\\Michele TIRICO\\Desktop\\testReprtGraph\\";
		String filePath = dossier + nameFile ;
		
		FileSourceDGS source = new FileSourceDGS();
		
		source.addSink( graph );
		source.begin(filePath);
		
		while( source.nextEvents() ){	  /* Do whatever between two events */	}
		source.end();
	
		graph.display(false);
	}

}
