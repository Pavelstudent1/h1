package lesson150323.hiding;

public class B extends A{

	int state; //это поле перекроет из А
	
	@Override
	public void change() {
		state += 2;
	}
	
	
	
	
	
	
	public static void main(final String[] args) {
		B b = new B();
		
		System.out.println(b.getState());
		
		b.change();
		
		System.out.println(b.getState());
		
		
	}
	
}
