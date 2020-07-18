package trees;

import java.util.LinkedList;
import java.util.Queue;

public class N1801_LevelOrder {

	Node root = null;

	class Node{

		int data;
		Node left, right;

		Node(int data){

			this.data = data;
			right = left = null;

		}
	}

	void levelOrder(){

		Node temp = root;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(temp);

		while( !queue.isEmpty()){

			temp = queue.remove();
			System.out.println(temp.data);

			if(temp.left != null)
				queue.add(temp.left);
			if(temp.right != null)
				queue.add(temp.right);



		}



	}

	public static void main(String[] args){

		N1801_LevelOrder tree = new N1801_LevelOrder();

		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);
		tree.root.left.left = tree.new Node(4);
		tree.root.left.right = tree.new Node(5);

		tree.levelOrder();


	}

}
