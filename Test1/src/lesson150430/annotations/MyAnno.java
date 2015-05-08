package lesson150430.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



//@Retention(RetentionPolicy.SOURCE)
//@Retention(RetentionPolicy.CLASS) //default

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
	
	String str();
	int val();
	
}
