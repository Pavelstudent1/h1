package lesson150319.abstracts;

public class Horse extends Vehicle{
	
	public Horse(){
		super();
		
//		Vehicle v = new Vehicle(); Error vehicle is abstract!
	}
	
	@Override
	public void moveTo(final int x, final int y) {
		for (int i = 0; i < 10; i++) {
			System.out.println("тыгыдым-тыгыдым");			
		}
		System.out.println("и прискокали!");
	}

}
