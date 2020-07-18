package trees;

public class N1911_BoundaryTraversal {

	Node root = null;

	static class Node{

		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			left = right = null;
		}

	}

	static void leftBoundary(Node node){


		if(node != null){

			
			if(node.left != null){
				System.out.print(node.data+" ");

				leftBoundary(node.left);
			}
			else if(node.right!= null){
				System.out.print(node.data+" ");

				leftBoundary(node.right);
			}
		}	

	}

	static void rightBoundary(Node node){


		if(node != null){

			

			if(node.right != null){
				System.out.print(node.data+" ");

				leftBoundary(node.right);
			}
			else if(node.left!= null){
				System.out.print(node.data+" ");

				leftBoundary(node.left);
			}
		}	

	}
	
	static void printLeaves(Node node) 
    {
        if (node != null) 
        {
            printLeaves(node.left);
  
            // Print it if it is a leaf node
            if (node.left == null && node.right == null)
                System.out.print(node.data + " ");
            printLeaves(node.right);
        }
    }

	public static void main(String[] args){


		N1911_BoundaryTraversal tree = new N1911_BoundaryTraversal();

		tree.root = new Node(12);
		tree.root.left = new Node(10);
		tree.root.right = new Node(30);
		tree.root.right.left = new Node(25);
		tree.root.right.right = new Node(40);
		
		leftBoundary(tree.root.left );
		
		printLeaves(tree.root.left );
		printLeaves(tree.root.right );
		
		rightBoundary(tree.root.right );
		


	}



}
