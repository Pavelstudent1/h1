package lesson150316;

public class D {
	
	//фабричный метод не создаёт экземпляр класса,
	//если он не удовлетворяет условию
	public static D create(final int x, final int y){
		if(x + y != 100){
			return null;
		}
		
		return new D(x,y);
	}
	
	final private int _x;
	final private int _y;
	
	//т.к. конструктор закрытый, нельзя создать
	//объект в обход create
	private D(final int x, final int y) {
//		if (x + y != 100){
//			System.err.println("bad data!");
//			return;
//		}
		_x = x;
		_y = y;
	}
	

	public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}
	
	
}
