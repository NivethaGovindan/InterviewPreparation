package linkedlist;


/*
 * author: Nivetha G
 */

public class RearrageListZigZagFashion {


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

		Node curr = head;

		boolean flag = true;

		while(curr!= null && curr.next != null){

			if(flag && curr.data > curr.next.data || !flag && curr.data < curr.next.data ){

				int temp = curr.data;
				curr.data = curr.next.data;
				curr.next.data = temp;

			}

			flag = !flag;
			curr = curr.next;

		}
		
		printlist(head);



	}


	public static void main(String[] args){

		RearrageListZigZagFashion list = new RearrageListZigZagFashion();
		
		list.insert(4);
		list.insert(3);
		list.insert(7);
		list.insert(8);
		list.insert(6);
		list.insert(2);
		list.insert(1);
		
		printlist(list.head);
		
		rearrange(list.head);






	}





}
