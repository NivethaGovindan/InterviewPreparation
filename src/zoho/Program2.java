package zoho;

//finished at 4.22

public class Program2 {
	
	public static void main(String[] args){
		
		String[][] places = {{"Vellore","Bangalore"},{"Mysore", "Goa"},{"Bangalore","Mysore"},{"Chennai","Vellore"}};
		
		int numplaces = places.length;
		
		String[] temp = places[0];
		String[][] result = new String[numplaces][2];
		
		for(int i=0; i<numplaces; i++){
			boolean present = false;
			for(int j=0; j<numplaces; j++){
				if(places[i][0].equals(places[j][1])){
					present = true;
					break;
				}
				
			}
			if(!present){
				temp = places[i];
				break;
			}
		}
		
		result[0] =temp;
		
		int count = 0;
		
		for(int i=0; i<numplaces; i++){
		
			for(int j=0; j<numplaces; j++){
				
				if(result[i][1].equals(places[j][0])){
					result[++count] = places[j];
					
				}
				
			}
		}
		
		for(int i=0; i<numplaces; i++){
			
			for(int j=0; j<2; j++){
				
				System.out.print(result[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}

}
