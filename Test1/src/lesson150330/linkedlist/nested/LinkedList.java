package lesson150330.linkedlist.nested;

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
	
	
	private static class ListIterator implements Iterator {
		
		private LinkedList _linkedList;
		private Node tmp;
		
		public ListIterator(final LinkedList linkedList) {
			_linkedList = linkedList;
			tmp = _linkedList.first;
		}

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
		return new ListIterator(this);
	}
	
	
	
	
	
}
