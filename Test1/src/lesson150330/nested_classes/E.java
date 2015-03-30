package lesson150330.nested_classes;

public class E {

	class I {
		void print() {
			System.out.println(state);
		}
	}
	
	int state;
	I i;
	
	public E() {
		i = new I();
		
	}
	
	
}
