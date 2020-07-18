package linkedlist;

public class Add1 {

	static Node addOne(Node head){

		head = reverse(head);

		int carry = 1, total = 0, num = 0;

		Node temp = head, prev= null;

		while( temp!= null ){

			total = carry + temp.data;
			carry = total /10;
			num = total % 10;

			temp.data = num;

			prev = temp;
			temp = temp.next;

		}

		if( carry != 0){
			prev.next =  new Node(carry);
		}

		head = reverse(head);

		return head;
	}


	static Node reverse(Node head){

		Node prev = null;
		Node curr = head;

		while(curr != null){

			Node temp = curr.next;
			curr.next = prev;

			prev = curr;
			curr = temp;
		}

		return prev;

	}

	static void printlist(Node head){

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

		LinkedList l1 = new LinkedList();

		l1.insert(9);
		l1.insert(9);
		l1.insert(9);
		l1.insert(9);

		l1.printList();

		l1.head = addOne(l1.head);



		l1.printList();



	}


}
