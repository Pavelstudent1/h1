package lesson150514.jmock;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class TermometerListenerMockTest {
	
	@Rule public JUnitRuleMockery context = new JUnitRuleMockery();
	
	
	
	@Test
	public void test() {
		final TermometerListener tl = context.mock(TermometerListener.class); //возвращает объект, работающий как
																		//TermometerListener.class
		
		context.checking(new Expectations() { //анонимный класс с инициализатором экземпляра
			{
			//oneOf - вызов конкретного метода ОДИН раз
			//allowing - вызов много раз или ни одного раза
			//atLeast(N) - вызов метода как минимум N раз
//				oneOf(tl).changed(with(any(Integer.class))); //вызов с параметром в виде любого целого числа
//				allowing(tl).changed(with(any(Integer.class)));
				atLeast(1).of(tl).changed(with(any(Integer.class)));
			}
		});
		
		Termometer t = new Termometer();
		t.setListener(tl);
		
		t.inc();
		t.inc();
	}

}
