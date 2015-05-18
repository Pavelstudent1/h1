package lesson150518.concurrency;

public class RaceCondition {
	
	static class Counter{
		int count;
		
		synchronized public int inc(){ //critical section - т.е. над этим кодом может работать
			System.out.println(count); //ТОЛЬКО один поток, все идущие за ним ждут
			return ++count;
		}
	}
	
	
	public static void main(final String[] args) {
		
		final Counter cnt = new Counter();
		
		Runnable task = new Runnable(){

			@Override
			public void run() {
				
				while(true){
					int r = cnt.inc();
//					System.out.println(r); //т.к. r - локальная переменная, у каждого потока она своя,
										   //поэтому, относительно println, это разные переменные
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		
		
	}
	
}
