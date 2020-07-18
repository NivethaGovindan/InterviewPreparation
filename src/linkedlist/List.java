package linkedlist;

public class List {
	
	
	Node head = null;
	
	public  void insert(int data){

		Node new_node = new Node(data);
		
		new_node.next = head;
		head = new_node;
		
		return;
		
	}
	
	public void insertAtEnd(int data){
		
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
	
	public void insetAfter(Node prev_node, int data){
		Node new_node = new Node(data);
		
		new_node.next = prev_node.next;
		
		prev_node.next = new_node;
		
		return;
		
	}
	
	public void delete(int data){
		
		Node temp = head;
		Node prev = null;
		
		// if head holds data since head don't have previous node
		if(temp != null && temp.data == data){
			temp = temp.next;
			return;
		}
		
		while(temp!= null && temp.data != data){
			
			prev = temp;
			temp = temp.next;
			
		}
		
		//if data is not present in the list
		if(temp == null) 
			return;
		
		prev.next = temp.next;
		
		return;
		
	}
	
	public void delAtpos(int pos){
		
		Node temp = head;
		Node prev = null;
		
		if(head!= null && pos == 0){
			head = head.next;
		}
		
		for(int i=1; i<=pos && temp!=null; i++){
			prev = temp;
			temp = temp.next;
		}
		
		if(temp != null){
			
			prev.next = temp.next;
		}
		
		return;
		
	}
	
	public boolean search(int data){
		
		Node temp = head;
		
		while(temp!= null && temp.data != data){
			temp = temp.next;
		}
		
		if(temp != null){
			return true;
		}
		
		return false;
	}
	
	public boolean searchrecursively(Node node, int data){
		if(node == null){
			return false;
		}
		
		if(node.data == data){
			return true;
		}
		
	 return	searchrecursively(node.next, data);
		
	
	}
	
	
	public void printList(){
		
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
		
		List list = new List();
		
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.printList();
		
		list.insert(5);
		list.insert(4);
		list.insertAtEnd(7);
		list.printList();
		
		list.delete(7);
		list.printList();
		
		list.delAtpos(3);
		list.printList();
		
		boolean res = list.searchrecursively(list.head, 9);
		System.out.println(res);
		
		res = list.search(3);
		System.out.println(res);
		
		
		
	}
	

}
