package lesson150514.jmock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TermometerTest {
	
	private Termometer term;
	
	@Before
	public void setup(){
		term = new Termometer();
	}
	
	
	@Test
	public void createTermometer() {
		assertEquals(0, term.currentTemperature);
	}
	
	@Test
	public void inc() throws Exception {
		term.inc();
		assertEquals(1, term.currentTemperature);
	}
	
	@Test
	public void dec() throws Exception {
		term.inc();
		term.dec();
		assertEquals(0,  term.currentTemperature);
	}
	
	
	
	
	
}
