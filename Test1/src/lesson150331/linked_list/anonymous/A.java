package lesson150331.linked_list.anonymous;

public class A {
	String state = "Hello";
	
	static class B implements I {
		@Override
		public int calc() {
			return 0;
		}
	}
	
	public I getI(){
		return new B();
	}
	
	public I getAnonymousI(){
		return new I() {	//creating anonymous class implemented interface I
			@Override
			public int calc() {
				System.out.println(state); //если указать this.state, то это даст ошибку,
				return 0;				   //т.к. данный this указывает на анонимный класс,
										   //а в нём state нету. Поэтому, обращение к внутр.
										   //классу только через внешний, т.е. A.this.state
			}
		};
	}
	
	public static void main(final String[] args) {
		
		A a = new A();
		
		I i = a.getAnonymousI();
		i.calc();
		
		System.out.println(i);
	}
	
}
