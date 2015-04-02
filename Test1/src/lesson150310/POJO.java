package lesson150310;

public class POJO {	//Plain Old Java Object, зачастую immutable
	//Java Bean
	//with property 'index'

//	final int i;	//only when immutable
	int i;
	
	public POJO(int i) {
		this.i = i;
	}
	
	public void setIndex(int i){ //only when mutable
		this.i = i;
	}
	
	public int getIndex(){
		return i;
	}
	
	
}
