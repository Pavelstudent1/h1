package lesson150518.concurrency;

public class Main {
	public static void main(final String[] args) {
		
		int count = 0;
		
		while(true){
			
			count++;
			
			if (count % 1000000000 == 0){
				System.out.println(count);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
}
