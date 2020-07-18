package microsoftInterviewPrep;

import java.util.Arrays;

public class KeyPair {
	
	static void findKeyPair(int[] a, int sum){
		
		Arrays.sort(a);
		
		int l = 0;
		int r = a.length -1;
		
		while(l < r){
			
			int currsum = a[l]+ a[r];
			
			if(currsum == sum){
				System.out.println("The pairs with sum "+ sum+" are: "+ a[l]+" and "+a[r]);
				break;
			}
			else if( currsum < sum){
				l++;
			}
			else{
				r--;
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args){
		
		  int a[] = {1, 4, 45, 6, 10, -8};
	      int n = 16;
	      findKeyPair(a, n);
		
		
	}

}
