package stack;

import java.util.Stack;

public class InfixToPostfix {
	
	static int precedence(char ch){
		
		switch (ch)
		{
		
			case '^':
				return 3;
				
			case '*':
			case '/':
				return 2;
				
			case '+':
			case '-':
				return 1;
			
		}
		
		return -1;
		
	}
	
	static char[] getPostfix(char[] s){
		
		char[] a = new char[s.length];
		Stack<Character> st = new Stack<>();
		int n = a.length;
		int count = 0;
		
		for(int i=0; i<n; i++){
			char ch = s[i];
			
			if(Character.isLetterOrDigit(ch)){
				a[count++] = s[i];
			}
			
			else if(ch == '('){
				st.push(ch);
			}
			
			//pop and add to string to '(' and pop '(' finally
			else if(ch == ')'){
				
				while(!st.isEmpty() && st.peek() != '(' )
					a[count++] = st.pop();
				
				if(st.peek()== '(')
					st.pop();
				
				else
					System.out.println("Invalid expression");
				
			}
			
			//while there is any element in stack with greater or equal precedence pop it and add it to string
			
			else {
				
				while( !st.isEmpty() && precedence(st.peek()) >= precedence(ch))
					a[count++] = st.pop();	
				
				st.push(ch);
			}
		
		}
		
		while(!st.isEmpty()){
			a[count++] = st.pop();
		}
		
		return a;
		
	}
	
	public static void main(String[] args){
		
		String str = "a+b*(c^d-e)^(f+g*h)-i";
		char[] s = str.toCharArray();
		
		System.out.println( getPostfix(s) );
		//abcd^e-fgh*+^*+i-
		
		
	}

}
