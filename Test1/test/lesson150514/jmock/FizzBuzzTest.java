package lesson150514.jmock;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{1, "1"},
				{4, "4"},
				{3, "fizz"},
				{6, "fizz"},
				{5, "buzz"},
				{10, "buzz"},
				{15, "fizzbuzz"},
				{25, "buzz"},
				{26, "26"},
		});
	}
	private int input;
	private String output;
	
	public FizzBuzzTest(final int input, final String output){
		this.input = input;
		this.output = output;
	}
	@Test
	public void test() {
		assertEquals(output, FizzBuzz.check(input));
	}

}
