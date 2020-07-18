package stack;

import java.util.Stack;

public class BalancedParenthesis {

	static boolean isMatchingPair(char character1, char character2){

		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;

		return false;
	}

	static boolean checkParenthesis(String s){
		int n = s.length();
		Stack<Character> st = new Stack<>();

		for(int i=0; i<n; i++){
			char ch = s.charAt(i);

			if(ch == '(' || ch == '[' || ch == '{')
				st.push(ch);

			else{
				
				if(st.isEmpty())
					return false;

				else if( isMatchingPair(st.peek(), ch) ){
					st.pop();
				}
				
				else{
					return false;
				}
			}



		}

		if(st.isEmpty())
			return true;

		return false;
	}

	public static void main(String[] args){
		String s = ")))(((";

		if(checkParenthesis(s))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");

	}

}
