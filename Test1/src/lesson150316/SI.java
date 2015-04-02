package lesson150316;

public class SI {
	
	public void changeState(){
		
	}
	
	static{
		System.out.println("init 1");
	}

	static int x;
	
	static{ //статический инициализатор, срабатывает ТОЛЬКО
			//при первом обращении к классу
		x = 10;
		
		System.out.println("satic init 2: " + x);
	}

	static void test()
	{
		System.out.println("this is test");
	}
	
	static{
		System.out.println("init 3");
	}
	
	public SI() {
		
	}
}
