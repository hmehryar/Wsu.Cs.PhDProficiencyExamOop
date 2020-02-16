/**
 * 
 * 
 */
package summer2006;

/**
 * @author Arsalan
 *
 */
public class Test {

	/**
	 * @param args
	 */
		// Driver Program to test above functions 
		public static void main(String[] args) { 
		   BinarySearchTreeAddressbook tree = new BinarySearchTreeAddressbook(); 

		   Person oPerson;
		   
		   oPerson=new Person("31","",new CustomDateTime(0, 0, 2003),"","");
		   tree.insert(oPerson);
		   
		   oPerson=new Person("41","",new CustomDateTime(0, 0, 2003),"","");
		   tree.insert(oPerson);
		   
		   oPerson=new Person("51","",new CustomDateTime(0, 0, 2003),"","");
		   tree.insert(oPerson);
		   
		   oPerson=new Person("11","",new CustomDateTime(0, 0, 2007),"","");
		   tree.insert(oPerson);
		   
		   oPerson=new Person("56","",new CustomDateTime(0, 0, 2006),"","");
		   tree.insert(oPerson); 
		   
		
		  oPerson=new Person("30","",new CustomDateTime(0, 0, 2005),"","");
		  tree.insert(oPerson);
		  
		  oPerson=new Person("20","",new CustomDateTime(0, 0, 2000),"","");
		  tree.insert(oPerson);
		  
		  oPerson=new Person("40","",new CustomDateTime(0, 0, 2001),"","");
		  tree.insert(oPerson);
		  
		  oPerson=new Person("70","",new CustomDateTime(0, 0, 2002),"","");
		  tree.insert(oPerson);
		  
		  oPerson=new Person("60","",new CustomDateTime(0, 0, 2003),"","");
		  tree.insert(oPerson);
		  
		  oPerson=new Person("61","",new CustomDateTime(0, 0, 2003),"","");
		  tree.insert(oPerson);
		  
		  oPerson=new Person("80","",new CustomDateTime(0, 0, 2003),"","");
		  tree.insert(oPerson);
		  

		   System.out.println("Inorder traversal of the given tree"); 
		   tree.inorder(); 

		    System.out.println("\nDelete 20"); tree.deleteKey(new Person( "20","",new
			CustomDateTime(0, 0, 2003),"",""));
			System.out.println("Inorder traversal of the modified tree");
			tree.inorder();
		   
		
		  System.out.println("\nDelete 20"); tree.deleteKey(new Person( "20","",new
		  CustomDateTime(0, 0, 2003),"",""));
		  System.out.println("Inorder traversal of the modified tree"); tree.inorder();
		  
		  System.out.println("\nDelete 30"); tree.deleteKey(new Person( "30","",new
		  CustomDateTime(0, 0, 2003),"",""));
		  System.out.println("Inorder traversal of the modified tree"); tree.inorder();
		  
		  System.out.println("\nDelete 50"); tree.deleteKey(new Person( "50","",new
		  CustomDateTime(0, 0, 2003),"",""));
		  System.out.println("Inorder traversal of the modified tree"); tree.inorder();
		  
		  System.out.println("Node modification in the tree"); tree.modify(new
		  Person("61","modifiedAddress",new CustomDateTime(1, 1, 1),
		  "modifiedDescription", "modified313313313"));
		  
		  System.out.println("Inorder traverse"); tree.inorder();
		  
		  tree.listByYear(2003);
		  
		  tree.listAll();
		 
		}
	}
