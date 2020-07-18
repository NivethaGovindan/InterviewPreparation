package linkedlist;


public class RerverseKnodes {

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

	//main function that reverses the list
	static Node reverse(Node head, int k){

		Node prev = null, curr = head, next = null;

		for(int i=0; i<k && curr !=null; i++){

			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}

		if (next != null) 
			head.next = reverse(next, k);



		return prev;

	}

	public static void main(String[] args){

		RerverseKnodes list1 = new RerverseKnodes();

		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		list1.insert(4);
		list1.insert(5);
		list1.insert(6);
		list1.insert(7);
		list1.insert(8);
		list1.insert(9);
		
		System.out.println("Given list");
		printlist(list1.head);


		Node result = reverse(list1.head, 3);
		
		System.out.println("reversed k nodes list");
		
		printlist(result);




	}

}
