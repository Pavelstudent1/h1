package lesson150526.concurrency;

import java.util.concurrent.TimeUnit;

import utils.Utils;


public class InterruptSleepingThread {
	
	static class Task implements Runnable {

		@Override
		public void run() {
			try {
//				Thread.sleep(100000);
				
				TimeUnit.SECONDS.sleep(100); //спать 100 секунд
				
			} catch (InterruptedException e) {
				System.out.println("catched interruption!");
			}
		}
		
		
	}
	
	public static void main(final String[] args) {
		
		
		System.out.println("start");
		
		Thread t = new Thread(new Task());
		t.start();
		
		Utils.pause(3000);
		
		t.interrupt(); //сигнал прерывания будит спящий 100 секунд поток
		
		System.out.println("finish");
	}
	
}
