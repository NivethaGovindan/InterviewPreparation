package OOPs;

class  Parent{

	void showDetails(){

		System.out.println("I am Parent");

	}
}

public class Child extends Parent{
	
	void showDetails(){

		System.out.println("I am child");

	}
	
	void showDetails2(){

		System.out.println("I am child's other method");

	}
	
	
	public static void main(String[] args){
		
		Parent obj = new Child();
		obj.showDetails();
		//obj.showDetails2();
		
		
	}

}
