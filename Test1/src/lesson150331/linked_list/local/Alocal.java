package lesson150331.linked_list.local;

import lesson150326.interfaces.Cleanable;

public class Alocal {
	
	public Cleanable[] getHeroes(){
		
		class PetHero implements Cleanable{		//локальный класс в методе
			
			private String name;
			
			public PetHero(final String name) {
				this.name = name;
			}
			
			
			
			@Override
			public void clean() {
				System.out.println("cleaning " + name);
			}
			
		}
		
		//массив Cleanable
		return new Cleanable[] { new PetHero("Alien"), new PetHero("Predator"), new PetHero("Terminator")};	
	}
	
	public static void main(final String[] args) {
		
		Alocal a = new Alocal();
		
		Cleanable[] heroes = a.getHeroes();
		for (Cleanable cleanable : heroes) {
			cleanable.clean();
		}
	}
	
}
