package lesson150406.exeptions;

import java.util.Scanner;

public class AutoCloseableExample {
	
	
	static class MyResource implements AutoCloseable{
		{
			System.out.println("created my process");
		}
		
		public void process(){
			System.out.println("processing");
		}
		
		@Override
		public void close() {	//хоть метод и реализует метод интерфейса, но выброс исключения можно убрать(или изменить), т.к. throws не входит в сигнатуру метода
								//сигнатура метода = имя класса + набор параметров
			System.out.println("closed my process");
		}
		
	}
	
	public static void main(final String[] args) {
		
		try(MyResource r = new MyResource()){
			r.process();
		}
		
//		try(Scanner scanner = new Scanner(System.in)) {		//автозакрывающийся код для AutoCloseable !
//			String line = scanner.nextLine();
//			System.out.println(line);
//		}
		
		//эквивалент верхнему
		Scanner scanner = new Scanner(System.in);
		try{			
			String line = scanner.nextLine();
			System.out.println(line);
		}finally{
			scanner.close();
		}
		
		
		try(Scanner s1 = new Scanner(System.in) ; Scanner s2 = new Scanner(System.in)) { //автозакрытие нескольких потоков, с интерфейсов AutoCloseable !
			//s1 и s2 существуют только внутри блока try!z
		}
		
	}
	
}
