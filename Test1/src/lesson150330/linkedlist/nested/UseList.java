package lesson150330.linkedlist.nested;


public class UseList {
	public static void main(final String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add(1);
		list.add(new Object());
		
		for (Object item : list) {
			System.out.println(item);
		}
		
		
	}
}
