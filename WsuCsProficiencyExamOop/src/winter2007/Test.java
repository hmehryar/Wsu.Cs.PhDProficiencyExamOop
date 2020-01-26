/**
 * 
 */
package winter2007;

import java.awt.List;
import java.util.ArrayList;

/**
 * @author arsalan
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Object of graph is created. 
		Graph<Vertex> graph=new Graph<Vertex>(true);
		
		// edges are added. 
		// Since the graph is bidirectional
		ArrayList<Vertex> vertices= new ArrayList<Vertex>();
		vertices.add(new Vertex(0,0, 0));
		vertices.add(new Vertex(1,3, 0));
		vertices.add(new Vertex(2,0, 4));
		vertices.add(new Vertex(3,3, 4));
		vertices.add(new Vertex(4,2, 5));
        
		graph.addEdge(vertices.get(0), vertices.get(1));
        graph.addEdge(vertices.get(0), vertices.get(3));
        graph.addEdge(vertices.get(1), vertices.get(2));
        graph.addEdge(vertices.get(3), vertices.get(4));
        graph.addEdge(vertices.get(4), vertices.get(2));
        graph.addEdge(vertices.get(0), vertices.get(4));
        graph.addEdge(vertices.get(0), vertices.get(4));
        
        System.out.println("Vertices count: "+
        		graph.getVertexCount());
        System.out.println("Edge count: "+
        		graph.getEdgesCount());
		
        System.out.println(graph.toString());
		
		System.out.println("Deleting vertex");
		graph.delete(2);
		
		System.out.println(graph.toString());
		
		System.out.println("Deleting edge");
		graph.delete(4,3);
		System.out.println(graph.toString());
		
		
		System.out.println("Num of links from vertex id = 0 :"+graph.numOfLinks(0));
		System.out.println("Num of links from vertex (0,0) :"+graph.numOfLinks(0,0));
		
		System.out.println("List of edges strating from vertex id = 0 :\n"+graph.printEdges(0));
	}

}
