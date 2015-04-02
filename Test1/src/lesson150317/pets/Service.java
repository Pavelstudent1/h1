package lesson150317.pets;

public class Service {
	
	public static void main(final String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Squirrel squirrel = new Squirrel();
		Parrot parrot = new Parrot();
		Hamster hamster = new Hamster();
		Canary canary = new Canary();
		
		Object o = cat;
		Pet pet = cat;
		Friend friend = cat;
		Cat cat2 = cat;
		
		
		cat.walk();
		friend.walk();
		((Cat) o).walk(); //нисходящее преобразование типов
		((Friend) pet).walk();
		System.out.println();
		
//		o = new Object();
//		((Cat) o).walk();
		
		
		serve(cat);	// Pet pet = cat;
		serve(dog); // Pet pet = dog;
		serve(squirrel); // Pet pet = squirrel;
		serve(parrot); // Pet pet = parrot;
		serve(hamster); // Pet pet = hamster;
		serve(canary); // Pet pet = canary;
		
		
	}
	
	//Liskov Substitution principle
	private static void serve(final Pet pet) { //восходящее преобразование типов
		pet.stroke();
		pet.feed();
		pet.wash();
		pet.brash();
		System.out.println();
	}
	
	
}
