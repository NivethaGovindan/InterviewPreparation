package may;

public class CountLeaves {
	Node root;
	
	int countLeaves(Node node){
		
		if(node == null)
			return 0;
		
		if(node.left == null && node.right == null)
			return 1;
		
		return countLeaves(node.left)+countLeaves(node.right);
	}
	
	public static void main(String[] args){
		CountLeaves tree = new CountLeaves();
		
		tree.root = new Node(1);
		tree.root.right = new Node(2);
		tree.root.left = new Node(3);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(5);
		
		System.out.println("No. of Leaves: "+ tree.countLeaves(tree.root));
	}
	

}
