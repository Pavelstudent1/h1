package lesson150310;

public class B {
	
	//state
	A a = new A();
	
	public void change(){
		a.inc();
	}
	
	public void printState(){
		System.out.println("B's state is " + a.get());
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.change();
		b.printState();
	}
}
