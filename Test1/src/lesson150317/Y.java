package lesson150317;

public class Y extends X {

	@Override
	public void change() {
		System.out.println("start changeY");
		super.change(); 
		System.out.println("start changeY");
		this.other(); //т.к. класс наследуемый, в данном случае, здесь не super,
				 	  //а this !!!
		something(); //подаётся просьба "найди данный метод". Где первым встретит,
					 //тот и сработает.
		super.something(); //обращение ИМЕННО к родительскому методу
	}
	
	public static void main(final String[] args) {
		
		Y y = new Y();
		
		y.change();
	}
	
	@Override
	public void something()	{
		System.out.println("something of Y");
	}
}
