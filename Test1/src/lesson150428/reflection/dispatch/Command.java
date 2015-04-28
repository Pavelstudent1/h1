package lesson150428.reflection.dispatch;

public class Command {
	
	public static class Plus extends Command{
		
	}
	
	public static class Minus extends Command{
		
	}
	
	public static class Clear extends Command{
		
	}
	
	public static class Get extends Command{
		
	}
	
	
	
	public static final int NONE = -1;
	public static final int PLUS = 0;
	public static final int MINUS = 1;
	public static final int CLEAR = 2;
	public static final int GET = 3;
	
	int id = NONE;
	
	public Command() {
		this(NONE);
	}
	
	public Command(final int id){
		this.id = id;
	}
	
	public int getID(){
		return id;
	}
	
}
