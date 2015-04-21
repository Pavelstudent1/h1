package lesson150421.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class UniversalTermometer {
	
	List<TermometerListener> _listeners = new ArrayList<>();
	
	public void addListener(final TermometerListener listener){
		_listeners.add(listener);
	}
	
	public void removeListener(final TermometerListener listener){
		_listeners.remove(listener);
	}
	
	int _currentTemperature;
	
	public void increase(){
		_currentTemperature++;
		fireTemperatureChangedEvent();
	}
	
	private void fireTemperatureChangedEvent() {
		for (TermometerListener termometerListener : _listeners) {
			termometerListener.curretTemperature(_currentTemperature);
		}
	}

	public void decrease(){
		_currentTemperature--;
		fireTemperatureChangedEvent();
	}
	
	
}
