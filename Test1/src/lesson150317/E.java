package lesson150317;

public class E {
	
	int stateE = 10;
	
	{
		System.out.println("init E");
	}
	
//	public E() {
//		super();
//		System.out.println("Construct E");
//	}
	
	public E(final int initialState) {
		stateE = initialState;
		System.out.println("Construct E with parameter");
	}
	
	
	
}
