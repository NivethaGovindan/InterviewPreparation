package linkedlist;

public class Addlists {
	
	Node head1, head2;
	
	Node addTwoList(Node h1, Node h2){
		
		Node res = null;
		Node curr = null;
		int total=0, carry = 0, num = 0;
		
		while(h1 != null && h2 != null){
			
			total = h1.data + h2.data + carry;
			
			num = total % 10;
			carry = total / 10;
			
			if(res == null){
				res = new Node(num);
				curr = res;
			}
			
			else{

				curr.next = new Node(num);
				curr = curr.next;
			}
			
			h1 = h1.next;
			h2 = h2.next;
			
		}
		
		while(h1 != null){
			
			total = h1.data + carry;
			num = total % 10;
			carry = total / 10;
			
			curr.next = new Node(num);
			curr = curr.next;
			
			h1 = h1.next;
		}
		
		while(h2 != null){
			
			total = h2.data + carry;
			num = total % 10;
			carry = total / 10;
			
			curr.next = new Node(num);
			curr = curr.next;
			
			h2 = h2.next;
		}
		
		
		return res;
	}
	
	
	 void printList(Node head) {
	        while (head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        System.out.println("");
	    }
	 
	    public static void main(String[] args) {
	    	Addlists list = new Addlists();
	 
	        // creating first list
	        list.head1 = new Node(7);
	        list.head1.next = new Node(5);
	        list.head1.next.next = new Node(9);
	        list.head1.next.next.next = new Node(4);
	        list.head1.next.next.next.next = new Node(6);
	        System.out.print("First List is ");
	        list.printList(list.head1);
	 
	        // creating seconnd list
	        list.head2 = new Node(8);
	        list.head2.next = new Node(4);
	        System.out.print("Second List is ");
	        list.printList(list.head2);
	 
	        // add the two lists and see the result
	        Node rs = list.addTwoList(list.head1,list. head2);
	        System.out.print("Resultant List is ");
	        list.printList(rs);
	    }

}
