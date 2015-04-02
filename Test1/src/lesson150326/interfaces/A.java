package lesson150326.interfaces;

public class A implements Changeable{

	int state;
	
	@Override
	public void change(){
		state++;
	}
	
}
