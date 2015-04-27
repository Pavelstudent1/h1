package lesson150427.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCollections {
	public static void main(final String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		
		broadcast(Collections.unmodifiableList(list), "Hello"); //обёртка Collections.unmodifiableList(list)
																//защищает передаваемый список от модификаций
																//(в данном случае используется паттерн Декоратор)
		
		
		
		
	}

	private static void broadcast(final List<String> list, final String message) {
		for (String userName : list) {
			System.out.println(userName + " > " + message);
		}
		
		list.add("Drakula");	//возможные 
		list.clear();			//зловредные действия над списком
	}

	private List<String> list;
	
	/**
	 * 
	 * @return unmodifiable list
	 */
	public List<String> getUserList(){
		return Collections.unmodifiableList(list);
	}
}
