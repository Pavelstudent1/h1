package lesson150323.static_hiding;

public class Use {

	
	public static void main(final String[] args) {
		
		A a = new A();
//		a.getCount();
		
		A a2 = new B(); //статич. метод вызывается из класса, объектом которого является а2
//		a2.getCount();
//		A.getCount();
		
		
		B b = new B();
//		b.getCount();
//		B.getCount();
		
		
	}
}
