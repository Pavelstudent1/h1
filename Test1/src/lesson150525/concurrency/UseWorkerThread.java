package lesson150525.concurrency;

import utils.Utils;

public class UseWorkerThread {
	
	static class Task implements Runnable {

		@Override
		public void run() {
			System.out.println("start");
			Utils.pause(3000);
			System.out.println("finish");
		}
		
	}
	
	public static void main(final String[] args) {
		
		WorkerThread worker = new WorkerThread();
		
		worker.execute(new Task());
		worker.execute(new Task());
		worker.execute(new Task());
		
		
	}
	
}
