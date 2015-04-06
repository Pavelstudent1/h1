package lesson150406.exceptions_finally;

public class FinallyExample2 {
	
	public static void main(final String[] args) {
		
		System.out.println("start");
		
		try{
			a();
			//will not executed
		}catch (Exception e){
			System.out.println(e.getMessage());
		}finally{									//сработает всегда
			System.out.println("finally");
		}
		
		System.out.println("finish");
	}

	private static void a() {
		throw new RuntimeException("problem 1");
	}
}
