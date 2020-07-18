package trees;


public class N1906_SumRootToLeafPath {

	Node root = null;

	static class Node{

		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			left = right = null;
		}

	}

	static boolean  hasRootToLeafPath(Node node, int sum){

		//if tree is called with null root
		if(node == null){
			return (sum == 0);
		}

		if(node.left == null && node.right == null){
			return (sum == node.data);
		}

		int currsum = sum - node.data;

		return hasRootToLeafPath(node.left, currsum) || hasRootToLeafPath(node.right, currsum);


	}

	public static void main(String[] args){


		int sum = 14;

		/* Constructed binary tree is
	              10
	             /  \
	           8     2
	          / \   /
	         3   5 2
		 */
		N1906_SumRootToLeafPath tree = new N1906_SumRootToLeafPath();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(2);

		System.out.println( hasRootToLeafPath(tree.root, sum));

	}


}
