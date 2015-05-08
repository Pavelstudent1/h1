package lesson150430.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ATest { // TDD - Test Driven Development

	{
		System.out.println("initializer");
	}
	
	A a = new A();
	
//	@Before
//	public  void setup(){
//		System.out.println("setup");
//		a = new A();
//	}
	
	@Test	//перед вызовом каждого теста, каждый раз создаётся экземпляр класса ATest
	public void createObject() {
		assertEquals(0, a.state);

	}
	
	@Test
	public void changeState() {
		a.change();
		assertEquals(1, a.state);
	}
	
	
	@Test
	public void changeCycling() throws Exception {
		a.change();
		a.change();
		a.change();
		
		assertEquals(0, a.state);
	}
	
	@Test
	public void decrease() throws Exception {
		
		a.dec();
		assertEquals(-1, a.state);
		
	}
	

}
