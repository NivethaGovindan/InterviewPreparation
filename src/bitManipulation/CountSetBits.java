package bitManipulation;

public class CountSetBits {
	
	public static void main(String[] args){
		int n = 6, count = 0;
		
		while (n != 0){
			count +=1;
			n = n & (n-1);
		}
		
		System.out.println(count);
	
	}

}
