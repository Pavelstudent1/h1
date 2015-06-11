package lesson150611.network;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Chat implements Runnable {

	List<ChatClientHandler> _clients = new LinkedList<>();
	
	//решение медленного клиента - использование блокирующей очереди, куда скидываются ВСЕ сообщения от всех клиентов
	BlockingQueue<String> _messages = new LinkedBlockingQueue<>();
	
	
	public void addClient(final ChatClientHandler handler){
		_clients.add(handler);
	}
	
	public void removeClient(final ChatClientHandler handler){
		_clients.remove(handler);
	}
	
	
	public void broadcast(final String message){
		
		try {
			_messages.put(message);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public void run() {
		while(true){
			try {
				String message = _messages.take();
				for (ChatClientHandler chatClientHandler : _clients) {
					chatClientHandler.send(message);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
