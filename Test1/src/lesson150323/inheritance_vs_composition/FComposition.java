package lesson150323.inheritance_vs_composition;

public class FComposition {

	F f;
	
	public FComposition(final F f) {
		this.f = f;
	}
	
	public void methodA(){
		f.m1();
		//something else
	}
	
	public void methodB(){
		f.m2();
		//something else
	}
	
	public void methodC(){
		f.m3();
		//something else
	}
	
	public void methodD(){
		f.m4();
		//something else
	}	
	
}
