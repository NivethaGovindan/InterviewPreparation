package bitManipulation;

public class RightMostSetBit {
	
	public static void main(String[] args){
		
		int n = 12;
		int rightmostbit;
		
		rightmostbit = (int) (Math.log10((n & -n)) / Math.log10(2)) +1;
		
		System.out.print(rightmostbit);
		
		
	}

}
