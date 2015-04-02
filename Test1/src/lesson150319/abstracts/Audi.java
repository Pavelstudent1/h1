package lesson150319.abstracts;

public class Audi extends Car{
	
	@Override
	public void moveTo(final int x, final int y) {
		turnOn();
		drive();
		shutDown();
	}
	
}
