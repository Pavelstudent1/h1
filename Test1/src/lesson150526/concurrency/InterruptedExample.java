package lesson150526.concurrency;

import utils.Utils;

//каждый поток можно попросить прерваться
public class InterruptedExample {
	
	static class Task implements Runnable {

//		volatile boolean stopped = false;

		@Override
		public void run() {
			long count = 0;
			
			while(!Thread.interrupted()){ //Thread.interrupted(), возвращая true, снимает флажок о том, что поток прерван
				count++;				  //Также, данный метод, по сравнению с запросом volatile-переменной, довольно медленный
			}
			System.out.println("count = " + count);
		}
		
//		public void stop(){
//			stopped = true;
//		}
		
	}
	
	public static void main(final String[] args) {
		
		System.out.println("start");
		
		Task task = new Task();
		Thread thread = new Thread(task);
		
		thread.start();
		
		Utils.pause(5000);
		
//		task.stop();	//обычный случай
		thread.interrupt(); //interrupt посылает потоку как бы флаг, что ему нужно прерваться
		
		System.out.println("finish");
		
	}
}
