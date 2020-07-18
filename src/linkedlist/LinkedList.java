package linkedlist;

public class LinkedList {

	Node head = null;
	
	public void insert(int data){

		Node new_node = new Node(data);

		if(head == null){
			head = new_node;
			return;
		}

		Node last = head;

		while(last.next != null){
			last = last.next;
		}

		last.next = new_node;

	}
	
	public void printList(){
		
		Node temp = head;
	
		
		while(temp.next!= null){
			
			System.out.print(temp.data+" ->");
			temp = temp.next;
		}
		
		System.out.print(temp.data);
		
		System.out.println();
		
		return;
	}

}
