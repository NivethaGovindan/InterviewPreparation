package check;


/*package whatever //do not write package name here */

import java.util.Scanner;

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
        
        Node new_node = new Node(data);
        new_node.next = top;
        this.top = new_node;
            
             System.out.print("top "+top.data);
             
        
        
    }
    
    void pop(){
        System.out.print("pop");
        if(top != null)
            top = top.next;
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
	    Scanner in = new Scanner(System.in);
	    
		int t = in.nextInt();
		for(int l = 0; l<t; l++){
		    int q = in.nextInt();
		    
		    Stack st = new Stack();
		    
		    for(int k = 0; k<q; k++){
		        
		        
		        
		        int operation = in.nextInt();
		        
		        
		        switch(operation) {
		            case 1:
		                int element = in.nextInt();
		                st.push(element);
		                st.printTop();
		                break;
		           case 2:
		               st.pop();
		               break;
		           case 3:
		               st.printTop();
		               break;
		        }       
		        
		    }
		}
	}
}
