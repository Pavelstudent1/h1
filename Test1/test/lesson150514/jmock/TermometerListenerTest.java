package lesson150514.jmock;

import static org.junit.Assert.assertEquals;

import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class TermometerListenerTest {
	
	@Rule public JUnitRuleMockery context = new JUnitRuleMockery();
	
	
	
	@Test
	public void testListener() {
		TermometerListener tl = new TermometerListener() {

			@Override
			public void changed(final int currentTemp) {
				if (currentTemp != 1){
					assertEquals(1, currentTemp);
				}
			}
		};
		Termometer t = new Termometer();
		t.setListener(tl);
		t.inc();
	
	}

}
