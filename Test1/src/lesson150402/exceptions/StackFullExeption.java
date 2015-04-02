package lesson150402.exceptions;

//собственная реализация исключительной ситуации
public class StackFullExeption extends Exception{

	public StackFullExeption(final String string) {
		super(string);
	}
	
}
