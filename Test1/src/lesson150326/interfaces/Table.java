package lesson150326.interfaces;

public abstract class Table extends Furniture {

	@Override
	public void move() {
		System.out.println("moving table");

	}

	@Override
	public void clean() {
		System.out.println("cleaning table");
	}

}
