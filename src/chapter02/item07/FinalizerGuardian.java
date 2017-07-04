package chapter02.item07;

public class FinalizerGuardian {

	private final Object finalizerGuardian = new Object() {
		@Override 
		protected void finalize() throws Throwable{
			//Finalize outer FinalizerGuardian object
		}
	};

	public static void main(String[] args){
		FinalizerGuardian fGuardian = new FinalizerGuardian();
		try {
			fGuardian.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
