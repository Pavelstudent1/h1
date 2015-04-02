package lesson150310;

public class C {
	
	private A a;

	public C(A a) {
		this.a = a;
	}
	
	public void change(){
		a.inc();
	}
	
	public void printState(){
		System.out.println(a.get());
	}
	
	
	public static void main(String[] args) {
		
		A a = new A();
		C c = new C(a);
		c.change();
		c.printState();
		
		
	}
}
