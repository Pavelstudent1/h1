package lesson150331.nested.localvar;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


//использование локальной переменной в анонимном классе
public class LocalVarExample {
	
	public static void main(final String[] args) {
		
//		if (args.length == 0){
//			System.out.println("Usage: give name as first parameter");
//			System.exit(0);
//		}
		
		System.out.print("Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor(); //сервис по запуску задач, которые запускаются в определённое время
		
		service.schedule(new Runnable() {
			
			//String name <- эта переменная примет значение name выше в МОМЕНТ создания объекта new Runnable() !!!
			
			
			@Override
			public void run() {
				System.out.println("Hello! " + name);
			}
		}, 3, TimeUnit.SECONDS);
		
		//name = new String("War"); //то, что вызовет ошибку: НЕ СТОИТ ПОЛАГАТЬ, что в runnable() передастся name ==  War, 
		//т.к. задача выполниться с задержкой 3 сек.
		
		
		
		
	}
	
	
}
