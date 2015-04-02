package lesson150402.polymorphism;

public class Polymorphism {
	
	static class A {
		
	}
	
	static class B extends A {
		@Override
		public String toString() {
			return "this is B";
		}
	}
	
	static class C extends B{
		
	}
	
	public static void main(final String[] args) {
		
		B b = new B();
		
		A a = b;
		
		Object o = a; //неявный вид Object o = (Object)a; 
		
		C c = new C();
		
		
//		System.out.println(o);
//		System.out.println(o.toString()); //toString() сработает из Object, т.к. ни в A ни в B
										  //данный метод не переопределён!
		
		printObjectDetails(c);
		
	}

	private static void printObjectDetails(final Object o) {
		System.out.println(o.toString()); //объекту о посылается сообщение toString().
										  //Если в о его нет, то смотрим в В. Если там нет, то дальше, пока не встретим.
	}
}
