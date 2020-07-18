package stack;

import java.util.Stack;

public class StackReverse {
	
	static Stack<Character> st = new Stack<>();
	
	static void insertAtBottom(char x){
		
		if(st.isEmpty()){
			st.push(x);
		}
		
		else{
			char a = st.pop();
			insertAtBottom(x);
			st.push(a);
		}
		
		
	}
	
	static void reverse(){
		
		if(!st.isEmpty()){
			char x =st.pop();
			reverse();
			insertAtBottom(x);
		}
		
	}
	
	public static void main(String[] args){
		
		st.push('a');
		st.push('b');
		//st.push('c');
		//st.push('d');
		
		System.out.println("Original Stack");
		System.out.println(st);
		
		reverse();
		
		System.out.println("Reversed Stack");
		System.out.println(st);
		
		
	}

}
