package lesson150317.pets;

public class CageBeast extends Pet{

	@Override
	public void feed() {
		cleanCade();
		super.feed();
	}

	private void cleanCade() {
		System.out.println("Cleaning cage for rodent");
	}

	
	
}
