package trees;

public class N2002_ConstructTreeInorderPreOrder {
	
	
	static int preIndex = 0;
	
	static class Node{
		char data;
		Node left, right;
		
		Node(char data){
			
			this.data = data;
			left = null;
			right = null;
			
		}
	}
	
	static Node buildTree(char[] pre, char[] in, int start, int end){
		
		if(start > end){
			return null;
		}
		
		Node node = new Node(pre[preIndex++]);
		
		if(start == end){
			return node;
		}
		
		int index = findIndex(node.data, in , start, end);
		
		node.left = buildTree(pre, in, start, index-1);
		node.right = buildTree(pre, in, index+1, end);
		
		return node;
		
		
		
		
	}
	
	static int findIndex(char element, char[] a, int start, int end){
		int i=-1;
		for(i=start; i<= end; i++){
			if( a[i] == element){
				return i;
			}
		}
		
		return i;
	}
	
	static void printInorder(Node node){
		
		if(node == null){
			return;
		}
		printInorder(node.left);
		System.out.print(node.data+" ");
		printInorder(node.right);
		
	}
	
	public static void main(String[] args){
		
		char[] preOrder = {'A', 'B', 'D', 'E', 'F', 'C', 'G', 'H', 'J', 'L', 'K'};
		char[] inOrder =  {'D', 'B', 'F', 'E', 'A', 'G', 'C', 'L', 'J', 'H', 'K'};
		
		int end = preOrder.length -1;
		
		
		Node root = buildTree(preOrder, inOrder, 0, end);
		
		printInorder(root);
		
		
	}
	
	

}
