package linkedlist;

public class MergeTwoListsAlternatePositions {

	static Node merge(Node l1, Node l2){

		Node head = l1;

		while(l1 != null && l2 != null){

			Node temp = l1.next;
			Node temp2 = l2.next;
			l1.next = l2;
			l2.next = temp;

			l1 = temp;
			l2 = temp2;


		}
		
		System.out.println("list2");
		printList(l2);

		return head;	

	}

	static void printList(Node head){

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

		//12->10->2->4->6, the first list should become 5->12->7->10->17->2->13->4->11->6

		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();


		l1.insert(5);
		l1.insert(7);
		l1.insert(17);
		l1.insert(13);
		//l1.insert(11);

		l2.insert(12);
		l2.insert(10);
		l2.insert(2);
		l2.insert(4);
		l2.insert(6);

		l1.printList();
		l2.printList();
		
		

		l1.head = merge(l1.head, l2.head);
		
		System.out.println("merged List:");
		l1.printList();
		


	}

}
