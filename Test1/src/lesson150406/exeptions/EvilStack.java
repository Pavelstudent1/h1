package lesson150406.exeptions;

public class EvilStack extends Stack{

	public EvilStack(final int capacity) {
		super(capacity);
	}
	
	
	@Override
	public void push(final Object item){	//подавление родительского поведения
		System.out.println("ha ha ha");
		try {								//игнорим исключения
			super.push(item);
		} catch (StackFullExeption e) {
		}
	}
	
	@Override
	public Object pop(){	//подавление родительского поведения
		try {
			return super.pop();
		} catch (StackEmptyException e) {	//игнорим исключения
			return null;
		}
	}

}
