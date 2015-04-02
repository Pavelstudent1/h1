package lesson150317.pets;

public class Dog extends Friend {
	
	@Override
	public void feed() {
		whistle();
		super.feed();
	}

	private void whistle() {
		System.out.println("Whistling for dog");
	}
}
