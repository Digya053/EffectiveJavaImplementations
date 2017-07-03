package chapter02.item03;

public enum Elvis {
	INSTANCE;

	public void leaveTheBuilding(){
		System.out.println("The building is on fire!!!");
	}

	public static void main(String[] args){
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}

}
