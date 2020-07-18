package linkedlist;

public class ReverseNodes {
	
	static Node head = null;
	
	static void reverse(){
		
		Node prev = null;
		Node curr = head;
		
		while(curr.next != null){
			
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
			
		}
		
		head = curr;
		curr.next = prev;
		
		return;
	}
	
	static void printList(){
		
		Node temp = head;
		
		while(temp.next!= null){
			
			System.out.print(temp.data+" ->");
			temp = temp.next;
		}
		
		System.out.print(temp.data);
		System.out.println();
		
		return;
	}
	
	
	public static void main(String[] args){
		
		 head = new Node(1);
		 head.next = new Node(2);
		 head.next.next = new Node(3);
		 
		 printList();
		 
		 reverse();
		 printList();
		 
	}

}
