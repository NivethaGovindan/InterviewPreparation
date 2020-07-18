package trees;

import java.util.*;

public class N1806_LevelOrderSpiral {

	static Node node = null;

	static class Node{
		int data;
		Node  right ,left;
		Node(int data){

			this.data = data;
			right = null;
			left = null;

		}
	}

	static void spiralTraversal(){

		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();

		s1.push(node);

		while( !s1.isEmpty() || !s2.isEmpty()){

			while(!s1.isEmpty()){
				
				Node temp = s1.pop();
		
				if(temp.right!=null)
					s2.push(temp.right);
				if(temp.left != null)
					s2.push(temp.left);

				System.out.println(temp.data);
			}

			while(!s2.isEmpty()){
				
				Node temp = s2.pop();

				if(temp.left != null)
					s1.push(temp.left);
				if(temp.right!=null)
					s1.push(temp.right);
				
				System.out.println(temp.data);
				

			}

		}

	}

	public static void main(String[] args){

		node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(7);
		node.left.right = new Node(6);
		node.right.left = new Node(5);
		node.right.right = new Node(4);
		spiralTraversal();


	}

}
