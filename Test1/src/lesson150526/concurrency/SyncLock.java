package lesson150526.concurrency;

import utils.Utils;

public class SyncLock {
	
	static class Task implements Runnable {

		@Override
		synchronized public void run() { //объект класса Task будет намертво заблокирован потоком, его выполняющим
			System.out.println(Thread.currentThread().getName());
			while(true){
				
			}
		}
		
		
	}
	
	public static void main(final String[] args) {
		
		Task task = new Task();
		
		System.out.println(task);
		
		new Thread(task).start();
		
		Thread thread2 = new Thread(task, "hatiko");
		thread2.start();
		
		Utils.pause(1000);
		
//		synchronized (task) {
//			task.notify();			
//		}
		
		thread2.destroy();
		
		
	}
	
}
