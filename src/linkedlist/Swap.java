package linkedlist;

public class Swap {
	
	Node head;
	
	void swapList(){
		
		Node temp = head;
		
		while(temp != null && temp.next != null ){
			
			int d = temp.data;
			temp.data = temp.next.data;
			temp.next.data = d;
			
			temp = temp.next.next;
		}
		
		return;
	}
	
	void printlist() {
		
		Node temp = head;
		
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }
	
	public static void main(String[] args){
		
		Swap list = new Swap();
		
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		
		list.printlist();
		
		list.swapList();
		
		list.printlist();
		
		
	}

}
