package lesson150525.concurrency;

import utils.Utils;

public class WaitNotifyExample {
	
	static class Sprinter implements Runnable {

		@Override
		public void run() {
			System.out.println("created " + this);
			
			synchronized (this) {
				try {
					System.out.println("before wait");
					this.wait(); //вызов метода, останавливает текущий объект и освобождает текущий объект и ждёт сигнала продолжения работы
					System.out.println("after wait");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("Started " + this);
		}
		
		
	}
	
	public static void main(final String[] args) {
		
		Sprinter sprinter = new Sprinter();
		
		new Thread(sprinter).start();
		
		Utils.pause(10000);
		
		synchronized (sprinter) { //для использования notify, необходимо захватить объект в монопольное использование
			sprinter.notifyAll();			
			Utils.pause(15000); //удерживаем потоком main объект sprinter, и не даём ему продолжить выполнение после this.wait()
		}
		Utils.pause(15000);
	}
}
