package lesson150611.network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;

class ChatClientHandler implements Runnable{
	
	private static Random random = new Random();
	
	
	private Socket _socket;
	private PrintStream _ps;
	private String _name;
	private Chat _chat;

	private int _delay;

	
	private static ExecutorService _sender;

	public ChatClientHandler(final ExecutorService sender, final Chat chat, final Socket socket) { //будет обрабатываться в главном потоке
		_socket = socket;
		_chat = chat;
		_delay = random.nextInt(10000);
		_sender = sender;
	}
	
	@Override
	public void run() { //будет в новом потоке
		
		_chat.addClient(this); //добавление уже в отдельном потоке, лучше )
		
		try {
			_ps = new PrintStream(_socket.getOutputStream()); //создаётся один раз, чтобы было не накладно
			
			_ps.print("Enter your name: ");
			
		} catch (IOException e1) {
			e1.printStackTrace();
			return;
		}
		
		try (Scanner scanner = new Scanner(_socket.getInputStream())) {
			
			_name = scanner.nextLine();
			_ps.println("Wellcome, " + _name + "!");
			
			while(scanner.hasNextLine()){
				process(scanner.nextLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	private void process(final String nextLine) {
		if (nextLine.equals("!bye")){
			try {
				_chat.broadcast(_name + " says bye-bye and leaves chat!");
				_socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		_chat.broadcast(_name + " > " + nextLine);
	}

	public void send(final String message) {
		
		_sender.execute(new Runnable() { //Вторая проблема: если пользователь быстро введёт много сообщений
										 //в процессе "доставки" этих сообщений каждому клиенту, 
										 //наш сервер может перемешать их относительно
										 //их изначальной последовательности
			
			@Override
			public void run() {
				
				try {	//имитация возможного медленного соединения. Итог: скорость рассылки всем клиентам снижается до скорости самого медленного
					Thread.sleep(_delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				_ps.println(message);
				
			}
		});
		
	}
	
}