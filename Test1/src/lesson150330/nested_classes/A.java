package lesson150330.nested_classes;

public class A {

	static class S {	//static
		
	}
	
	class I {	//Inner
		
	}
	
	public void method(){
		class L {	//local
			
		}
	}
	
	public void method2(){
		
		Runnable task = new Runnable() {	//anonymous
			
			@Override
			public void run() {
				//do something
			}
		};
		
	}
	
	
}
