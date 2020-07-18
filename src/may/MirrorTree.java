package may;

/*class Node{
int data;
Node left, right;
Node(int data){
	this.data = data;
}
}*/

public class MirrorTree {
	
	Node root;
	
	void converToMirror(Node node){
		
		if(node == null){
			return;
		}
		
		Node temp = node.right;
		node.right = node.left;
		node.left = temp;
		converToMirror(node.left);
		converToMirror(node.right);
	}
	
	void printTree(Node node){
		
		if(node == null)
			return;
		
		printTree(node.left);
		System.out.print(node.data+" ");
		printTree(node.right);
	}
	
	public static void main(String[] args){
		MirrorTree tree = new MirrorTree();
		
		
		tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(2);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(4);
		
		tree.printTree(tree.root);
		
		tree.converToMirror(tree.root);
		
		System.out.println();
		
		tree.printTree(tree.root);
		
		
	}

}
