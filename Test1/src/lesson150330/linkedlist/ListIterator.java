package lesson150330.linkedlist;

import java.util.Iterator;

public class ListIterator implements Iterator {
	
	
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
