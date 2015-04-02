package lesson150316;

public class DatabaseConnection { //драйвер соединения с БД
	
	private final static int MAX_CONNECTIONS = 3;
	private static int Counter;
	
	
	//если количество объектов контроллируется, то это синглтон
	public static DatabaseConnection create(){
		if (Counter >= 3) {
			return null;
		}
		return new DatabaseConnection();
	}
	
	
	{
		Counter++;
	}
	
	private DatabaseConnection(){
		
	}

	static public void freeAny(){
		Counter--;
	}
	
	public void free(){
		Counter--;
	}
	
}
