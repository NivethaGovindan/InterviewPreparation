package trees;

public class N1803_sizeofTree {
	
	Node root = null;
	
	static int size(Node node){
		
		if(node == null){
			return 0;
		}
		
		return 1 + size(node.left)+ size(node.right);
		
	}
	
	public static void main(String[] args){
		
		N1803_sizeofTree tree = new N1803_sizeofTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println(size(tree.root));
		
		
		
	}

}
