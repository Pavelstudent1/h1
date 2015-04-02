package lesson150317;

public class LazyA { //Liskov Substituion Principle is broken
	
	protected int state; //доступ пакетный
	
	public void change(){
		state += 2;
	}
	
	public int get(){
		return state;
	}
	
}
