package lesson150312;

public class Init {
	
	int i = 10;
	
	{
		System.out.println("constructor start " + i);
		i = 20;
		System.out.println("constructor end " + i);

	}
	
	public Init(){
		System.out.println("constructor start " + i);
		i = 30;
		System.out.println("constructor end " + i);
	}
		

	
	
	
	public static void main(String[] args) {
				
		Init init = new Init();
		
		System.out.println(init.i);
		
	}
	
	{
		System.out.println("another init");
		i = 50;
	}
	
}
