package lesson150326.interfaces;

public class Usage {
	public static void main(final String[] args) {
		
		System.out.println("start");
		C c = new C();
		c.use();
		
		B b = new B();
		b.setWorker(new A());
		b.use();
		b.setWorker(new A1());
		b.use();
		
		b.setWorker(new Multiplier());
		b.use();
		
		Changeable ch = new A1();
		
		A a = new A1();
		ch = a;
		
		Object o = new Multiplier();
		
		ch = (Changeable) o;
		
//		ch = (Changeable) b;	//ERROR! b is not Changeable
		
		System.out.println("finish");
	}
}
