package lesson150326.interfaces;

public class Multiplier implements Changeable, Cleanable{
	
	int state;
	
	@Override
	public void change() {
		state *= 2;
	}

	@Override
	public void clean() {
		System.out.println("cleaning multiplier");
		state = 0;
	}
	
}
