package lesson150326.interfaces;

public class SurgeryTable extends Table {

	@Override
	public void repair() {
		System.out.println("repairing surgery table");
	}

	@Override
	public void paint() {
		System.out.println("painting surgery table");
	}

}
