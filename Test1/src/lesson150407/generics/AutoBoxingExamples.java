package lesson150407.generics;

public class AutoBoxingExamples {
	
	public static void main(final String[] args) {
		
		int a = new Integer(10);			//эквивалентны
		int b = new Integer(10).intValue();	//
		
		Integer c = 20;					//эквивалентны
		Integer d = new Integer(20);	//
		
		//Обёртки, как и String, являются immutable, т.е. изменить их нельзя
		//В простых случаях, автоупаковка полезна, но порой приводит к странностям
		
	}
	
	static int calc(){	
		return new Integer(30);
	}
	
	static Integer calc2(){
		return 20;
	}
	
}
