
package lesson150406.exeptions;

public class MultioleExeptions {

	public static class Exception3 extends Exception2 {
		public Exception3(final String string){
			super(string);
		}
	}
	public static class Exception2 extends Exception1 {
		public Exception2(final String string){
			super(string);
		}
	}
	public static class Exception1 extends Exception {
		public Exception1(final String string){
			super(string);
		}
	}
	
	public static void main(final String[] args) {
		System.out.println("start");
//		try {
//			a();
//			System.out.println("after a");
//		} catch (Exeption1 | Exeption2 | Exeption3 e) { //множественная обработка классов Exception, НЕ СВЯЗАННЫХ наследованием!!!
														//Обработается только  метод с(), т.к. вызов идёт с a() -> b() -> c(),
//														//а в с() кидаем исключительнкю ситуацию, что равносильно преждевременному выходу из метода с() в b(),
//														//а в b() оа тоже не решается и бросает в a() и только в a() имеется блок try/catch обрабатывающий ТОЛЬКО
//														//Exeptions1 и всё, больше ничего не выполнится. Далее только syso c "finish"
//			try {
//				a();
//				System.out.println("after a");	//Множественная обработка для исключений, СВЯЗАННЫХ наследованием. Указывается самый общий класс(родитель) + общий блок выполнения
//			} catch (Exeption1 e) {	
//			e.printStackTrace();	//common processing block
		
			try {
				a();	//важно: брошенное исключение, при возврате в предыдущий метод СРАЗУ, во всём теле метода, ищет блок try/catch, игнорируя весь код до него
				
				
				//чтобы здесь ни было, оно проигнорируется
				
				
				System.out.println("after a");
			} catch (Exception3 e) {							//обработка начинается от самых конкретных к общим(от детей к родителям)
				System.out.println("exeption 3 special block");
				System.out.println(e.getMessage());
			}catch(Exception2 e){
				
			}catch (Exception1 e) {
				e.printStackTrace();
			}
		System.out.println("finish");
	}

	private static void a() throws Exception1, Exception2, Exception3 {
			b();
			System.out.println("after b");
			throw new Exception3("ex3");
	}
	private static void b() throws Exception1, Exception2{
			c();
			System.out.println("after c");
			throw new Exception2("ex2");
	}
	
	private static void c() throws Exception1{
//		throw new Exeption1();
//		System.out.println("inside c()");
	}
		
		
	
}
