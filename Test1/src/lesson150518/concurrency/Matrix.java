package lesson150518.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {
	
	private static final int MAX = 10000000;
	
	double[][] matrix = new double[4][MAX];
	
	{
		Random random = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextDouble();
			}
		}
	}
	
	
	private double[] calculate(){
		
		double[] result = new double[matrix.length];
		
		List<Thread> threads = new ArrayList<>();
		
		for (int i = 0; i < matrix.length; i++) {
			final int tmp = i;
			
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					result[tmp] = processRow(matrix[tmp]);
				}
			});
			threads.add(t);
			t.start();
		}
		//await completion of all threads
		
		for(Thread thread : threads){
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				
		return result;
	}


	private double processRow(final double[] data) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / data.length;
	}
	
	public static void main(final String[] args) {
		System.out.println("generating matrix");
		Matrix matrix = new Matrix();
		
		long start = System.nanoTime();
		double[] result = matrix.calculate();
		long stop = System.nanoTime();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println("Elapsed: " + (stop - start));
		
		
	}
	
	
	
	
	
	
}
