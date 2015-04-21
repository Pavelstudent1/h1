package lesson150421.patterns.observer;

public class Termometer {
	
	private static final int MAX_TEMP = 3;
	int currentTemperature;
	private FirePreventionSystem _system;
	
	public Termometer(final FirePreventionSystem system) {
		_system = system;
	}
	
	public void increase(){
		currentTemperature++;
		if (currentTemperature > MAX_TEMP){
			_system.turnSignalOn();
		}
	}
	
	public void decrease(){
		currentTemperature--;
	}
	
	
}
