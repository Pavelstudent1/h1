package lesson150406.exceptions_finally;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FinallyExamples {
	
	public static void main(final String[] args) {
		
		Lock lock = new ReentrantLock();	//mutex
		lock.lock();
		try{
			doSomething();
		} finally {				//выполняется в любом случае, даже если нет обработчика
			lock.unlock();
			System.out.println("unlocked");
		}
		System.out.println("finish");
		
		
	}

	private static void doSomething() {
		throw new RuntimeException();
	}
	
}

//в консоль выведется unlock + информацию из stackTrace, т.к.:
//1) произведётся заход в doSomething
//2) в doSomething происходит генерация исключения
//3) происходит возврат в точку вызова doSomething
//4) происходит обработка того, что в finally !!!!
//5) т.к. обработчика для исключения нет, будет выход из main
