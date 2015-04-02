package lesson150317.other;

import lesson150317.Singletone;

public class UseSingletone {
	public static void main(final String[] args) {
		
		System.out.println("start");
		Singletone singletone;
		
		singletone = Singletone.get(); //обращение к классу
		
		System.out.println("finish");
	}
}
