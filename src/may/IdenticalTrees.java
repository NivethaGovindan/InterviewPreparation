package may;


class Node{
	int data;
	Node left, right;
	
	Node(int data){
		this.data = data;
	}
}

public class IdenticalTrees {
     Node tree1, tree2;
     
     boolean isIdentical(Node n1, Node n2){
    	 if(n1 == null && n2 == null){
    		 return true;
    	 }
    	 if(n1!= null && n2!=null){
    		 return ( (n1.data == n2.data) && isIdentical(n1.left, n2.left) && isIdentical(n1.right, n2.right));
    	 }
    	 return false;
     }
     
     public static void main(String[] args){
    	 IdenticalTrees trees = new IdenticalTrees();
    	 
    	 trees.tree1 = new Node(2);
    	 trees.tree1.left = new Node(3);
    	 
    	 trees.tree2 = new Node(2);
    	 trees.tree2.left = new Node(3);
    	 
    	 System.out.println(trees.isIdentical(trees.tree1, trees.tree2));
    	 
     }
	
}
