package linkedlist;


public class RearrangeEvenOddPosition {

	Node head = null;

	class Node{
		int data;
		Node next;
		Node(int data){ 
			this.data = data;
			next = null;
		}
	}

	void insert(int data){

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

	static void printlist(Node head) {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("");
	}



	static void rearrange(Node head){

		Node oddhead = head;
		Node evenhead = head.next;

		Node lastodd = head;
		Node lasteven = head.next;

		Node curr = head.next.next;

		while(curr != null){

			lastodd.next = curr;
			lastodd = curr;
			curr = curr.next;


			if(curr != null){

				lasteven.next = curr;
				lasteven = curr;
				curr = curr.next;

			}

		}
		
		lasteven.next = null;
		lastodd.next = evenhead;


		printlist(oddhead);


	}


	public static void main(String[] args){

		RearrangeEvenOddPosition list = new RearrangeEvenOddPosition();

		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		//list.insert(8);

		printlist(list.head);

		rearrange(list.head);


	}

}
