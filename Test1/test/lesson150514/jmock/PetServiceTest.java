package lesson150514.jmock;

import org.jmock.Expectations;
import org.jmock.Sequence;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

//@RunWith(JMock.class) //устаревший вид записи
public class PetServiceTest {
	
	@Rule public JUnitRuleMockery context = new JUnitRuleMockery();
//	Mockery context = new JUnitRuleMockery(); //устаревший вид записи
	
	
	@Test
	public void test() {
		
		final Pet pet = context.mock(Pet.class);
		final Sequence petCareSequence = context.sequence("petcare"); //задание парядка вызовов методов
		
		context.checking(new Expectations(){{
			//желаемый порядок вызовов методов pet
			oneOf(pet).stroke(); inSequence(petCareSequence);
			oneOf(pet).feed();	inSequence(petCareSequence);
			oneOf(pet).wash();	inSequence(petCareSequence);
			oneOf(pet).walk();	inSequence(petCareSequence);
		}});
		
		PetService service = new PetService();
		
		service.serve(pet);
	}

}
