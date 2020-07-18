package trees;

public class N1807_Diameter {

	Node root = null;
	

	class Node{

		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			right = left = null;
		}

	}


	int diameter(Node node){

		if(node == null){
			return 0;
		}

		int rootpath = 1 + diameter(node.left)+ diameter(node.right);
		int maxsubtree = Math.max(diameter(node.left), diameter(node.right));

		return Math.max(rootpath, maxsubtree );


	}

	public static void main(String args[])
	{

		N1807_Diameter tree = new N1807_Diameter();
		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);
		tree.root.left.left =tree.new Node(4);
		tree.root.left.right = tree.new Node(5);

		System.out.println("The diameter of given binary tree is : "+ tree.diameter(tree.root));
	}



}
