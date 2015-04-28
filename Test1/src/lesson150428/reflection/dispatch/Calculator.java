package lesson150428.reflection.dispatch;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
	
	public void process(final Command command){
		switch(command.getID()){
		case Command.NONE:
			break;
		case Command.PLUS:
			doPlus();
			break;
		case Command.MINUS:
			doMinus();
			break;
		case Command.CLEAR:
			doClear();
			break;
		case Command.GET:
			doGet();
			break;
		}
	}
	
	public void execute(final Command command){
//		if(command instanceof Command.Plus){	//плохо
//			doPlus();
//		}
		
//		if (command.getClass() == Command.Plus.class){	//плохо
//			doPlus();
//		}
		
		/**Суть: 
		 * Достаём имя команды
		 * Добавляем суффикс "do", т.к., по договорённости, данный суффикс всегда присутствует у метода
		 * Достаём из класса с методами-командами все _объявленные_(declared, т.е. включая private) методы, 
		   сверяем с полным именем метода и вызываем(invoke) данный метод
		 * **/
		Class<?> clazz = command.getClass();
		String commandProcessorMethodName = "do" + clazz.getSimpleName(); //полное имя метода
		
		for (Method method : this.getClass().getDeclaredMethods()) {
//			System.out.println(method.getName());
			if (method.getName().equals(commandProcessorMethodName)){ //ищем в классе this
				try {
					method.invoke(this); //если есть, вызываем этот метод
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

	private void doGet() {
		
	}

	private void doClear() {
		
	}

	private void doMinus() {
		
	}

	private void doPlus() {
		System.out.println("Plus!");
	}
	
	public static void main(final String[] args) {
		
		Calculator calc = new Calculator();
		calc.execute(new Command.Plus());
		
	}
	
}
