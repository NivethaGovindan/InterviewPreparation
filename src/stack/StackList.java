package stack;


public class StackList {
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
		
	}
	
	Node top = null;
	
	void push(int data){
		
		Node new_Node = new Node(data);
		new_Node.next = top;
		top = new_Node;
		
	}
	
	int pop(){
		
		int data = top.data;
		top = top.next;
		return data;
	}
	
	int peek(){
		return top.data;
	}
	
	boolean isEmpty(){
		
		if(top == null)
			return true;
		
		return false;
	}
	
	public static void main(String[] args){
		StackList s = new StackList();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
	
	
	
	

}
