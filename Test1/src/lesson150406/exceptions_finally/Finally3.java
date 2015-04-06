package lesson150406.exceptions_finally;

public class Finally3 {
	
	public static void main(final String[] args) {
		
		
		try {
			a();
		} catch (Exception e) {
			e.printStackTrace();
			e.getCause().getMessage();
		}
		
		
	}

	private static void a() throws Exception {
		
		//open something
		System.out.println("open resource");
		try{
			//do something
			b();
			System.out.println("after b");
		} catch (Exception e){
			System.out.println("catch exception " + e.getMessage());
			//process exception
			throw new Exception(e); //конструктор, принимающий исключительную ситуацию, выброшенный
									//выше для разрешения проблемы
		} finally {			
			System.out.println("close resource");
		}
		//close ??? - will not be executed !!!
	}

	private static void b() {
		throw new RuntimeException("trouble");
	}
	
}
