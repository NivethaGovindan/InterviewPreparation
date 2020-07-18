package trees;

import java.util.*;

public class N1901_IterativeInorder {
	
	Node root = null;

	static class Node{

		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			left = right = null;
		}

	}

	static void inOrder(Node node){
		
		Stack<Node> st = new Stack<Node>();
		st.push(node);
		node = node.left;
		
		while(!st.isEmpty() || node != null){
			
			if(node != null){
				st.push(node);
				node = node.left;
			}
			
			else{
				
				Node temp = st.pop();
				System.out.print(temp.data+" ");
				node = temp.right;

			}
		}

	}
	
	
	public static void main(String[] args){
		
		N1901_IterativeInorder tree = new N1901_IterativeInorder();
		
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
		inOrder(tree.root);
	}



}
