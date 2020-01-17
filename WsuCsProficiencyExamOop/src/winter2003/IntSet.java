/**
 * 
 */
package winter2003;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collections.*;
import java.util.Iterator;

/**
 * @author Haydar MEhryar
 *
 */
public class IntSet {
	private ArrayList<Integer> members;
	
	public IntSet() {
		members=new ArrayList<Integer>();
	}
	public int isMemeber(int i) {
		boolean exist= members.contains(i);
		if (exist) {
			return 1;
		} 
		return 0;
	}
	public int insert(int i) {
		
		try {
			if (isMemeber(i)==1) {
				return 1;
			}
			members.add(i);
			return 1;
		} catch (Exception e) {
			// TODO: log and handle exception
			return 0;
		}
		
	}
	public int delete(int i) {
		try {
			if(isMemeber(i)!=1) {
				return 0;
			}
			int result= members.remove(i);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	public void print() {
		for (int item : this.members) {
			System.out.println(item);
		}
	}
	public IntSet union(IntSet input) {
		try {
			if (input==null)
				throw new Exception();
			IntSet union =new IntSet();
			union.members.addAll(input.members);
			union.members.addAll(this.members);
			return union;			
		} catch (Exception e) {
			// TODO: handle exception
			return this;
		}
	}
	
	public IntSet intersection(IntSet input) {
		try {
			if (input==null)
				throw new Exception();
			IntSet intersection=new IntSet();
			for(int item: input.members) {
				if (this.members.contains(item)) {
					 intersection.members.add(item)	;				
				}  
			}
			return intersection;			
		} catch (Exception e) {
			// TODO: handle exception
			return this;
		}
	}
}
