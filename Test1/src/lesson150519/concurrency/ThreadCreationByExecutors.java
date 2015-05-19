package lesson150519.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import utils.Utils;

public class ThreadCreationByExecutors {
	
	static class Task implements Runnable {
		
		@Override
		public void run() {
			Utils.pause(1000);
			System.out.println(Thread.currentThread().getName() + "------");
		}
		
	}
	
	public static void main(final String[] args) {
		
//		ExecutorService ex = Executors.newSingleThreadExecutor();
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		ex.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello");
			}
		});
		
		Task command = new Task();
		ex.execute(command);
		ex.execute(command);
		ex.execute(command);
		ex.execute(command);
		
		ex.shutdown(); //прекращает работу, когда выполнены ВСЕ переданные в него задачи
		
		System.out.println(Thread.currentThread().getName() + ": finish");
	}
}
