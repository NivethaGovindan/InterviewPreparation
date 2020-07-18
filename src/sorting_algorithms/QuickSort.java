package sorting_algorithms;

import java.util.Arrays;

public class QuickSort {

	static void quickSort(int[] a, int p, int r){

		if(p<r){

			int pivot = partition(a, p, r);
			quickSort(a, p, pivot -1);
			quickSort(a, pivot+1, r);

		}


	}

	static int partition(int[] a,int p,int r){

		int pivotelem = a[r];
		int i = p-1;

		for(int j= p; j<r; j++){

			if(a[j] < pivotelem){
				i++;

				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		int temp = a[i+1];
		a[i+1] = a[r];
		a[r] = temp;

		return i+1;
		
	}

	public static void main(String args[])
	{
		int arr[] = {12, 11, 13, 5, 6, 7};

		System.out.println("Given Array");
		System.out.println(Arrays.toString(arr));

		quickSort(arr, 0, arr.length-1);

		System.out.println("\nSorted array");
		System.out.println(Arrays.toString(arr));
	}

}
