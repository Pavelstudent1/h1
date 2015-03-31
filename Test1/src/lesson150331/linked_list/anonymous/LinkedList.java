package lesson150331.linked_list.anonymous;

import java.util.Iterator;

public class LinkedList implements Iterable {
	
	private static class Node {
		
		Object item;
		Node next;
		
		public Node(final Object item, final Node next) {
			this.item = item;
			this.next = next;
		}
	}

	
	
	Node first, last;
	
	public void add(final Object item) {
		
		Node fresh = new Node(item, null);
		
		if (first == null){	//быстрая реализация
			first = fresh;
			last = fresh;
		}
		else{
			last.next = fresh;
			last = fresh;
		}
		
	}


	@Override
	public Iterator iterator() {
		return new Iterator(){
			
//			private Node tmp = LinkedList.this.first;
			private Node tmp = first;
			
			@Override
			public boolean hasNext() {
				return tmp != null;
			}

			@Override
			public Object next() {
				Object item = tmp.item;
				tmp = tmp.next;
				return item;
			}
			
		};
	}
	
	
	
	
	
}
