package lesson150326.interfaces;

public class Service {
	
	public static void main(final String[] args) {
		
		Furniture[] things = {new Chaire(), new SurgeryTable(), new KitchenTable()};
		
		serve(things);
		
		clean(new Cleanable[] {new Cat(), new Chaire(), new KitchenTable(), new Multiplier()});
}

	private static void clean(final Cleanable[] things) {
		for (Cleanable something : things) {
			something.clean();
		}
	}

	private static void serve(final Furniture[] things) {
		for(Furniture furniture : things) {
			furniture.move();
			furniture.clean();
			furniture.move();
		}
	}
}
