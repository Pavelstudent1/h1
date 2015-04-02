package lesson150310;

public class E {
	
	public void use(A a){
		a.inc();
//		System.out.println(a.get());
		printState(a);
	}
	
	public void change(A a){
		a.inc();
	}
	
	public void printState(A a){
		System.out.println(a.get());
	}
	
	public static void main(String[] args) {
		
		A a = new A(3);
		
		E e = new E();
		
		e.use(a);
	}
	
}
