package lesson150317;

public class LazySingletone {
	
	private static LazySingletone instance;
	
	private LazySingletone(){
		
	}
	
	public LazySingletone get(){
		if (instance == null){
			instance = new LazySingletone(); //lazy instantiation
		}
		
		return instance;
	}
}
