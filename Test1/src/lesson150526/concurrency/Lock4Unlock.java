package lesson150526.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Utils;

public class Lock4Unlock {
	
	public static void main(final String[] args) {
		
		final Lock lock = new ReentrantLock(); //final, т.к. будет использоваться как локальная переменная
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				lock.lock();
				try{
					while(true){
						//haha
					}
				}finally{
					lock.unlock();
				}
			}
		}).start();
		
		Utils.pause(1000);
		
		Thread hatiko = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					lock.lockInterruptibly();
				} catch (InterruptedException e) {
					System.out.println("interrupted, leave now");
					return;
				}
				try{
					System.out.println("HeHe!");
				}finally{
					lock.unlock();
				}
			}
		}, "Hatiko");
		
		hatiko.start();
	
		Utils.pause(1000);
		
		hatiko.interrupt();
		
	}
	
}
