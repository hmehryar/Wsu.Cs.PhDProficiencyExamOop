/**
 * 
 */
package winter2006;

import java.util.HashSet;

/**
 * @author Arsalan
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> oFirstHashSet=new HashSet<Integer>();
		oFirstHashSet.add(1);
		oFirstHashSet.add(2);
		oFirstHashSet.add(3);
		oFirstHashSet.add(4);
		oFirstHashSet.add(5);
		oFirstHashSet.add(5);
		oFirstHashSet.add(5);
		oFirstHashSet.add(5);
		oFirstHashSet.add(6);
		Set oFirstSet=new Set(oFirstHashSet);
		System.out.println("First Set");
		System.out.println(oFirstSet.toString());
		
		HashSet<Integer> oSecondHashSet=new HashSet<Integer>();
		oSecondHashSet.add(4);
		oSecondHashSet.add(5);
		oSecondHashSet.add(6);
		oSecondHashSet.add(6);
		oSecondHashSet.add(7);
		Set oSecondSet=new Set(oSecondHashSet);
		System.out.println("Second Set");
		System.out.println(oSecondSet.toString());
		
		System.out.println("Testing Union");
		Set oUnion= oFirstSet.Union(oSecondSet);
		System.out.println(oUnion.toString());
		
		System.out.println("Testing Intersection");
		Set oIntersection= oFirstSet.Intersection(oSecondSet);
		System.out.println(oIntersection.toString());
		
		
		
	}

}
