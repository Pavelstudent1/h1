package lesson150421.patterns.mediator;

public class Parrot {
	
	private Dog dog;
	public void setDog(final Dog dog) {
		this.dog = dog;
	}

	public void setCat(final Cat cat) {
		this.cat = cat;
	}

	private Cat cat;


	public void catchHim() {
		
	}
	
	public void play(){
		dog.дразнит();
		cat.flyAway();
	}

}
