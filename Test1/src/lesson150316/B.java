package lesson150316;

public class B {
	 
	public static void main(String[] args) {
		
		int x = 20;
		
		something(x); //something(20)
		
		System.out.println(x);
	}

	private static void something(final int paramX) { //int x = 20
		
//		paramX = 30;
		System.out.println(paramX);
		
	}
}
