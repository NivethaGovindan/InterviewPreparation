package stack;

import java.util.Stack;

public class EvalPostfix {
	
	static int calculate(int op1, int op2, char ch){
		
		switch(ch)
		{
		
			case '+':
				return op1+op2;
			case '-':
				return op1-op2;
			case '*':
				return op1*op2;
			case '/':
				return op1/op2;
			case '^':
				return (int)Math.pow(op1, op2);
		}
		
		
		return 0;
	}

	static int evalPostfix(char[] a){
		
		int n = a.length;
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<n; i++){
			
			char ch = a[i];
			
			if(Character.isDigit(ch)){
				
				/*
				 *  '0'-'0' = 0
					'1'-'0' = 1
					'2'-'0' = 2
					.
					.
					.
					'9'-'0' = 9
				 * 
				 */
				
				int d = ch - '0';
				st.push(d);
				
			}
			
			else{
				int op2 = st.pop();
				int op1 = st.pop();
				int res = calculate(op1, op2, ch);
				st.push(res);
			}
			
			
			
		}
		
		return st.pop();
		
	}
	
	public static void main(String[] args){
		String s = "623+-382/+*2^3+";
		char[] a = s.toCharArray();
		
		System.out.println(evalPostfix(a));
		
	}
	
}
