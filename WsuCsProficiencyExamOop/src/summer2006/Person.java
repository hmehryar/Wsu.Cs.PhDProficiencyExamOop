/**
 * 
 */
package summer2006;

/**
 * @author Arsalan
 *
 */
public class Person {
	private String Name;
	private String Address;
	private CustomDateTime BirthDate;
	private String Description;
	private String TellNo;
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	/**
	 * @return the birthDate
	 */
	public CustomDateTime getBirthDate() {
		return BirthDate;
	}
	/**
	 * @param name
	 * @param address
	 * @param birthDate
	 * @param description
	 */
	public Person(String name, String address, CustomDateTime birthDate, String description,String tellNo) {
		super();
		Name = name;
		Address = address;
		BirthDate = birthDate;
		Description = description;
		TellNo=tellNo;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(CustomDateTime birthDate) {
		BirthDate = birthDate;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}
	/**
	 * @return the tellNo
	 */
	public String getTellNo() {
		return TellNo;
	}
	/**
	 * @param tellNo the description to set
	 */
	public void setTellNo(String tellNo) {
		TellNo = tellNo;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Address=" + Address + ", BirthDate=" + BirthDate.toString() + ", Description="
				+ Description + ", TellNo="
						+ TellNo + "]";
	}
	

}
