package lesson150525.concurrency;

import java.util.concurrent.Executor;

public class MyWorker implements Executor{
	
	MyBlockingQueue<Runnable> queue = new MyBlockingQueue<Runnable>();
	
	public MyWorker() {
	
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					queue.remove().run();
				}
			}
		}).start();
	}

	@Override
	public void execute(final Runnable command) {
		queue.add(command);
	}
	
	
	
	
}
