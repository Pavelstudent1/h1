package lesson150323.inheritance_vs_composition;

//пример композиции
public class B {

	A a = new A();

	public void use(){
		a.change();
		System.out.println(a.getState());
	}
	
}
