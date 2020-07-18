package linkedlist;

public class PonitGreatestValue {

	Node head = null;

	class Node{

		int data;
		Node arbit;
		Node next;

		Node(int data){
			this.data = data;
			arbit = null;
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
			System.out.print(temp.data + "-");

			if(temp.arbit != null){
				System.out.print(temp.arbit.data+" ");
			}

			else{
				System.out.print("null ");
			}

			temp = temp.next;
		}
		System.out.println("");
	}

	static Node reverse(Node head){

		Node prev = null;
		Node curr = head;

		while(curr.next != null){

			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;

		}

		curr.next = prev;

		return curr;
	}


	static void pointArbitToGreatest(Node head){

		head = reverse(head);
		Node curr = head.next;
		Node max = head;

		while(curr!= null){

			curr.arbit = max;

			if(curr.data >= max.data){
				max = curr;
			}


			curr = curr.next;

		}

		head = reverse(head);
		printlist(head);

	}

	public static void main(String[] args){

		PonitGreatestValue list = new PonitGreatestValue();

		list.insert(5);
		list.insert(10);
		list.insert(2);
		list.insert(3);
		
//		list.insert(4);
//		list.insert(5);
//		list.insert(16);
//		list.insert(10);
//		list.insert(7);
//		list.insert(5);
//		list.insert(3);

		pointArbitToGreatest(list.head);


	}

}
