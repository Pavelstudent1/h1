package lesson150519.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
	
	static class Counter{
		
		volatile long count; //volatile для long и double, делает их изменение атомарным. И не только. 
		Lock lock = new ReentrantLock();
		
		public void inc(){
			lock.lock();	//критическая секция посредством ReentrantLock()
			try{
				count++;				
			}finally{
				lock.unlock();
			}
		}
		
		public long get(){ //как оказывается, long НЕ атомарная операция (т.е. изменяется в несколько заходов), в отличие от int
			return count;
		}
		
		
	}
	
	
}
