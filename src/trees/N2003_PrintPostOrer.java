package trees;

public class N2003_PrintPostOrer {

	class Node{

		int data;
		Node left , right;

		Node(int data){
			this.data = data;
			left = right = null;
		}

	}

	static int findIndex(int element, int[] a, int start, int end){

		int i= -1;

		for(i =start; i<= end; i++){
			if(element == a[i]){
				return i;
			}
		}

		return i;
	}

	static int preIndex = 0;

	static void printPostOrder(int[] in, int[] pre, int start, int end){

		if(start > end){
			return;
		}

		int element = pre[preIndex++];

		if(start != end){

			int index = findIndex(element, in, start, end);
			printPostOrder(in, pre, start, index-1);
			printPostOrder(in, pre, index+1, end);

		}

		System.out.print(element+" ");
		return;

	}
	
	public static void main(String[] args) {
		   int in[] = {4, 2, 5, 1, 3, 6};
		   int pre[] =  {1, 2, 4, 5, 3, 6};
		   printPostOrder(in,pre,0,in.length-1);
	}





}
