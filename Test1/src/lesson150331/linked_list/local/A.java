package lesson150331.linked_list.local;

import lesson150326.interfaces.Cleanable;

public class A {
	
	public Cleanable[] doSomething(){
		
		//массив Cleanable
		return new Cleanable[] {new Cleanable() {	//первый экземпляр анонимного класса
			
			@Override
			public void clean() {
				System.out.println("cleaning Alien");
			}
		},
		new Cleanable() {	//второй экземпляр анонимного класса
			
			@Override
			public void clean() {
				System.out.println("cleaning Predator");
			}
		},
		new Cleanable() {
			
			@Override
			public void clean() {
				System.out.println("cleaning Terminator");
			}
		}
		};	
	}
	
}
