package lesson150310;

public class A {
	
//class members = fields + methods
	
	//state (fields)
	private int i;
	
	public A(){
		
	}
	
	public A(int initialState) {
		i = initialState;
	}
	//behavior (methods)
	public void inc() {	//change state
		++i;
	}
	
	public int get(){	
		return i;
	}
	
	//инкапсуляция = поля + методы + модификатор допуск к полям + интерфейс
}
