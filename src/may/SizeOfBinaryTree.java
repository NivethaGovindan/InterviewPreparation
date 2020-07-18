package may;

/*class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data = data;
	}
}*/

public class SizeOfBinaryTree {
      static int calculateSize(Node node){
    	  if(node == null){
    		  return 0;
    	  }
    	  
    	  return (1+calculateSize(node.left)+calculateSize(node.right));
      }
      
      public static void main(String[] args){
    	  Node node = new Node(5);
    	  node.left = new Node(6);
    	  node.right = new Node(7);
    	  node.right.right = new Node(8);
    	  
    	  System.out.println(calculateSize(node));
      }
}
