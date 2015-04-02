package lesson150317;

public class A {
	
//	protected int state;
	int state;
	
	public void change(){
		System.out.println("change of A");
		state++;
	}
	
	public int get(){
		return state;
	}
	
}
