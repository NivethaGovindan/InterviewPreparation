package sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args){

		int[] a = {3,4,1,2,5};
		int n = a.length;
		
		for(int i=0; i<n; i++){
			
			for(int j=i+1; j<n; j++){
				if(a[j]<a[i]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}


		System.out.println(Arrays.toString(a));

	}


}
