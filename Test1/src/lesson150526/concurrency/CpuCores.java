package lesson150526.concurrency;

public class CpuCores {
	
	public static void main(final String[] args) {
		
		//как узнать сколько ядер в ЦП (гипертрейдинг тоже считается)
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		
		System.out.println("cpu cores: " + availableProcessors);
	}
}
