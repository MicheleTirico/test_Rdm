package testGraph;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

import org.graphstream.graph.implementations.DefaultGraph;
import org.graphstream.stream.file.FileSinkDGS;
import org.graphstream.stream.file.FileSinkDOT;
import org.graphstream.stream.file.FileSource;
import org.graphstream.stream.file.FileSourceFactory;

import java.io.IOException;

public class testReportGraph {
	
	public static Graph graph = new SingleGraph("graph");
	
	static String nameFile = "peppe";
	static String filePath = "C:\\Users\\Michele TIRICO\\Desktop\\testReprtGraph\\gino.dgs" ;
	
	public static void main ( String[ ] args ) throws IOException {
		
		graphstream_dev_toolkit.runTest.createGraph(graph, 10, false );
		
		testWite2 ();
		

	}
	
	
	public static void testWite2 () throws IOException {
		
		FileSinkDGS fsd = new FileSinkDGS();
		
		graph.write(fsd, filePath);
		
		
	}
	
	public static void testWite1 () throws IOException {
		
		
//		graph.display(false);	
	
//		String source = "C:\\Users\\Michele TIRICO\\Desktop\\testReprtGraph";
//		FileSource fs = FileSourceFactory.sourceFor(source) ;
	
//		fs.addSink(graph);
	
		
		FileSinkDOT fsd = new FileSinkDOT();
	
		graph.write(fsd, filePath);
	}
}