package trees;


public class N1909_isBalanced {
	
	Node root = null;

	static class Node{

		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			left = right = null;
		}

	}

	static int isBalancedTree(Node node){
		
		if(node == null){
			return 0;
		}
		
		int lheight = isBalancedTree(node.left);
		
		if(lheight == -1){
			return -1;
		}
		
		int rheight = isBalancedTree(node.right);
		
		if(rheight == -1){
			return -1;
		}
		
		int diff = Math.abs(lheight - rheight);
		
		if(diff > 1){
			return -1;
		}
		
		return 1+ Math.max(lheight, rheight);

	}
	
	
	public static void main(String[] args){
		
		N1909_isBalanced tree = new N1909_isBalanced();
		
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        
        //remove this line to make tree balanced :P
        tree.root.right.right.right = new Node(7);
        
        int res = isBalancedTree(tree.root);
        
        if(res != -1){
        	
        	System.out.println("Balanced");
        }
        
        else{
        	
        	System.out.println("not balanced");
        }
        
	}


}
