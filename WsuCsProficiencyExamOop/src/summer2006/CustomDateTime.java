/**
 * 
 */
package summer2006;

/**
 * @author Arsalan
 *
 */
public class CustomDateTime {
	private int Day;
	private int Month;
	private int Year;
	/**
	 * @return the day
	 */
	public int getDay() {
		return Day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		Day = day;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return Month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		Month = month;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return Year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		Year = year;
	}
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public CustomDateTime(int day, int month, int year) {
		super();
		Day = day;
		Month = month;
		Year = year;
	}
	@Override
	public String toString() {
		return "CustomDateTime [Day=" + Day + ", Month=" + Month + ", Year=" + Year + "]";
	}
	
	
}
