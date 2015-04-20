package lesson150420.patterns.command;

public class Calculator {
	
	abstract class Command {
		
		public void execute() {
			realExecute();
			System.out.println(total);
		}
		
		abstract void realExecute();
	}
	
	public class Plus extends Command {
		
		int _value;
		
		public Plus(final int value) {
			_value = value;
		}
		@Override
		void realExecute() {
			total += _value;
		}
	}
		
		public class Minus extends Plus{ //наследование-вариация
			public Minus(final int value) {
				super(-value);
			}
		}
		
		public class Clear extends Command {

			@Override
			void realExecute() {
				total = 0;
			}
		}
		
		public class Get extends Command {

			@Override
			void realExecute() {
				//do nothing
			}
		}
		
	
	int total = 0;
	
}
