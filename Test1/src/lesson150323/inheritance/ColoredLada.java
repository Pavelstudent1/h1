package lesson150323.inheritance;

import lesson150319.abstracts.Lada;

public class ColoredLada extends Lada{
	
	String color;
	
	public void setColor(final String color) //класс более общий, т.к. имеется ввиду множество
	{										 //цветных машин
		this.color = color;
	}
}
