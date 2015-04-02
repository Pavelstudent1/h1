package lesson150323.inheritance.restriction;

public class B extends A {

	@Override
	protected void one() {
		
		super.one();
	}
	
	@Override
	public void two() {
		// TODO Auto-generated method stub
		super.two();
	}
	
	@Override
	public void three() {
		throw new UnsupportedOperationException("this operation is prohibited");
	}

	
	
}
