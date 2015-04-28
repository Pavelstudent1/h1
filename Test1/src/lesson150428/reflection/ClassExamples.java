package lesson150428.reflection;

public class ClassExamples {
	
	public static void main(final String[] args) {
		
		A a = new A();
		
		Class class1 = A.class;			//если класс известен
		Class class2 = a.getClass();	//если класс не известен, но есть его объект
		
		inspect(a);
		inspect("hello");
		
	}

	private static void inspect(final Object object) {
		Class clazz = object.getClass();
		
		
		
		for (Class cl : clazz.getInterfaces()) {
			System.out.println(cl);
		}
		System.out.println("-----------------------------------");
		
		
		for (Class cl : clazz.getClasses()) {
			System.out.println(cl);
		}
		System.out.println("-----------------------------------");
		
		
		
		
		
		
		
		try {
			Object someObject = clazz.newInstance();
			System.out.println("New class is " + someObject.getClass().getName());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println(clazz.getName());
		
		
	}
}
