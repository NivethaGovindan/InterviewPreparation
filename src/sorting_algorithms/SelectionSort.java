package sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args){

		int[] a = {3,4,1,2,5};
		int n = a.length;

		for(int i=0; i<n; i++){

			int min = a[i];
			int minIndex = i;

			for(int j=i+1; j<n; j++){

				if(a[j]<min){
					min = a[j];
					minIndex = j;
				}
				
			}

			a[minIndex] = a[i];
			a[i] = min;

		}

		System.out.println(Arrays.toString(a));

	}

}
