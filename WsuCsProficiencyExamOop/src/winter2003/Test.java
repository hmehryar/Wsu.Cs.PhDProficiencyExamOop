/**
 * 
 */
package winter2003;

import java.util.Random;

/**
 * @author Haydar Mehryar
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test IntSet");
		IntSet oIntSet=new IntSet();
		Random oRandom=new Random();
		for (int i = 0; i < 5; i++) {
			int newMember= oRandom.nextInt(5);
			oIntSet.insert(newMember);
		}
		oIntSet.print();
		
		System.out.println("Test: Union Set");
		IntSet unionSet=new IntSet();
		for (int i = 0; i < 5; i++) {
			int newMember= oRandom.nextInt(100);
			unionSet.insert(newMember);
		}
		System.out.println("Input: new set for union");
		unionSet.print();
		
		System.out.println("Result: union");
		unionSet.union(oIntSet).print();
		
		
		System.out.println("Test: Intersection Set");
		IntSet intersectionSet=new IntSet();
		for (int i = 0; i < 5; i++) {
			int newMember= oRandom.nextInt(5);
			intersectionSet.insert(newMember);
		}
		System.out.println("Input: new set for intersection");
		intersectionSet.print();
		
		System.out.println("Result: intersection");
		intersectionSet.intersection(oIntSet).print();;
		
		
		
	}

}
