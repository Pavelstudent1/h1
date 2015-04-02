package lesson150312;

public class UseComplex {
	
	public static void main(String[] args) {
		
		Complex complex = new Complex(100);
		
		complex.reportState();
		
		complex.change(50);
		
		complex.reportState();		
		
//		complex.a = 30000; ERROR! can't access private field		
		
		complex.change(1000);
		
		complex.reportState();
		
		complex.d = 100;
	}
}
