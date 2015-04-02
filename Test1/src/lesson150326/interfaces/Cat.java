package lesson150326.interfaces;

public class Cat implements Cleanable{
	
	@Override
	public void clean() {
		System.out.println("wearing gloves");
		System.out.println("washing cat");
	}
	
}
