package lesson150316;

public class StaticInit {
	
		public static void main(final String[] args) {
			
			SI si; //объявление обращением НЕ является!
			
			System.out.println("start");
			
//			new SI(); //это обращение к классу...
			
//			System.out.println(SI.x); //и это...
			
			SI.test();	//и даже это!
			
		}
	
	
}
