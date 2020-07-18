package zoho;

//2.14 to 2.22

import java.util.Arrays;

public class Program1 {
	
	public static void main (String[] args){
	
	int a[] = {4,5,16,10,7,5,3};
	
	for(int i=0; i<a.length-1; i++){
		
		int max = a[i+1];
		
		for(int j=i+2; j<a.length; j++){
			if(a[j]> max){
				max = a[j];
			}
		
			
		}
		a[i] = max;
		
	}
	
	 a[a.length-1] = -1;
	 
	 System.out.print(Arrays.toString(a));
	
	}

}
