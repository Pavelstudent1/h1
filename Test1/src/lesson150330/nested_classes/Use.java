package lesson150330.nested_classes;

import lesson150330.nested_classes.B.C;

public class Use {
	
	public static void main(final String[] args) {
		
		B b = new B();
		C c = new C();
		B.C c2 = new B.C();
		
		D d = new D();
		
		d.s.print();
		
		E e = new E();
		e.i.print();
		
		
		E.I i = e.new I();
	}
}
