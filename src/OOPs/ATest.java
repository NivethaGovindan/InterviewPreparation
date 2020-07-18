package OOPs;

interface Animal
{
 void type();
}
public class ATest {
 
	public static void main(String args[]){
		
		//here with the implementation of type a class which implements animal interface is created
		// instance is created and assigned to an
		Animal an = new Animal(){         //Annonymous class created
				public void type()
				{
						System.out.println("Annonymous animal");
				}
 };
  an.type();
 }
}