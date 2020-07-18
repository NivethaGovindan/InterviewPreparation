package linkedlist;

public class Loop {
	
	static Node head = null;
	
	public static void detectLoop(){
		
		Node slowp = head;
		Node fastp = head;
		
		while(slowp!= null){
			
			slowp = slowp.next;
			fastp = fastp.next.next;
			
		
			
			if(slowp == fastp){
				
				//System.out.println("loop at"+ slowp.data);
				break;
			}
			
		}
		removeloop(slowp);
		
		//System.out.println("loop at"+ slowp.data);
		return;
	}
	
	static void removeloop(Node p){
		
		Node q = head;
		Node prev = null;
		
		while( p != q){
			
			System.out.println(p.data+" "+q.data);
			
			prev = p;
			p = p.next;
			q = q.next;
		}
		
		
		
		prev.next = null;
		
		printlist(head);
		
		
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
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		
		head.next.next.next = head.next;
		
		detectLoop();
		
		
		
		
	}

}
