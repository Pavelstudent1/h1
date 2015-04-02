package lesson150326.interfaces;

public class B {
	
	//композиция
	Changeable a;
	
	void setWorker(final Changeable a){
		this.a = a;
	}
	
	void use(){
		a.change();
	}
}
