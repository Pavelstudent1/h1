package lesson150420.patterns.command;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lesson150420.patterns.command.Calculator.Command;

public class UseCalculator {
	public static void main(final String[] args) {
		
		Calculator calc = new Calculator();
		
		List<Calculator.Command> list = Arrays.asList(
				calc.new Plus(10),
				calc.new Minus(20),
				calc.new Get(),
				calc.new Clear(),
				calc.new Get());
		
		Collections.reverse(list);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (Command command : list) {
					command.execute();
					try{
						Thread.sleep(2000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					
				}
			}
		}).start();
		System.out.println("finish");
		
	}
}
