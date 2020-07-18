package sap;

public class RemoveSpaces {
	
	public static void main(String[] args){
		
		String str = "Hi nivetha";
		System.out.println("Input String: "+str);
		str = str.replaceAll("\\s", "");
		
		System.out.println("Output String: "+str);	
	}

}
