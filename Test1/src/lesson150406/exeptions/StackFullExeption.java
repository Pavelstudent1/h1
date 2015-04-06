package lesson150406.exeptions;

//собственная реализация исключительной ситуации
public class StackFullExeption extends Exception{

	public StackFullExeption(final String string) {
		super(string);
	}
	
}
