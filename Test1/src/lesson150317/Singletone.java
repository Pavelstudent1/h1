package lesson150317;

public class Singletone {
	
//	final public static Singletone instance = new Singletone();
	private static Singletone instance = new Singletone();
	
	private Singletone(){
		System.out.println("Created new instance");
	}
	
	public static Singletone get(){
		return instance;
	}
	
	public static Singletone instance(){
		return instance;
	}
	
	public static Singletone singletone(){
		return instance;
	}
	
	
}
