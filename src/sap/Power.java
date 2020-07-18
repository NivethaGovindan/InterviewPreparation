package sap;

public class Power {
	
	public static void main(String[] args){
		
		int x = 27, y = 729;
		
		int val = (int)Math.log(y)/ (int)Math.log(x);
		
		double res = Math.log(y)/Math.log(x);
		
		if(val == res){
			System.out.println(x+" can be expressed as a power of "+y);
		}
		
		else{
			System.out.println(x +" cannot be expressed as a power of "+y);
		}
		
	}

}
