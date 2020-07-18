package arrays;

public class D0602_TrappingRainWater {

	static int calculateRainwater(int[] a){

		int total = 0;
		int n = a.length;
		int[] l = new int[n], r = new int[n];

		l[0] = a[0];

		for(int i=1; i<n; i++){

			l[i] = Math.max(l[i-1], a[i]);

		}
		
		r[n-1] = a[n-1];

		for(int i= n-2; i>=0; i--){

			r[i] = Math.max(r[i+1], a[i]);

		}
		
		for (int i=0; i<n; i++){
			
			total += Math.min(l[i], r[i]) - a[i];
		}

		return total;

	}
	
	public static void main(String[] args){
		
		//int[] arr = {3, 0, 0, 2, 0, 4};
		int[] arr =  {1,5,2,3,1,7,2};
		
		int res = calculateRainwater(arr);
		
		System.out.println(res);
		
		
	}



}
