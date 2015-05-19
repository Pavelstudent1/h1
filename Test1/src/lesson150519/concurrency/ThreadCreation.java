package lesson150519.concurrency;

import utils.Utils;

public class ThreadCreation {
	
	private static final class newSympleThread extends Thread {
		@Override
		public void run(){
			new Task("-2").run();
		}
	}

	private static final class Task implements Runnable{
		
		private String message;
		
		public Task(final String message){
			this.message = message;
		}
		
		@Override
		public void run() {
			while(true){
				Utils.pause(1000);
				System.out.println(message);
			}
		}
	}
	
	public static void main(final String[] args) {
		
		Thread thread = new Thread(new Task("-1"));
		thread.start();
		
		new newSympleThread().start();
		
		new Thread().start();
		
	}
	
}
