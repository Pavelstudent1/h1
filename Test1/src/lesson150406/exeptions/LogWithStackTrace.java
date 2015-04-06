package lesson150406.exeptions;

public class LogWithStackTrace {
	
	//log library: log4j - логгер для жабы
	
	public static void log(final String message){
		Exception e = new Exception();
		System.out.println(e.getStackTrace()[1].getMethodName() + ": " + message); //stackTrace[] - указывает метод из которого был вызван Exception. 
																				   //0-й элемент(наивысшая позиция) - место, где Exception был создан
	}
	
	public static void main(final String[] args) {
		
		log("message1");
		
		a();
		
		b();
	}

	private static void b() {
		log("there");
	}

	private static void a() {
		log("here");
	}
	
}
