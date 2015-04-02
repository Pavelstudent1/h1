package lesson150310;

public class D {
	
	private A a;
	
	public void setA(A a){
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
		D d = new D();
		d.setA(a);
		d.change();
		d.printState();
		A a2 = new A(10);
		d.setA(a2);
		d.change();
		d.printState();
	}
}
