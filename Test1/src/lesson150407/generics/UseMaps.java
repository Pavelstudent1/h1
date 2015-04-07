package lesson150407.generics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UseMaps {
	
	public static void main(final String[] args) {
		
		Map<String, String> phones = new HashMap<>(); //Map - интерфейс, который наследует
													  //HashMap, поэтому phones можно
													  //присвоить объект класса HashMap
		
		phones.put("Ivanov", "+7 123 456-78-90"); //ассоциируем имя Petrov с данными о телефоне
		phones.put("Petrov", "+7 123 456-78-91");
		phones.put("Sidorov", "+7 123 456-78-92");
		
		System.out.println(phones.get("Petrov"));
		
		Map<Integer, List<String>> groups = new HashMap<>();
		
		groups.put(120, new LinkedList<String>() {	//анонимный класс
			{	//инициализатор экземпляра
				add("Ivanov");
				add("Petrov");
				add("Sidorov");
			}
		});
		//такой приём называется DoubleBraces - создаём класс и сразу его инициализируем
		
		
		groups.put(200, new LinkedList<String>() {	//auto-boxing int to Integer - это аналог Integer(200)
			{
				add("Ivanov");
				add("Petrov");
				add("Sidorov");
			}
		});
		
		groups.put(new Integer(200), Arrays.asList("Peters", "Jobs", "Scully"));
		
		Arrays.asList(10,20,30);
		
		
		System.out.println(groups.get(200));
		
	}
}
