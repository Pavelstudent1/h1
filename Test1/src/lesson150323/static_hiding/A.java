package lesson150323.static_hiding;

public class A {

	static int count;
	
	public static int getCount(){
		System.out.println("from A");
		return count;
	}
	
}
