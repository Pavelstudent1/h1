package lesson150323.inheritance_vs_composition;

public class Use {

	
		public static void main(final String[] args) {
			
			B b = new B();
			b.use();
			
			D d1 = new D(new A());
			D d2 = new D(new Y());
			
			d1.use();
			d2.use();
			
			d2.setA(new A());
			d2.use();
			
			
		}
}
