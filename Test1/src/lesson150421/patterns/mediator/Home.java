package lesson150421.patterns.mediator;

public class Home {

	public static void main(final String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Parrot parrot = new Parrot();
		
		cat.setDog(dog);
		cat.setParrot(parrot);
		
		dog.setCat(cat);
		dog.setParrot(parrot);
		
		parrot.setCat(cat);
		parrot.setDog(dog);
		
		
	}
		
}
