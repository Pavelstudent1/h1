package lesson150421.patterns.bus;

public class UseBus {
	
	public static void main(final String[] args) {
		
		Bus bus = new Bus();
		
		A a1 = new A(bus);
		new A(bus);
		new B(bus);
		new B(bus);
		new B(bus);
		
		a1.change();
		
	}
	
}
