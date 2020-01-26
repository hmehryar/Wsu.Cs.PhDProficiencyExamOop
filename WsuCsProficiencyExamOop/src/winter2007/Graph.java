/**
 * Thanks to  geeksforgeeks for nice implementation
 * Inspired from https://www.geeksforgeeks.org/implementing-generic-graph-in-java/
 * @author Haydar Mehryar
 */
package winter2007;

import java.util.*;

/**
 * 
 *
 */
public class Graph <T>{
	// We use Hashmap to store the edges
	private Map<T,List<T>> map ;
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
	
	//This function adds a new vertex to the graph
	public void addVertex(T s) {
		map.put(s, new LinkedList<T>());
	}
	
	//This function adds the edge between source to destination
	public void addEdge(T source,
						T destination) {
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
		for(T v: map.keySet()) {
			count+=map.get(v).size();
		}
		if(bidirectional==true) {
			count=count/2;
		}
		return count;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		for(T source:map.keySet()) {
			stringBuilder.append(source.toString()+":");
			for(T destination:map.get(source)) {
				stringBuilder.append(destination.toString()+" ");
			}
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}
	boolean delete(int id) {
		
		for(T v: map.keySet()) {
			if (v instanceof Vertex) {
				Vertex vertex =(winter2007.Vertex)v;
				if(id== vertex.getId()) {
					LinkedList<Vertex> adjacents=(LinkedList<Vertex>) map.get(vertex);
					for(Vertex adjacent:adjacents) {
						map.get(adjacent).remove(vertex);
					}
					map.get(vertex).clear();
					return true;
				}
			} 
		}
		
		
		return false;
	}
	boolean delete(int sourceId,int destinationId) {
		for(T v: map.keySet()) {
			if (v instanceof Vertex) {
				Vertex vertex =(winter2007.Vertex)v;
				if(sourceId== vertex.getId()) {
					LinkedList<Vertex> adjacents=(LinkedList<Vertex>) map.get(vertex);
					for(Vertex adjacent:adjacents) {
						
						if (adjacent.getId()==destinationId) {
							map.get(adjacent).remove(vertex);
							map.get(vertex).remove(adjacent);
							return true;
						}
					}
					
				}
			} 
		}
		return false;
	}
	int numOfLinks(int id) {
		for(T v: map.keySet()) {
			if (v instanceof Vertex) {
				Vertex vertex =(winter2007.Vertex)v;
				if(id== vertex.getId()) {
					LinkedList<Vertex> adjacents=(LinkedList<Vertex>) map.get(vertex);
					return adjacents.size();
				}
			} 
		}
		return 0;
	}
	int numOfLinks(int x1,int x2) {
		for(T v: map.keySet()) {
			if (v instanceof Vertex) {
				Vertex vertex =(winter2007.Vertex)v;
				if((x1== vertex.getX1()) &&(x2== vertex.getX2())) {
					LinkedList<Vertex> adjacents=(LinkedList<Vertex>) map.get(vertex);
					return adjacents.size();
				}
			} 
		}
		return 0;
	}
	String printEdges(int id) {
		StringBuilder stringBuilder=new StringBuilder();
		for(T v: map.keySet()) {
			if (v instanceof Vertex) {
				Vertex vertex =(winter2007.Vertex)v;
				if(id== vertex.getId()) {
					for(T destination:map.get(vertex)) {
						stringBuilder.append(vertex.toString()+" "+ destination.toString()+"\n");
					}
					return stringBuilder.toString();
				}
			} 
		}
		return stringBuilder.append(" ").toString();
	}
}
