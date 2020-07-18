package linkedlist;
import java.util.*;

public class IntersectionPoint {
	
	Node head = null;
	
	//without extra space
	static Node getIntersect(Node list1, Node list2){
		
		Node intersect = null;
		int len1 = 0, len2 = 0, diff = 0;
		
		Node temp = list1;
		while(temp!= null){
			len1++;
			temp = temp.next;
		}
		
		temp = list2;
		while(temp != null){
			len2++;
			temp = temp.next;
		}
		
		Node p = list1, q = list2;
		
		if(len1 > len2){
			diff = len1 - len2;
			
			while(diff != 0){
				p = p.next;
				diff--;
			}
		}
		else if( len2 > len1){
			
			diff = len2- len1;
			
			while(diff != 0){
				q = q.next;
				diff--;
			}
		}
		
		while( p!= null && q != null){
			
			if(p == q){
				intersect = p;
				break;
			}
			
			p = p.next;
			q = q.next;
		}
		
		return intersect;
		
	}
	
	
	//using hashset
	static Node getIntersection( Node list1, Node list2){
		
		HashSet<Node> set = new HashSet<>();
		
		Node intersection = null;
		
		Node temp = list1;
		
		while(temp != null){
			set.add(temp);
			temp = temp.next;
		}
		
		temp = list2;
		
		while(temp!= null){
			
			if(set.contains(temp)){
				intersection = temp;
				break;
			}
			
			temp = temp.next;
		}
		
		return intersection;
		
	}
	
	public static void main(String[] args){
		
		LinkedList l1 = new LinkedList(), l2 = new LinkedList();
		
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		
		l2.head = new Node(1);
		l2.head.next = l1.head.next.next;
		
		l1.printList();
		l2.printList();
		
		Node result = getIntersection(l1.head, l2.head);
		Node result2 = getIntersect(l1.head, l2.head);
		
		System.out.println(result.data);
		
		System.out.println(result2.data);
		
		
	}
	

}
