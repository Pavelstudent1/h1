package lesson150317;

public class F extends E {

	int stateF = 20;
	
	{
		System.out.println("init F");
		System.out.println(stateE + ", " + stateF);
	}
	
	public F() {
		super(30);
		System.out.println("Construct F");
	}

	
	
	public static void main(final String[] args) {
	
		F f = new F();
		
		
	}
	
	
}
