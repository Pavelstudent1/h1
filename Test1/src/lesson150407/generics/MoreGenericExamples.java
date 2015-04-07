package lesson150407.generics;

import lesson150326.interfaces.Cat;
import lesson150326.interfaces.Cleanable;

public class MoreGenericExamples {
	
	static class Bag<T>{
		
		T box;
		
		public void store(final T item){
			box = item;
		}
		
		public T get(){
			return box;
		}
		
		
		static class CleaningBag<T extends Cleanable>{ //параметризованный тип может наследовать интерфейс
			
			T box;
			
			public void store(final T item){
				box = item;
				box.clean();
			}
			
			public T get(){
				return box;
			}
		}
		
		public static void main(final String[] args) {
			
			Bag<String> bag = new Bag<>(); //не указывание в <> какого-либо типа, делает его RAW, 
										   //который равнозначен использованию типа Object
			
			bag.store("hello");
			
//			bag.store(10);	//ERROR!
			
			System.out.println(bag.get());
			
			
			CleaningBag<Cat> catsTrap = new CleaningBag<>();
			catsTrap.store(new Cat());
			
			CleaningBag<Cleanable> universalMagicBag = new CleaningBag<>();
//			CleaningBag<String> cleaningStringBag; //ОШИБКА! Класс CleaningBag принимает любой параметр типа Cleanable, а String в него не входит,
												   //т.е. создали ограничение на тип параметра 
			
			
		}
	}
}
