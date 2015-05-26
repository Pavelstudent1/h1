package lesson150526.concurrency;

import utils.Utils;


public class InterruptWaitingThread {
	
	static class Task implements Runnable {

		@Override
		public void run() {
			synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("catched interruption!");
			}
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
