package stack;

import java.util.Stack;

public class NGE {

	static Stack<Integer> st = new Stack<>();
	
	static void nextGreater(int[] a){
		
		int n = a.length;
		st.push(a[0]);
		
		for(int i=1; i<n; i++){
			
			while(!st.isEmpty() && a[i]>st.peek()){
				
				System.out.println("Next Greater Element for "+st.pop()+" is "+a[i]);
				
			}
			
			st.push(a[i]);
			
		}
		
		while(!st.isEmpty()){
			
			System.out.println("Next Greater Element for "+st.pop()+" is null");
		
		}
		
		
	}
	
	public static void main(String[] args){
		
		int[] ar = {13,7,6,12};
		nextGreater(ar);
	}
}
