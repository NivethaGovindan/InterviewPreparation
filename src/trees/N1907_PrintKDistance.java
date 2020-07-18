package trees;

public class N1907_PrintKDistance {

	Node root = null;

	static class Node{

		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			left = right = null;
		}

	}

	static void printNodesAtKDistatnce(Node node, int k){

		if(node == null){
			return;
		}

		if(k==0){
			System.out.print(node.data+" ");
			return;
		}

		else{

			printNodesAtKDistatnce(node.left, k-1);
			printNodesAtKDistatnce(node.right, k-1);

		}

	}
	
	public static void main(String[] args){
		
		N1907_PrintKDistance tree = new N1907_PrintKDistance();
		
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(8);
        
        printNodesAtKDistatnce(tree.root,2);
	}


}
