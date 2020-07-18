package linkedlist;

public class MergeTwoSortedLists {
	
	//Node head = null;
	
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
	
	static Node recursiveMerge(Node p, Node q){
		
		Node result = null;
		
		if(p == null){
			return q;
		}
		
		if(q == null){
			return p;
		}
		
		if( p.data < q.data){
			
			result = p;
			result.next = recursiveMerge(p.next, q);
		}
		
		else{
			result = q;
			result.next = recursiveMerge(p, q.next);
		}
		
		return result;
	}
	
	static void printlist(Node head) {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	public static void main(String[] args){
		
		Node n1 = new Node(5);
		n1.next = new Node(10);
		n1.next.next = new Node(15);
		
		Node n2 = new Node(2);
		n2.next = new Node(3);
		n2.next.next = new Node(20);
		
		
		printlist(n1);
		printlist(n2);
		
		System.out.println("List after Merge");
		
		Node result = merge(n1, n2);
		
		printlist(result);
		
		Node p = new Node(5);
		p.next = new Node(10);
		p.next.next = new Node(15);
		
		Node q = new Node(2);
		q.next = new Node(3);
		q.next.next = new Node(20);
		
		result = recursiveMerge(p, q);
		
		printlist(result);
		
		
		
	}

}
