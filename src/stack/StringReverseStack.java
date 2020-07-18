package stack;
import java.util.Stack;

public class StringReverseStack {
	
	static void reverse(StringBuffer str){
		
		int n = str.length();
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<n; i++){
			st.push(str.charAt(i));
		}
		
		for(int i=0; i<n; i++){
			char ch = st.pop();
			str.setCharAt(i, ch);
			
		}
		
	}

	
	public static void main(String[] args){
		
		StringBuffer str = new StringBuffer("STACK");
		reverse(str);
		System.out.println(str);

		}
}
