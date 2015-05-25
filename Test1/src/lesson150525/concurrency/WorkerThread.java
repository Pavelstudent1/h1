package lesson150525.concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;


//тип паттерна для многопоточности
public class WorkerThread implements Executor{
	
	private Queue<Runnable> _taskQueue = new LinkedList<>();

	public WorkerThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					Runnable task;
					synchronized (_taskQueue) {
						while (_taskQueue.isEmpty()){ //выход тогда, когда _taskQueue железно НЕ пуст
							try {
								_taskQueue.wait(); //здесь wait() тормозит весь поток WorkerThread,
												   //а _taskQueue лишь флажок для выбора действий
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						task = _taskQueue.remove();
					}
					task.run();
				}
			}
		}, "Worker").start();
	}
	
	
	@Override
	public void execute(final Runnable task){
		synchronized (_taskQueue) {
			_taskQueue.add(task);
			_taskQueue.notifyAll();
		}
	}
	
}
