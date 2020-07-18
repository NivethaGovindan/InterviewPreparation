package trees;

class Node{

	int data;
	Node left, right;

	Node(int data){
		this.data = data;
		right = left = null;
	}

}

public class N1802_IdenticalTrees {

	Node tree1 = null, tree2 = null;


	boolean isIdentical(Node root1, Node root2){

		if(root1 == null && root2 == null){

			return true;
		}

		if(root1!= null && root2!= null){

			return (root1.data == root2.data)&& isIdentical(root1.left, root2.left) && isIdentical(root1.right,root2.right);
		}

		return false;

	}

	public static void main(String[] args){

		N1802_IdenticalTrees trees = new N1802_IdenticalTrees();

		trees.tree1 = new Node(2);
		trees.tree1.left = new Node(3);

		trees.tree2 = new Node(2);
		trees.tree2.left = new Node(3);
		trees.tree2.right = new Node(4);

		System.out.println(trees.isIdentical(trees.tree1, trees.tree2));


	}


}
