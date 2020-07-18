package trees;

public class N2011_subTree {
	
	Node root1, root2;

	static class Node{
		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	static boolean isIdentical(Node n1, Node n2){

		if(n1 == null && n2 == null){
			return true;
		}

		if(n1 != null && n2 != null){

			return (n1.data == n2.data) && isIdentical(n1.left, n2.left) && isIdentical(n1.right, n2.right);

		}
		
		return false;
	}
	
	static boolean isSubtree(Node t, Node s){
		
		if(s == null){
			return true;
		}
		
		if( t == null){
			return false;
		}
		
		if( isIdentical(t, s)){
			return true;
		}
		
		return isSubtree(t.left, s) || isSubtree(t.right, s);
		
		
		
	}
	
	


	public static void main(String[] args){
			
		N2011_subTree tree = new N2011_subTree();
        
        // TREE 1
        /* Construct the following tree
              26
             /   \
            10     3
           /    \     \
          4      6      3
           \
            30  */
           
        tree.root1 = new Node(26);
        tree.root1.right = new Node(3);
        tree.root1.right.right = new Node(3);
        tree.root1.left = new Node(10);
        tree.root1.left.left = new Node(4);
        tree.root1.left.left.right = new Node(30);
        tree.root1.left.right = new Node(6);
  
        // TREE 2
        /* Construct the following tree
           10
         /    \
         4      6
          \
          30  */
           
        tree.root2 = new Node(10);
        tree.root2.right = new Node(6);
        tree.root2.left = new Node(4);
        tree.root2.left.right = new Node(30);
  
        if (isSubtree(tree.root1, tree.root2))
            System.out.println("Tree 2 is subtree of Tree 1 ");
        else
            System.out.println("Tree 2 is not a subtree of Tree 1");




	}

}
