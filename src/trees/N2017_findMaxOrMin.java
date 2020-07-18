package trees;

public class N2017_findMaxOrMin {
	
	Node root;
	
	static class Node{
		
		int data;
		Node left, right;
		
		Node(int data){
			
			this.data = data;
			
			right = null;
			left = null;
			
		}
	}
	
	static int findMax(Node node){
		
		if(node == null){
			return Integer.MIN_VALUE;
		}
		
		int max = node.data;
		int left = findMax(node.left);
		int right = findMax(node.right);
		
		if(left > max){
			max = left;
		}
		
		if(right > max){
			max = right;
		}
		
		return max;
		
	}
	
	public static void main(String[] args){
		
		
		N2017_findMaxOrMin tree = new N2017_findMaxOrMin();
	        tree.root = new Node(2);
	        tree.root.left = new Node(7);
	        tree.root.right = new Node(5);
	        tree.root.left.right = new Node(6);
	        tree.root.left.right.left = new Node(1);
	        tree.root.left.right.right = new Node(11);
	        tree.root.right.right = new Node(9);
	        tree.root.right.right.left = new Node(4);
	 
	        System.out.println("Maximum element is " +
	                       findMax(tree.root));
	}
	
	

}
