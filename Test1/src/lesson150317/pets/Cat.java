package lesson150317.pets;

public class Cat extends Friend{
	
	@Override
	public void wash() {
		wearGloves();
		super.wash();
	}

	private void wearGloves() {
		System.out.println("Wearing gloves before wash");
	}
	
}
