package Test;

import java.util.Random;

public class sortMethods {

	private static final int MAX = 1000000;


	public static void main(final String[] args) {

	int[] a = generate();
//	print(a);
	
	long st = System.currentTimeMillis();
//	insertionSort(a);
	ShellsSort(a, a.length);
	long sp = System.currentTimeMillis();
	
	System.out.println("Elapsed time = " + (sp - st));
//	print(a);
	
	}
	
	public static void insertionSort(final int[] arr) {
	     for(int i = 1; i < arr.length; i++){
	         int currElem = arr[i];
	         int prevKey = i - 1;
	         while(prevKey >= 0 && arr[prevKey] > currElem){
	             arr[prevKey+1] = arr[prevKey];
	             arr[prevKey] = currElem;
	             prevKey--; 
	         }  
	     }
	 }
	
	public static void ShellsSort(final int[] A, final int N)
	{
		int i,j,k;
		int t;
		for(k = N/2; k > 0; k /=2) {
			for(i = k; i < N; i++)
	        {
	            t = A[i];
	            for(j = i; j>=k; j-=k)
	            {
	                if(t < A[j-k]) {
						A[j] = A[j-k];
					} else {
						break;
					}
	            }
	            A[j] = t;
	        }
		}
	}
	
	
	private static void print(final int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
	
	private static int[] generate() {
		
		int[] data = new int[MAX];
		
		Random random = new Random();
		
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(Integer.MAX_VALUE);
		}
		
		return data;
	}
}
