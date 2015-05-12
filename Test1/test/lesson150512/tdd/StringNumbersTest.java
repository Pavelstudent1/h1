package lesson150512.tdd;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) //1-й шаг к параметризованному тесту
public class StringNumbersTest {
	
	private int input;
	private String output;
	
	@Parameters
	public static Collection<Object[]> data(){ 	//2-й шаг
		return Arrays.asList(new Object[][] {
				{1, "один"},
				{2, "два"},
				{3, "три"},
				{21, "двадцать один"}
		}
		);
	}
	
	public StringNumbersTest(final int input, final String output) {	//3-й шаг
		this.input = input;
		this.output = output;
	}


	@Test
	public void test() {
		assertEquals(output, StringNumbers.toString(input));
	}

}
