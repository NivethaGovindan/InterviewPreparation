package linkedlist;

public class Palindrome {
	
	Node head = null;
	
	class Node
    {
        char data;
        Node next;
        Node(char d) {data = d; next = null; }
    }
	
	
	public void push(char new_data)
    {
        Node new_node = new Node(new_data);
  
        new_node.next = head;
  
        head = new_node;
    }
	
	static void printlist( Node head) {
		
		Node temp = head;
		
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
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
	
	
	
	static boolean checkPalindrome(Node head){
		
		Node p = head, q = head;
		Node list1 = head, list2 = null;
		Node prev = null;
		boolean result = false;
		
		while( p!= null && p.next != null ){
		
		    prev = q;
			p = p.next.next;
			q = q.next;
			
		}
		
		prev .next = null;
		// the list is even
		if(p == null){
			list2 = q;
		}
		
		else if(p.next == null){
			
			list2 = q.next;
		}
		
		list2 = reverse(list2);
		
		printlist(list1);
		printlist(list2);
		while(list1 != null && list2 != null){
			
			if(list1.data != list2.data){
				result = true;
				break;
				
			}
			
			list1 = list1.next;
			list2 = list2.next;
		}
		
		return !result;
	}
	
	
	public static void main(String[] args){
		
		Palindrome list = new Palindrome();
		boolean result;
		
		list.push('a');
		list.push('b');
		list.push('a');
		
		result = checkPalindrome(list.head);
		
		System.out.println(result);
		
		Palindrome list2 = new Palindrome();
		list2.push('a');
		list2.push('b');
		list2.push('b');
		list2.push('a');
		
		result = checkPalindrome(list2.head);
		System.out.println(result);
		
		Palindrome list3 = new Palindrome();
		list3.push('s');
		list3.push('b');
		
		result = checkPalindrome(list3.head);
		System.out.println(result);
	
	}

}
