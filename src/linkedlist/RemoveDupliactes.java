package linkedlist;

public class RemoveDupliactes {

	static Node head = null;

	static void remove(){

		Node curr = head;

		while(curr != null && curr.next != null){

			if(curr.data == curr.next.data){
				curr.next = curr.next.next;
			}

			else{
				curr = curr.next;
			}
		}
	}


	static void append(int data){

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


	static void printlist(){

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
		
		head = new Node(11);
		append(11);
		append(11);
		append(2);
		append(3);
		append(3);
		append(3);
		
		printlist();
		
		remove();
		
		printlist();
		


	}

}
