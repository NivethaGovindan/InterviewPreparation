package stack;

import java.util.Stack;

public class SortStack {

	static Stack<Integer> st = new Stack<>();

	static void sort(int a){

		if(st.isEmpty())
			st.push(a);
		
		else{
			int x = st.pop();
			
			if(a<x){
			sort(a);
			st.push(x);
			}
			else{
				sort(x);
				st.push(a);
			}

		}

	}


	public static void hold(){

		if(st.isEmpty())
			return;
		
		else{
			int a = st.pop();
			hold();
			sort(a);

		}
	
	}
	
	public static void main(String[] args){
		
		st.push(1);
		st.push(3);
		st.push(4);
		st.push(2);
		System.out.println(st);
		hold();
		System.out.println(st);
	}

}
