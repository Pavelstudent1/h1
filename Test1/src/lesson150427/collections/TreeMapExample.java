package lesson150427.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(final String[] args) {
		
		NavigableMap<String, String> calls = new TreeMap<>();
		
		calls.put("01:23", "23434");
		calls.put("11:20", "41876");
		calls.put("11:23", "54734");
		calls.put("02:00", "22923");
		calls.put("13:40", "23222");
		calls.put("16:50", "23434");
		calls.put("05:00", "85556");
		
		
		System.out.println(calls.ceilingKey("10:00")); //ближайший ключ из словаря к указанному
		
		System.out.println(calls.headMap("12:00")); //всё, что было до указанного
		System.out.println(calls.tailMap("15:00")); //всё, что после указанного
		
		System.out.println(calls.subMap("02:00", true, "05:00", true)); //всё, что от первого ключа, до второго.
																		// true/true говорят о включении/исключении ключей-границ диапазона
		
		for (String key : calls.keySet()) {	//получение отсортированного набора ключей
			System.out.println(key);
		}
		
		//Сортировка происходит в момент добавления записей
		
		
		
	}
}
