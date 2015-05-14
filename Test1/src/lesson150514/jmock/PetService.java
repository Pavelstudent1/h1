package lesson150514.jmock;

public class PetService {

	public void serve(final Pet pet) {
		pet.stroke();
		pet.feed();
		pet.wash();
		pet.walk();
	}
	
	
	
}
