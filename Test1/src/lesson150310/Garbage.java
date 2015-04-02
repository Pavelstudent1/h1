package lesson150310;

public class Garbage {
	@Override
	protected void finalize() throws Throwable {		
		System.out.println("I am dying...");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("start");
		
//		Garbage g;
//		for (;;) {
//			g = new Garbage();
//		}
		
		
		Garbage[] g = new Garbage[1000];
		for (int i = 0; i < g.length; i++) {
			g[i] = new Garbage();
		}
		
//		System.gc();	//garbage collection
		
//		Thread.sleep(10000);
		
	}
}
