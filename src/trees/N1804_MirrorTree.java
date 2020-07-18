package trees;

public class N1804_MirrorTree {

	Node root = null;

	static void convertToMirror(Node node){

		if(node == null){
			return;
		}

		Node temp = node.left;
		node.left = node.right;
		node.right = temp;

		convertToMirror(node.left);
		convertToMirror(node.right);
	}

	static void printTree(Node node){

		if(node == null)
			return;

		printTree(node.left);
		System.out.print(node.data+" ");
		printTree(node.right);
	}

	public static void main(String[] args){

		N1804_MirrorTree tree = new N1804_MirrorTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		printTree(tree.root);
		System.out.println();
		
		convertToMirror(tree.root);
		printTree(tree.root);

	}


}
