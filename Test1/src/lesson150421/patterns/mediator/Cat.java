package lesson150421.patterns.mediator;

public class Cat {
	
	private Dog dog;
	
	public void setDog(final Dog dog) {
		this.dog = dog;
	}


	public void setParrot(final Parrot parrot) {
		this.parrot = parrot;
	}


	private Parrot parrot;
	
	
	public void play(){
		dog.biteEar();
		parrot.catchHim();
	}


	public void flyAway() {
		// TODO Auto-generated method stub
		
	}
}
