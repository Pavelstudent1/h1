package lesson150316;

public class S {
	
	public static int Counter; //class member
	
	{ //инициализатор экземпляра
		Counter++;
	}
	
	
	public S() {
//		Counter++; //BAD style
	}
	
	public S(final int c){
		counter = c;
	}
	
	public int counter; //instance(= экземпляр) member
	
	
	
}
