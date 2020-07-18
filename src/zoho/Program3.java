package zoho;
import java.util.*;

//finished at 7.40

public class Program3 {
	
	public static void removeDuplicates(StringBuilder s){
		
		int len = s.length();
		int i=0;
		
		while(i<len-1){
			if(s.charAt(i) == s.charAt(i+1)){
				s.delete(i, i+2);
				len-=2;
			}
			else{
				i++;
			}
		}
		
		System.out.println(s);
		
		if( isDuplicatesPresent(s))
			removeDuplicates(s);
		
	}
	
	public static boolean isDuplicatesPresent(StringBuilder s){
		
		boolean present = false;
		
		HashSet<Character> set = new HashSet<Character>();
		
		int len = s.length();
		
		for(int i=0; i<len; i++){
			if(!set.add(s.charAt(i)) && s.charAt(i) == s.charAt(i-1)){
				present = true;
				break;
			}
		}
		
		return present;
	}
	
	public static void main(String[] args){
		StringBuilder s;
		Scanner in = new Scanner(System.in);
		
		s = new StringBuilder(in.nextLine());
		
		removeDuplicates(s);
		
	}

}
