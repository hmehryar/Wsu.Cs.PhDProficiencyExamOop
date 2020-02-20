/**
 * 
 */
package winter2006;

import java.util.HashSet;

/**
 * @author Neda
 *
 */
public class Set {
	private HashSet<Integer> elements;

	/**
	 * @return the element
	 */
	public HashSet<Integer> getElements() {
		return elements;
	}

	/**
	 * @param element the element to set
	 */
	public void setElements(HashSet<Integer> elements) {
		this.elements = elements;
	}

	/**
	 * @param elements
	 */
	public Set(HashSet<Integer> elements) {
		super();
		this.elements = elements;
	}
	
	@Override
	public String toString() {
		return "Set [elements=" + elements + "]";
	}

	public Set Union(Set secondarySet){
		HashSet<Integer> oTempHashSet=new HashSet<Integer>();
		oTempHashSet.addAll(this.getElements());
		oTempHashSet.addAll(secondarySet.getElements());
		Set oTempSet=new Set(oTempHashSet);
		return oTempSet;
	}
	public Set Intersection(Set secondarySet) {
		HashSet<Integer> oTempHashSet=new HashSet<Integer>();
		oTempHashSet.addAll(this.getElements());
		oTempHashSet.retainAll(secondarySet.getElements());
		Set oTempSet=new Set(oTempHashSet);
		return oTempSet;
	}
}
