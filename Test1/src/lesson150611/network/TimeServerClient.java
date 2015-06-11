package lesson150611.network;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TimeServerClient {
	
	public static void main(final String[] args) {
		
		try (Socket socket = new Socket("time-A.timefreq.bldrdoc.gov", 13);){

//			socket.getInputStream(); //приходящие данные
			Scanner scanner = new Scanner(socket.getInputStream());
			
			while(scanner.hasNext()){
				System.out.println(scanner.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
