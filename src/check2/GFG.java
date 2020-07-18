package check2;


/*package whatever //do not write package name here */

import java.util.Scanner;

import stack.StackList;


class Stack{



	class Node{

		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}

	}

	Node top;

	Stack(){
		top = null;
	}


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
	void printTop(){

		if(top == null){
			System.out.println("-1");
		}
		else{
			System.out.println(top.data);
		}
	}

}

class GFG {
	public static void main (String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
