package lesson150323.instanceof_example;

import lesson150317.pets.Cat;
import lesson150317.pets.Dog;
import lesson150317.pets.Friend;
import lesson150317.pets.Hamster;
import lesson150317.pets.Parrot;
import lesson150317.pets.Pet;

public class UsePets {

	public static void main(final String[] args) {
		
		Object[] objects = {10, "Hello", new Cat(), new Dog(), new Hamster(), new Parrot()};
		
		walkWith(objects);
		
	}

	private static void walkWith(final Object[] objects) {
		
		for (Object o : objects) {
			if (o instanceof Friend){ //проверка объекта на принадлежность к какому-либо типу
				((Friend) o).walk();
			}
			if (o instanceof Pet){
				((Pet)o).wash();
			}
		}
		
	}
	
}
