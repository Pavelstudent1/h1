package lesson150430.enums;

public enum Apple {
	
	Jonathan(10), GoldenDel(13), RedDel(9), 
	Winesap(20), Cortland(5);
	
	private int price;
	
	Apple(final int price){
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
	
	
}
