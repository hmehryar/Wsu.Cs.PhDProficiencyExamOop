/**
 * 
 */
package fall2005;

/**
 * @author Neda
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Sample Studdent Ohject with null constructor"); 
		Student oStudentSimple=new Student();
		oStudentSimple.insert(11111, "John", "123 Success", "Freshman");
		oStudentSimple.print();
		
		System.out.println("Sample Studdent Ohject with non-null constructor");
		Student oStudent=new Student(11111, "John", "123 Success", "Freshman");
		
		oStudent.insert(44444, "Phil", "012 Luke", "Senior");
		oStudent.insert(22222, "Mary", "586 Main Street", "Sophomore");
		oStudent.insert(33333, "Arthur", "789 Long lake", "Junior");
		
		oStudent.insert(55555, "Arsaln", "121 Hancock", "Senior");  
		System.out.println("Count of Students");  
		System.out.println(Integer.toString(oStudent.count()));
		  
		System.out.println("List of Students");
		oStudent.print();
		 
		System.out.println("Updating 55555");
		oStudent.update(55555, "Arsaln Meheyar", "1110 Hancock", "Freshman");
		oStudent.print();
		
		System.out.println("Deleting 55555");
		oStudent.delete(55555);
		
		System.out.println("Sorting By Id");
		oStudent.sortById();
		
		System.out.println("Select By Id");
		oStudent.select(22222);
		
		System.out.println("Select Freshman");
		oStudent.insert(55555, "Arsaln Meheyar", "1110 Hancock", "Freshman");
		oStudent.selectFreshman().print();
	}

}
