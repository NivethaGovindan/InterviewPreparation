package trees;

public class N1809_countLeaves {

	Node root = null;
	
	class Node{

		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			right = left = null;
		}

	}

	static int getCount(Node node){

		if(node == null){
			return 0;
		}

		if(node.left == null && node.right == null){
			return 1;
		}

		return getCount(node.left)+ getCount(node.right);

	}

	public static void main(String[] args){

		N1809_countLeaves tree = new N1809_countLeaves();

		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);
		tree.root.left.right = tree.new Node(4);
		tree.root.left.left = tree.new Node(5);
		
		int res = getCount(tree.root);
		
		System.out.println(res);

	}

}
