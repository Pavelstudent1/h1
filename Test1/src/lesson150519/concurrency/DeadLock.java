package lesson150519.concurrency;

import utils.Utils;

public class DeadLock {
	
	static Object ruby = new Object();
	static Object diamond = new Object();
	
	
	public static void main(final String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				posess(diamond, ruby);
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				posess(diamond, ruby);
			}
		}).start();
		
	}
	
	public static void posess(final Object jewel, final Object otherJewel){
		synchronized (jewel) {
			System.out.println("I've got it! " + jewel);
			Utils.pause(1000);
			synchronized (otherJewel) {
				System.out.println("I've got it! " + jewel);				
			}
			Utils.pause(3000);
			System.out.println("I bored with " + jewel);
		}
	}
	
}
