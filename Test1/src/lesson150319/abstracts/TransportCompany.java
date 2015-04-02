package lesson150319.abstracts;

import java.util.Arrays;

public class TransportCompany {
	
	public static void main(final String[] args) {
		
//		Car car = new Car(); //?????? what?????
//		Vehicle vehicle = new Vehicle(); //????
//		horse.moveTo(10, 10);
		
		Vehicle[] vehicles = new Vehicle[3];
		System.out.println(Arrays.toString(vehicles));
		
		vehicles[0] = new Lada();
		vehicles[1] = new Audi();
		vehicles[2] = new Horse();
		
		for(Vehicle vehicle : vehicles){
			vehicle.moveTo(100,100); //полиморфное поведение в зависимости от объекта
		}
		
//		start(lada);
//		start(audi);
//		start(horse);	
		
		
	}
}
