package may;

public class DeleteTree {
	Node root;
	
	void deleteTree(Node node){
		if(node == null)
			return;
		deleteTree(node.left);
		deleteTree(node.right);
		System.out.println("node to delete "+node.data);
		node = null;
	}
	
	void deleteTreeRef(Node root)
    {
        deleteTree(root);
        root=null;
    }
	
	public static void main(String[] args){
		DeleteTree tree = new DeleteTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.deleteTreeRef(tree.root);
		
	}

}
