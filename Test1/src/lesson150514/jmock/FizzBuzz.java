package lesson150514.jmock;

public class FizzBuzz {
	
	public static String check(final int number){
		
		String s = "";
		
		if (number % 3 == 0){
			s += "fizz";
		}
		if (number % 5 == 0){
			s += "buzz";
		}
		
		return s.length() == 0 ? String.valueOf(number) : s;
	}
	
}
