package bitManipulation;

public class RightMostDifferentBit {

	public static void main(String[] args){
		int m = 11, n = 9;
		
		int diffValue = m ^ n;
		
		int result = (int)(Math.log10( diffValue & -diffValue) / Math.log10(2)) +1;
		
		System.out.print(result);
		
	}
}
