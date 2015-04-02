package lesson150317;

public class B extends A{
	
	@Override
	public void change(){
		System.out.println("change of B");
		state += 2;
	}
	
	
}
