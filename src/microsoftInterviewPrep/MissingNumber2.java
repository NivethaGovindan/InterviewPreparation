package microsoftInterviewPrep;

public class MissingNumber2 {
	
	static void findMissingNumber(int[] a){

		int x1 = a[0];
		int x2 = 1;
		
		for(int i=1; i<a.length; i++){
			
			x1 = x1 ^ a[i];
			
		}
		
		// 1 is added to length since the number of elements will be one more when we 
		// include the count of missing element
		
		for(int i=2; i<= a.length+1; i++){
			
			x2 = x2 ^ i;
		}
		
		int res = x1 ^ x2;
		
		System.out.println(res);
		
	}
	
	public static void main(String[] args){
		
		int[] a= {1, 2, 4, 6, 3, 7, 8};
		findMissingNumber(a);
		
	}

}
