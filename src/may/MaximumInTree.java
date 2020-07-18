package may;

public class MaximumInTree {
	
	Node root;
	
	int findMax(Node node){
		if(node == null)
			return Integer.MIN_VALUE;
		
		return Math.max(Math.max(node.data, findMax(node.left)), findMax(node.right));
	}
	
	public static void main(String args[])
    {
		MaximumInTree tree = new MaximumInTree();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);
 
        System.out.println("Maximum element is " +
                         tree.findMax(tree.root));
    }

}
