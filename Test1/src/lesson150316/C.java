package lesson150316;

public class C {//pass reference by value
 	
	private int _state;
	
	public C(final int initialState) {
		_state = initialState;
	}
	
	public static void main(final String[] args) {
		
		final C c1 = new C(10);
		
		final C c2 = c1; //copy reference
		
		process(c1); //C c = c1;
		
		System.out.println(c1._state);
	}

	private static void process(final C c) {
//		c = new C(30); //with "final" gives ERROR!
	}
	
}
