package lesson150323.inheritance_vs_composition;

public class D {
	
	A a;
	
	//гибче, т.к. можно передать 
	//потомков от А
	public D(final A a){
		this.a = a;
	}
	
	//поведение D можно менять, в зависимости
	//от подаваемого потомка А
	//(позволяет менять поведение на лету)
	public void setA(final A a){
		this.a = a;
	}
	
	public void use(){
		a.change();
		System.out.println(a.getState());
	}
	
}
