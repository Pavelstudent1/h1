package lesson150525.concurrency;

import utils.Utils;

public class MultipleWait {
	static class Sprinter implements Runnable {
		
		private Object _pistol;
		
		public Sprinter(final Object pistol) {
			_pistol = pistol;
		}
		
		@Override
		public void run() {
			
			synchronized (_pistol) {
				System.out.println("locked " + this);
				Utils.pause(2000);
				try {
					System.out.println("wait " + this);
					_pistol.wait();
					System.out.println("awaken " + this);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Utils.pause(2000);
				System.out.println("released " + this);
			}
			
		}
		
	}
	
	public static void main(final String[] args) {
		
		Object pistol = new Object();
		
		Sprinter[] sprinters = {new Sprinter(pistol), 
								new Sprinter(pistol),
								new Sprinter(pistol)};
		
		for (Sprinter sprinter : sprinters) {
			new Thread(sprinter).start();
		}
		
		Utils.pause(15000);
		
		synchronized (pistol) {
			pistol.notify(); //notify() разбудит только один поток
		}
		
	}
	
	
}
