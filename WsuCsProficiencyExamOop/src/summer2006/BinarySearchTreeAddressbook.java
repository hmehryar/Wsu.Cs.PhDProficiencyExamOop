/**
 * 
 */
package summer2006;



/**
 * @author Arsalan
 *
 */

//Java program to demonstrate insert operation in binary search tree
public class BinarySearchTreeAddressbook  {

/* Class containing left and right child of current node and key value*/
class Node { 
   Person key; 
   Node left, right; 

   public Node(Person item) { 
       key = item; 
       left = right = null; 
   } 
} 

// Root of BST 
Node root; 

// Constructor 
BinarySearchTreeAddressbook() {  
   root = null;  
} 

void listAll()  { 
	System.out.println("List of people");
	inorder(); 
} 



//This method mainly calls InorderRec() 
void listByYear(int year)  { 
	System.out.println("List of people whose birthday is "+year);
	listByYearRec(root, year); 
} 

//A utility function to do inorder traversal of BST 
void listByYearRec(Node root,int year) { 
	if (root != null) { 
		listByYearRec(root.left,year);
		if(root.key.getBirthDate().getYear()==year) {
		  	System.out.println(root.key.toString());
		  }
		listByYearRec(root.right,year); 
	} 
}

//This method mainly calls InorderRec() 
void modify(Person newPerson)  { 
modifyRec(root, newPerson); 
} 

//A utility function to do inorder traversal of BST 
void modifyRec(Node root,Person newPerson) { 
if (root != null) { 
    inorderRec(root.left);
    if(newPerson.getName().compareTo(root.key.getName())==0) {
    	//root.key.setAddress(newPerson.getAddress());
    	//root.key.setDescription(newPerson.getDescription());
    	//root.key.setTellNo(newPerson.getTellNo());
    	//root.key.setBirthDate(newPerson.getBirthDate());
    	root.key=newPerson;
    	System.out.println("Modification Done");
    	System.out.println(root.key.toString());
    	
    	//System.out.println(root.key);	
    }
     
    inorderRec(root.right); 
} 
} 



//This method mainly calls deleteRec() 
void deleteKey(Person key) 
{ 
  root = deleteRec(root, key); 
} 

/* A recursive function to insert a new key in BST */
Node deleteRec(Node root, Person key) 
{ 
  /* Base Case: If the tree is empty */
  if (root == null)  return root; 

  /* Otherwise, recur down the tree */
  //key < root.key
  if (key.getName().compareToIgnoreCase(root.key.getName())<0) 
      root.left = deleteRec(root.left, key); 
  //key > root.key
  else if (key.getName().compareToIgnoreCase(root.key.getName())>0) 
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
      root.right = deleteRec(root.right, root.key); 
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
   //key < root.key
   if (key.getName().compareToIgnoreCase(root.key.getName())<0 ) 
       root.left = insertRec(root.left, key); 
   //key > root.key
   else if (key.getName().compareToIgnoreCase(root.key.getName())>0) 
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
       System.out.println(root.key); 
       inorderRec(root.right); 
   	} 
	} 

 
} 

