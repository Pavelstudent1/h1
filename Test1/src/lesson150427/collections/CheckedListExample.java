package lesson150427.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedListExample {

		public static void main(final String[] args) {
			
			List<String> list = new ArrayList<>();
			
			list.add("Hello");
			
			evil(Collections.checkedList(list, String.class)); //обертка разрешает операции лишь с выбранным типом
															   //В данном случае, с string
			
			System.out.println(list);
			
		}

		private static void evil(final List<String> list) {
			List list2 = list;	//пока список не сделан обёрточным, операции идущие далее допустимы, т.к. сейчас List - RAW-type
			list2.add(10);		
			list2.add(new Object());
		}
}
