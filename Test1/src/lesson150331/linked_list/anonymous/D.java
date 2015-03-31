package lesson150331.linked_list.anonymous;

public abstract class D {
	
	public static D createUpper(final String initialState) {	//фабричный метод(признак - статич. метод возвращает экземпляр самого класса)
		return new D(initialState) {

			@Override
			public void doSomething() {
				System.out.println(state.toUpperCase());
			}			
		};
	}
	
	public static D createLower(final String initialState) {	
		return new D(initialState) {

			@Override
			public void doSomething() {
				System.out.println(state.toLowerCase());
			}			
		};
	}
	
	public static D createNatural(final String initialState) {
		return new D(initialState) {}; //здесь, () говорят о вызове конструктора по умолчанию 
									   //или конструктора с аргументами
	}
	
	public D(final String initialState){
		state = initialState;
	}
	
	String state = "HeLlO";
	
	public void doSomething() {
		System.out.println(state);
	}
	
}
