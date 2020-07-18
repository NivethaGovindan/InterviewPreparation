package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import trees.N1801_LevelOrder.Node;

public class N1902_ReverseLevelOrder {
	
	Node root = null;
	
	class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			left = right = null;
		}
		
	}
	
	static void reverse(Node head){
		
		if(head == null){
			return;
		}
		
		Stack<Node> st = new Stack<Node>();
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(head);
		
		while(!queue.isEmpty()){
			
			Node temp = queue.remove();
			
			if(temp.right != null) queue.add(temp.right);
			if(temp.left != null) queue.add(temp.left);
			
			
			st.push(temp);
			
			
		}
		
		while( !st.isEmpty()){
			
			System.out.print(st.pop().data+" ");
		}
			
	}
	
	public static void main(String[] args){

		N1902_ReverseLevelOrder tree = new N1902_ReverseLevelOrder();

		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);
		tree.root.left.left = tree.new Node(4);
		tree.root.left.right = tree.new Node(5);

		reverse(tree.root);


	}


}
