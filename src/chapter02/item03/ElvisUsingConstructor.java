package chapter02.item03;

import java.io.Serializable;

public class ElvisUsingConstructor implements Serializable {

	private static final ElvisUsingConstructor INSTANCE = 
			new ElvisUsingConstructor();
	
	private ElvisUsingConstructor(){}

	private static ElvisUsingConstructor getInstance(){
		return INSTANCE;
	}
	
	private Object readResolve(){
		return INSTANCE;
	}

	public void leaveTheBuilding(){
		System.out.println("The building is on fire!!!");
	}
	
	public static void main(String[] args){
		ElvisUsingConstructor elvis = ElvisUsingConstructor.getInstance();
		elvis.leaveTheBuilding();
	}
}
