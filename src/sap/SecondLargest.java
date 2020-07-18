package sap;

public class SecondLargest {
	
	public static void main(String[] args){
		
		int[] a = {89, 24, 75, 11, 23};
		int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++){
			
			if(a[i] > max){
				
				secondMax = max;
				max = a[i];
				
			}
			else if(a[i] > secondMax){
				secondMax = a[i];
			}
			
		}
		
		System.out.println("The second maximum element is "+secondMax);
		
	}

}
