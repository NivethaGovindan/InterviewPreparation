package linkedlist;

public class Nth_node {
	
	static Node head = null;
	
	public static void getn(int n){
		
		Node temp = head;
		
		for(int i=1; i<n && temp != null; i++){
			
			temp = temp.next;
			
		}
		
		if(temp == null){
			System.out.println("Not presnt");
		}
		else
			System.out.println(temp.data);
		
		return;
	}
	
	public static void main(String args[]){
		
		
		head = new Node(1);
		
		head.next = new Node(2);
		
		getn(3);
	}

}
