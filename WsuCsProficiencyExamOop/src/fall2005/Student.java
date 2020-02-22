/**
 * 
 */
package fall2005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Arsalan
 *
 */
public class Student implements Comparable {
	private int id;
	@Override
	public int compareTo(Object o) {
		int result=this.getId()-(((Student)o).getId());
		return result;
	}

	private String name;
	private String address;
	private String status;
	
	private ArrayList<Student> items;

	/**
	 * @param id
	 * @param name
	 * @param address
	 * @param status
	 */
	public Student(int id, String name, String address, String status) {
		super();
		this.items=new ArrayList<Student>();
		this.id = id;
		this.name = name;
		this.address = address;
		this.status = status;
		this.items.add(this);
	}

	/**
	 * 
	 */
	public Student() {
		super();
		items=new ArrayList<Student>();
	}
	public int count() {
		return items.size();
	}
	public void print() {
		for (Student student : items) {
			System.out.println(student.toString());
		}
	}
	public void select(int id) {
		for(Student student:items) {
			if (student.getId()==id) {
				System.out.println(student.toString()); 
			}
		}
	}
	public Student selectFreshman() {
		Student outputStudent=new Student();
		for (Student student : this.getItems()) {
			if (student.getStatus().compareToIgnoreCase("Freshman")==0) {
				outputStudent.items.add(student);
			} 
		}
		return outputStudent;
	}
	public boolean insert(int id, String name, String address, String status) {
		try {
			Student oStudent= new Student(id, name, address, status); 
			this.items.add(oStudent);
			return true;
		} catch (Exception e) {
			//log error
			return false;
		}
	} 
	public boolean delete(int id) {
		try {
			for (int i=0;i<items.size();i++) {
				if (items.get(i).getId()==id) {
					items.remove(i);
					return true;
				}
			}
		} catch (Exception e) {
			// log error
			return false;
		}
		return false;
	}
	
	public boolean update(int id, String name, String address, String status) {
		try {
			for (Student student:items) {
				if (student.getId()==id) {
					
					student.setName(name);
					student.setAddress(address);
					student.setStatus(status);
					return true;
				}
			}
		} catch (Exception e) {
			// log error
			return false;
		}
		return false;
	}
	public Student sortById() {
		Student oStudent=this;
		Collections.sort(oStudent.items);
		return oStudent;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		String studentString="[id:"+this.getId()+
				",name:"+this.getName()+
				",address:"+this.getAddress()+
				",status:"+this.getStatus()+"]";
		return studentString;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		if(status.compareToIgnoreCase("Freshman")==0||
				status.compareToIgnoreCase("Sophomore")==0||
				status.compareToIgnoreCase("Junior")==0||
				status.compareToIgnoreCase("Senior")==0)
		this.status = status;
	}

	/**
	 * @return the items
	 */
	public ArrayList<Student> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<Student> items) {
		this.items = items;
	}
}
