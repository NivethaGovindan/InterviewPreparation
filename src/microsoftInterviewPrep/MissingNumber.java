package microsoftInterviewPrep;

public class MissingNumber {
	
	static void findMissingNumber(int[] a){

		//we add one to the length since we are missing one element in the array
		// we should include that also to get our results correct
		int n = a.length + 1;
		int total = n* (n+1) /2;
		
		int arraytotal = 0;
		for(int i=0; i<a.length; i++){
			arraytotal += a[i];
		}
		
		int res = total - arraytotal;
		
		System.out.println("Missing number is "+ res);
	}
	
	public static void main(String[] args){
		
		int[] a= {1, 2, 4, 6, 3, 7, 8};
		findMissingNumber(a);
		
	}

}
