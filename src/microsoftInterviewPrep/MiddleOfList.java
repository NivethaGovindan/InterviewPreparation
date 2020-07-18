package microsoftInterviewPrep;

public class MiddleOfList {
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	
	static void  printMiddle(Node head){
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("Middle element is: "+ slow.data);
		
		
	}
	
	void push(int data){
		
		Node node = new Node(data);
		node.next = head;
		head = node;
		
		
	}
	
	
	public static void main(String[] args){
		
		MiddleOfList llist = new MiddleOfList();
		
	        for (int i=5; i>0; --i)
	        {
	            llist.push(i);
	            printMiddle(llist.head);
	        }
		
		
	}

}
