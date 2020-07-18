package linkedlist;

public class Swaplinks {

	Node head = null;

	void swap(){
		
		Node prev = head;
		Node curr = head.next;
		head = curr;
		

		while(true){
			
			Node temp = curr.next;
			curr.next = prev;
			
			//for last node or null node
			if(temp == null || temp.next == null){
				prev.next = temp;
				break;
			}
			
			//prev.next is pointing to temp.next as it has to be like that for next swap
			prev.next = temp.next;
			
			prev = temp;
			curr = prev.next;

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

		Swaplinks list = new Swaplinks();

		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);

		list.printlist();

		list.swap();

		list.printlist();


	}

}
