/**
 * 
 */
package summer2006;

import java.util.ArrayList;

/**
 * @author Arsalan
 *
 */
public class AddressBook {
	// A utility function to search a given key in BST 
	public Node search(Node root, String key) 
	{ 
	    // Base Cases: root is null or key is present at root 
	    if (root==null ||  root.key.getName().compareToIgnoreCase(key)==0) 
	        return root; 
	  
	    // val is greater than root's key 
	    if (root.key.getName().compareToIgnoreCase (key) ==1) 
	        return search(root.left, key); 
	  
	    // val is less than root's key 
	    return search(root.right, key); 
	} 
	public class Node{
		Person key;
		public Node left,right;
		
		Node(Person item){
			key=item;
			right=left=null;;
		}
	}
	Node root;
	public AddressBook() {
		root=null;
	}
	// This method mainly calls insertRec() 
    void insert(Person key) { 
       root = insertRec(root, key); 
    }
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, Person key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        /* Otherwise, recur down the tree */
        if (key.getName().compareToIgnoreCase(root.key.getName())==-1) 
            root.left = insertRec(root.left, key); 
        else if (key.getName().compareToIgnoreCase(root.key.getName())==1) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    }
    // This method mainly calls InorderRec() 
    void inorder()  { 
       inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key.toString()); 
            inorderRec(root.right); 
        } 
    }
    // This method mainly calls deleteRec() 
    void deleteKey(String key) 
    { 
        root = deleteRec(root, key); 
    } 
  
    /* A recursive function to insert a new key in BST */
    Node deleteRec(Node root, String key) 
    { 
        /* Base Case: If the tree is empty */
        if (root == null)  return root; 
  
        /* Otherwise, recur down the tree */
        if (key.compareToIgnoreCase(root.key.getName())==1 ) 
            root.left = deleteRec(root.left, key); 
        else if (key.compareToIgnoreCase(root.key.getName())==-1 ) 
            root.right = deleteRec(root.right, key); 
  
        // if key is same as root's key, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.key = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = deleteRec(root.right, root.key.getName()); 
        } 
  
        return root; 
    } 
    Person minValue(Node root) 
    { 
        Person minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    }
    Node modify(Node root, Person oPerson) {
    	// Base Cases: root is null or key is present at root 
	    if (root==null ||  root.key.getName().compareToIgnoreCase(oPerson.getName())==0) 
	        return root; 
	  
	    // val is greater than root's key 
	    if (root.key.getName().compareToIgnoreCase (oPerson.getName()) ==1) 
	        return modify(root.left, oPerson); 
	  
	    // val is less than root's key 
	    return modify(root.right, oPerson);
    }
    void listByYear(Node root,int year) {
    	ArrayList<Person> oPeople=new ArrayList<Person>();
    	// A utility function to do inorder traversal of BST 
            if (root != null) { 
            	listByYear(root.left,year);
            	if(root.key.getBirthDate().getYear()==year) {
            		root.key.toString();	
            	} 
                listByYear(root.right,year); 
            } 
        
    }
}
