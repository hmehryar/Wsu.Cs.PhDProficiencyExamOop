/**
 * 
 */
package winter2007;

/**
 * @author arsalan
 *
 */
public class Vertex {
	/**
	 * @param x1
	 * @param x2
	 */
	public Vertex(int id,
				  int x1, 
				  int x2
				  ) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.id=id;
	}
	private int x1;
	private int x2;
	private int id;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str= id+"("+x1+","+x2+")";
		return str;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the x1
	 */
	public int getX1() {
		return x1;
	}
	/**
	 * @param x1 the x1 to set
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}
	/**
	 * @return the x2
	 */
	public int getX2() {
		return x2;
	}
	/**
	 * @param x2 the x2 to set
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}
