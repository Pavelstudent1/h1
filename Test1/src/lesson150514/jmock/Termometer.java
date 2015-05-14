package lesson150514.jmock;

public class Termometer {

	int currentTemperature;
	TermometerListener listener;

	public void inc() {
		currentTemperature++;
		listener.changed(currentTemperature);
	}

	public void dec() {
		currentTemperature--;
		listener.changed(currentTemperature);
	}

	public void setListener(final TermometerListener tl) {
		this.listener = tl;
	}
	
	
	
}
