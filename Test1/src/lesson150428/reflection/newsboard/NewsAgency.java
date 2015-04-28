package lesson150428.reflection.newsboard;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class NewsAgency {
	
	private static List<NewsMaker> newsMakers = new ArrayList<>();
	private static Queue<String> newsMakerNames = new ArrayDeque<String>();
	
	public static void main(final String[] args) {
		
//		newsMakerNames.add("Zhirinovsky");
//		newsMakerNames.add("Kiselev");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				Scanner scanner = new Scanner(System.in);
				while(scanner.hasNextLine()){
					String newsMakerName = scanner.nextLine();
					newsMakerNames.add(newsMakerName);
				}
				scanner.close();
			}
		}).start();
		
		while(true){
			System.out.println("------");
			refreshNewsMakerList();
			publishNews();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static void refreshNewsMakerList() {
		while(!newsMakerNames.isEmpty()){
			String name = newsMakerNames.remove();
			name = NewsAgency.class.getPackage().getName() + "." + name; //получение полного имени класса
			try {
				Class<?> newsMakerClass = Class.forName(name); //? - говорит, что класс точно параметризован, но чем - не известно. Это НЕ RAW !
				try{
					NewsMaker newsMaker = (NewsMaker) newsMakerClass.newInstance();
					newsMakers.add(newsMaker);
				}catch(InstantiationException | IllegalAccessException | ClassCastException e){
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	private static void publishNews() {
		for (NewsMaker newsMaker : newsMakers ) {
			String news = newsMaker.getFreshNews();
			System.out.println(newsMaker + " says: " + news);
		}
	}
	
}
