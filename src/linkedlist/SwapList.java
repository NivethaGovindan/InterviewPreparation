package linkedlist;

public class SwapList {
	
	Node head;
	
	void swapNodes(Node n1, Node n2){
		
		Node prevn1 = null;
		Node prevn2 = null;
		
	    Node temp = head;
	    
	    while( temp!=null && temp.data != n1.data){
	    	prevn1 = temp;
	    	temp = temp.next;
	    }
	    
	    temp = head;
	    
	    while(temp!= null && temp.data != n2.data){
	    	prevn2 = temp;
	    	temp = temp.next;
	    }
	    
	    if(prevn1 == null)
	    	head = n2;
	    else
	    	prevn1.next = n2;
	    
	    if(prevn2 == null)
	    	head  = n1;
	    else
	    	prevn2.next = n1;
	    
	    temp = n1.next;
	    n1.next = n2.next;
	    n2.next = temp;
	    
		return;
		
	}
	
   void printList(){
		
		Node temp = head;
		
		while(temp.next!= null){
			
			System.out.print(temp.data+" ->");
			temp = temp.next;
		}
		
		System.out.print(temp.data);
		System.out.println();
		
		return;
	}
	
	
	public static void main(String args[]){
		
		SwapList list = new SwapList();
		
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		
		list.printList();
		
		list.swapNodes(list.head, list.head.next);
		list.printList();
		
		
		
	}

}
