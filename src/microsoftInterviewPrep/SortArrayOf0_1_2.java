package microsoftInterviewPrep;

import java.util.Arrays;

public class SortArrayOf0_1_2 {
	
	static void sortArray(int[] a){
		
		int low = 0, high = a.length-1, mid = 0;
		
		while( mid <= high){
			
			if(a[mid] == 0){
				int temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				
				low++;
				mid++;
			}
			
			else if(a[mid] == 2){
				
				int temp = a[high];
				a[high] = a[mid];
				a[mid] = temp;
				high--;
			}
			
			else{
				mid++;
			}
			
			
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}
	
	public static void main(String[] args){
		
		int[] a =  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sortArray(a);
		
	}

}
