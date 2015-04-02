package lesson150316;

public class UseS {
	
	public static void main(final String[] args) {
		
		System.out.println(S.Counter);
//		System.out.println(S.counter); //Error!
		
		S s = new S();
		S s2 = new S();
		
		System.out.println(s.counter);
		s.counter = 20;
		System.out.println(s.counter);
		System.out.println(s2.counter);
		
//		System.out.println(s.Counter);	//BAD Style!
//		System.out.println(s2.Counter);
		
		System.out.println(S.Counter); //GOOD style
		
	}
	
}
