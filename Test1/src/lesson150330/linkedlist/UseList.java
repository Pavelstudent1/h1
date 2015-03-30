package lesson150330.linkedlist;

import java.util.Iterator;

public class UseList {
	public static void main(final String[] args) {
		
		LinkedList list = new LinkedList();
		list.print();
		
		list.add("one");
		list.add("two");
		list.add("three");
//		list.print();
		
		for (Object item : list) {
			System.out.println(item);
		}
		
		Iterator it = list.iterator();
		
		System.out.println("---before");
		while(it.hasNext()){
			Object item = it.next();
			//do something with item
			System.out.println(item);
		}
		System.out.println("---after");
		
	}
}
