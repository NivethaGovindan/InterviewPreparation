package trees;

import java.util.LinkedList;
import java.util.Queue;

public class N1903_LeftView {

	Node root = null;
	static int maxlevel = 0;

	static class Node{

		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			left = right = null;
		}

	}

	static void printLeftView(Node node, int level){

		if(node == null)
			return;

		if(level > maxlevel){

			System.out.print(node.data+" ");
			maxlevel = level;


		}

		printLeftView(node.left, level+1);
		printLeftView(node.right, level+1);


	}

	static void printLeftViewUsingLevelOrder(Node node){
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		while(!queue.isEmpty()){
			
			int size = queue.size();
			int i = 1;
			
			while( i < size){
				
				Node temp = queue.remove();
				
				if(i == 1){
					System.out.print(temp.data+" ");
				}
				
				queue.add(temp.left);
				queue.add(temp.right);
				
				i++;
				
			}	
			
		}

	}



	public static void main(String[] args){


		N1903_LeftView tree = new N1903_LeftView();

		tree.root = new Node(12);
		tree.root.left = new Node(10);
		tree.root.right = new Node(30);
		tree.root.right.left = new Node(25);
		tree.root.right.right = new Node(40);

		printLeftView(tree.root, 1);
		
		System.out.println();
		
		printLeftViewUsingLevelOrder(tree.root);


	}


}
