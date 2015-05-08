package lesson150430.enums;

public class UseEnums {
	
	public static final int MAX_ITEMS = 1000;
	
	public static void main(final String[] args) {
		
		for (Apple kind : Apple.values()) {
			System.out.println(kind + " price is " + kind.getPrice());
		}
		
		Apple ap = Apple.valueOf(args[0]);
		
		if (ap == Apple.RedDel){
			
		}
		
		
		if (ap.name().equals("RedDel")){
			
		}
		
		if (Apple.RedDel.name().equals(args[1])){
			
		}
		
		System.out.println(ap.ordinal());
		
//		switch(ap){
//		case Jonathan: 
//			//do something
//			break;
//		case GoldenDel: break;
//		case RedDel: break;
//		case Winesap: break;
//		}
		
	}
	
}
