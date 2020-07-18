package linkedlist;

public class MergeTwoListsReverse {

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



	static Node merge(Node p, Node q){

		Node sorted = null;

		while(p != null & q != null){

			if(p.data < q.data){

				Node temp = p.next;
				p.next = sorted;
				sorted = p;
				p = temp;

			}

			else{

				Node temp = q.next;
				q.next = sorted;
				sorted = q;
				q = temp;

			}

		}

		while(p != null ){

			Node temp = p.next;
			p.next = sorted;
			sorted = p;
			p = temp;

		}

		while(q != null){

			Node temp = q.next;
			q.next = sorted;
			sorted = q;
			q = temp;
		}
		
		return sorted;

	}
	
	
	public static void main(String[] args){
		
		MergeTwoListsReverse list1 = new MergeTwoListsReverse();
		MergeTwoListsReverse list2 = new MergeTwoListsReverse();
		
		list1.insert(5);
		list1.insert(10);
		list1.insert(15);
		list1.insert(40);
		
		list2.insert(2);
		list2.insert(3);
		list2.insert(30);
		
		printlist(list1.head);
		printlist(list2.head);
		
		Node result = merge(list1.head, list2.head);
		
		printlist(result);
		
		
		
		
		
	}




}
