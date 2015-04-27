package lesson150427.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapsExamples {
	
	public static void main(final String[] args) {
		
//		Map<String, String> addresses = new HashMap<String, String>();
		Map<String, String> addresses = new LinkedHashMap<String, String>();
		
		addresses.put("Petrov", "Moskov");
		addresses.put("Sidorov", "St.Pete");
		addresses.put("Ivanov", "Saratov");
		addresses.put("Petrova", "New-York");
		addresses.put("Zhdanova", "Vladivostok");
		addresses.put("Petrov", "Novosibirsk"); //переписывает значение по ключу Petrov
		
		System.out.println(addresses.get("Petrova"));
		
		for (Map.Entry<String, String> addressEntry : addresses.entrySet()) {
			System.out.println("key " + addressEntry.getKey());
			System.out.println("value " + addressEntry.getValue());
			
			for (String surname : addresses.keySet()) { //здесь Множество(Set) говорит, что все ключи уникальны
				System.out.println(surname);
			}
			
			System.out.println(addresses.values());
		}
		
	}
}
