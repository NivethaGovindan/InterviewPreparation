package sap;

public class ReverseWords {
	
	public static void main(String[] args){
		
		String word = "I am done";
		StringBuilder result = new StringBuilder("");
		
		String[] arr = word.split("\\s");
		
		for(int i=arr.length-1; i>=0; i--){
			
			result.append(arr[i]);
			result.append(" ");
			
		}
		
		System.out.println(result.toString());
		
		
	}

}
