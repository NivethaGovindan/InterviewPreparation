package stack;

public class Stack {
	
	static final int MAX = 100;
	int top=-1;
	int a[] = new int[MAX];
	
	boolean isEmpty(){
		return (top <0 );
	}
	
	void push(int x){
		if(top>=MAX)
			System.out.println("Stack overflow");
		
		a[++top] = x;
		
	}
	
	int peek(){
		return a[top];
	}
	
	int pop(){
		if( top== -1){
			System.out.println("Stack is empty");
			return -1;
		}
		
		return a[top--];
	}
	
	public static void main(String[] args){
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
	}
	
	

}
