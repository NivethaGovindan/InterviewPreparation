package may;

public class Ancestors {
	
	Node root;
	
	boolean isAncestor(Node node, int data){
		if(node == null)
			return false;
		if(node.data == data)
			return true;
		if(isAncestor(node.left, data) || isAncestor(node.right, data)){
			System.out.print(node.data+" ");
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args){
		Ancestors tree = new Ancestors();

		tree.root = new Node(1);
		/* Construct the following binary tree
        1
      /   \
     2     3
    /  \
   4    5
  /
 7
		 */
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(7);

		tree.isAncestor(tree.root, 7);
	}

}
