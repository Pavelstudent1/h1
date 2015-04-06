package lesson150406.exeptions;

public class Stack {
	
	Object[] items;
	int tos;	//top of stack - верхний элемент стека
	
	public Stack(final int capacity){
		items = new Object[capacity];
		tos = -1;
	}
	
	
	public void push(final Object item) throws StackFullExeption {
		if (tos == items.length - 1) {	//проверка tos на предел массива
//			throw new RuntimeException("stack overflow");
			throw new StackFullExeption("tos is " + tos);
		}
			items[++tos] = item;
	}
	
	public Object pop() throws StackEmptyException {
		if (isEmpty()){
			throw new StackEmptyException("tos is " + tos);
		}
		return items[tos--];
	}
	
	public Object top() {
		return items[tos];
	}
	
	public boolean isEmpty(){
		return -1 == tos; //более правильный аналог сравнения tos == -1, чтобы не было
	}					  //разночтений
	
}
