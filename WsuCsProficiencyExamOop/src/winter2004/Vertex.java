/**
 * 
 */
package winter2004;


/**
 * @author Arsalan
 *
 */
public class Vertex {
	private String Label;
	/**
	 * @return the label
	 */
	public String getLabel() {
		return Label;
	}
	/**
	 * @param label
	 */
	public Vertex(String label) {
		super();
		Label = label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		Label = label;
	}
	@Override
	public String toString() {
		return "Vertex [Label=" + Label + "]";
	}
}
