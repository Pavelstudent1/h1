package lesson150317;

public class X {
	
	int state;
	
	public void change(){
		System.out.println("changeX");
		state++;
	}
	
	public void other(){
		System.out.println("otherX");
	}
	
	public void something(){
		System.out.println("original something");
	}
}
