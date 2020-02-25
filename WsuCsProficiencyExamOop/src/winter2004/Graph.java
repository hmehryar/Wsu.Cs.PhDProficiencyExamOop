/**
 * Thanks to  geeksforgeeks for nice implementation
 * Inspired from https://www.geeksforgeeks.org/implementing-generic-graph-in-java/
 * @author Haydar Mehryar
 */
package winter2004;

import java.util.*;

/**
 * 
 *
 */
public class Graph {
	// We use Hashmap to store the edges
	private Map<Vertex,List<Vertex>> map ;
	/**
	 * @param map
	 * @param bidirectional
	 */
	public Graph(boolean bidirectional) {
		super();
		this.map = new HashMap<>();
		this.bidirectional = bidirectional;
	}
	private boolean bidirectional;
	
	//This function modifies specified vertex label
	public void modifyVertexLabel(String label,String newLabel) {
		
		  map.put( new Vertex(newLabel) ,map.get( new Vertex(label) ));
		  map.remove(new Vertex(label));
	}
	//This function adds a new vertex to the graph
	public void addVertex(Vertex s) {
		map.put(s, new LinkedList<Vertex>());
	}
	
	//This function adds the edge between source to destination
	public void addEdge(Vertex source,
						Vertex destination) {
		if(!map.containsKey(source)) {
			addVertex(source);
		}
		if(!map.containsKey(destination)) {
			addVertex(destination);
		}
		//for avoid adding multiple duplicate edges 
		if(map.get(source).contains(destination)) {
			return;
		}
		
		map.get(source).add(destination);
		if(bidirectional==true) {
			map.get(destination).add(source);
		}
		
	}
	int getVertexCount() {
		return map.keySet().size();
	}
	int getEdgesCount() {
		int count=0;
		for(Vertex v: map.keySet()) {
			count+= map.get(v)!=null? map.get(v).size():0;
		}
		if(bidirectional==true) {
			count=count/2;
		}
		return count;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		for(Vertex source:map.keySet()) {
			stringBuilder.append(source.toString()+":");
			if (map.get(source)!=null) {
				for(Vertex destination:map.get(source)) {
					stringBuilder.append(destination.toString()+" ");
				}	
			}
			
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}
	boolean delete(String label) {
		
		for(Vertex vertex: map.keySet()) {
		
				
				if(label== vertex.getLabel()) {
					LinkedList<Vertex> adjacents=(LinkedList<Vertex>) map.get(vertex);
					for(Vertex adjacent:adjacents) {
						map.get(adjacent).remove(vertex);
					}
					map.get(vertex).clear();
					return true;
				}
			} 
		
		
		
		return false;
	}
	boolean delete(String source,String destination) {
		for(Vertex v: map.keySet()) {
			
				Vertex vertex =(Vertex)v;
				if(source== vertex.getLabel()) {
					LinkedList<Vertex> adjacents=(LinkedList<Vertex>) map.get(vertex);
					for(Vertex adjacent:adjacents) {
						
						if (adjacent.getLabel()==destination) {
							map.get(adjacent).remove(vertex);
							map.get(vertex).remove(adjacent);
							return true;
						}
					}
					
				}
			} 
		
		return false;
	}
	int numOfLinks(String label) {
		for(Vertex v: map.keySet()) {
		
				Vertex vertex =(Vertex)v;
				if(label== vertex.getLabel()) {
					LinkedList<Vertex> adjacents=(LinkedList<Vertex>) map.get(vertex);
					return adjacents.size();
				}
			} 
		
		return 0;
	}
	
	String printEdges(String label) {
		StringBuilder stringBuilder=new StringBuilder();
		for(Vertex vertex: map.keySet()) {
				if(label==vertex.getLabel()) {
					for(Vertex destination:map.get(vertex)) {
						stringBuilder.append(vertex.toString()+" "+ destination.toString()+"\n");
					}
					return stringBuilder.toString();
				}
			} 
		
		return stringBuilder.append(" ").toString();
	}
}
