package trees;

import java.util.ArrayList;
import java.util.Stack;

public class N1808_RootTOLeafPaths {

	Node root = null;
	Stack<Integer> st = new Stack<Integer>();

	class Node{

		int data;
		Node right, left;

		Node(int data){
			this.data = data;
			right = null;
			left = null;

		}

	}

	void inorder(Node node){

		if(node == null){
			return;
		}
		st.push(node.data);

		inorder(node.left);

		if( node.left == null && node.right == null){
			System.out.println(st);
			st.pop();

		}

		inorder(node.right);

	}

	void printAllRootToLeafPaths(Node node,ArrayList path) {
		
		if(node==null){
			return;
		}
		
		path.add(node.data);

		if(node.left==null && node.right==null){
			System.out.println(path);
			return;
		}
		
		else{
			printAllRootToLeafPaths(node.left, new ArrayList(path));
			printAllRootToLeafPaths(node.right, new ArrayList(path));
		}      
	}

	public static void main(String[] args){

		N1808_RootTOLeafPaths tree = new N1808_RootTOLeafPaths();

		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);
		tree.root.left.right = tree.new Node(4);
		tree.root.left.left = tree.new Node(5);

		//tree.inorder(tree.root);
		tree.printAllRootToLeafPaths(tree.root,new ArrayList());
		
		
	}


}
