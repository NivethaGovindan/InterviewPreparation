package bitManipulation;

public class RotateBits {
	static final int INT_BITS = 32;
	
	static void rotateRight(int n, int k){
		n = (n>>k) | (n<<(INT_BITS-k));
		System.out.println("Right rotaed: "+n);
	}
	
	static void rotateLeft(int n, int k){
		n = (n<<k) | (n>>(INT_BITS-k));
		System.out.println("Left rotaed: "+n);
	}
	
	public static void main(String[] args){
		
		int n = 16, k = 2;
		rotateRight(n,k);
		rotateLeft(n,k);
	}

}
