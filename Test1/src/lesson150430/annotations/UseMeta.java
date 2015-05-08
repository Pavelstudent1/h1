package lesson150430.annotations;

import java.lang.reflect.Method;

public class UseMeta {
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(final String[] args) {
		
		
		Class clazz = Meta.class;
		
		try {
			Method m = clazz.getMethod("method1");
			
			MyAnno an = m.getAnnotation(MyAnno.class);
			
			System.out.println("Str = " + an.str());
			System.out.println("Str = " + an.val());
			
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
	}
}
