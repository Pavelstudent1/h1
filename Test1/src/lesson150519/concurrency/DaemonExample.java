package lesson150519.concurrency;

import utils.Utils;

public class DaemonExample {
	
	public static void main(final String[] args) {
		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				while(true){
//					Utils.pause(1000);
//					System.out.println(Thread.currentThread().getName() + " ----");
//				}
//			}
//		});
//		thread.start();
//		
//		System.out.println(thread.getThreadGroup());
//		System.out.println(Thread.currentThread().getThreadGroup());
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("start");
				Utils.pause(5000);
				System.out.println("finish");
			}
		}).start();
		

		
		startDaemon("Хоттабыч");
		startDaemon("Джаффарыч");
		startDaemon("Ахметыч");
		startDaemon("Петрович");
		
		
		
	}
	
	public static void startDaemon(final String name){
		
		class Task implements Runnable{

			@Override
			public void run() {
				while(true){
					Utils.pause(1000);
					System.out.println(Thread.currentThread().getName());
				}
			}
			
		}
		
		Thread thread = new Thread(new Task(), name);
		thread.setDaemon(true);
		thread.start();
		
		
	}
}
