package lesson150323.inheritance.restriction;

import java.util.ArrayDeque;

public class MyStack extends ArrayDeque{
	
	
	@Override
	public void addFirst(final Object e) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Object removeFirst() {
		throw new UnsupportedOperationException();
	}
	
	
}
