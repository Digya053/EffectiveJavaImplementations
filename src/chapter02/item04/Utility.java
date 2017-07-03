package chapter02.item04;

//Non instantiable utility class
public class Utility {

	private Utility(){
		throw new AssertionError();
	}

	public static void main(String[] args){
		//this will throw assertion error
		try{
			Utility utility = new Utility();
		} catch (AssertionError e){
			System.out.println("Can't be instantiated!");
		}
	}
}
