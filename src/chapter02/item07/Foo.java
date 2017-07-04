package chapter02.item07;

public class Foo {

	@Override
	protected void finalize() throws Throwable{
		try {
			System.out.println("Finalize subclass state");
		} finally {
			super.finalize();
		}
	}

	public static void main(String[] args){
		Foo foo = new Foo();
		try {
			foo.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
