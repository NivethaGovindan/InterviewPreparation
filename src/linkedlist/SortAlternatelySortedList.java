package linkedlist;

public class SortAlternatelySortedList {

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
    
	//main sort function that uses other utility functions
	static Node sort(Node head){

		Node p = head;
		Node q = head.next;

		splitlist( p,q);

		printlist(p);

		q = reverse(q);
		printlist(q);
		
		return merge(p, q);
		
	}

	static Node merge(Node p, Node q){

		Node sorted = null, head = null;

		if(p == null){
			return q;
		}

		if(q == null){
			return p;
		}

		if(p.data < q.data){
			head = sorted = p;
			p = p.next;
		}
		else{
			head = sorted = q;
			q = q.next;
		}

		while( p != null && q!= null){

			if(p.data < q.data){
				sorted.next = p;
				sorted = sorted.next;
				p = p.next;
			}
			else{
				sorted.next = q;
				sorted = sorted.next;
				q = q.next;
			}


		}

		if(p == null && q!= null ) { sorted.next = q ; }

		if(q == null  && p!= null) { sorted.next = p; }

		return head;


	}


	static void splitlist(Node ahead, Node dhead){


		Node lasta = ahead;
		Node lastb = dhead;
		Node curr = dhead.next;

		while(curr != null){

			lasta.next = curr;
			lasta = curr;
			curr = curr.next;

			if(curr != null){

				lastb.next = curr;
				lastb = curr;
				curr = curr.next;
			}

		}

		if(lasta.next == null) lastb.next = null;
		else lasta.next = null;

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

	public static void main(String[] args){

		SortAlternatelySortedList list1 = new SortAlternatelySortedList();

		list1.insert(10);
		list1.insert(40);
		list1.insert(13);
		list1.insert(30);
		list1.insert(67);
		list1.insert(12);
		list1.insert(89);


		printlist(list1.head);

		Node result = sort(list1.head);
		
		printlist(result);


	}




}
