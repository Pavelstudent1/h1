package lesson150525.concurrency;

import java.util.LinkedList;
import java.util.Queue;

//блокирующая очередь
public class MyBlockingQueue<T> {
	
	Queue<T> queue = new LinkedList<>();
	
	public void add(final T item){
		
		synchronized (queue) {
			queue.add(item);
			queue.notifyAll();
		}
		
	}
	
	public T remove(){
		
		synchronized (queue) {
			while(queue.isEmpty()){
				try {
					queue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		return queue.remove();
	}
	
}
