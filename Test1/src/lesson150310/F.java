package lesson150310;

public class F {
	
	int i = 10;
	private int j;
	private int k;
	
	
	public F(){
		this(20,0);
	}
	
	public F(int i){
		this();	//обращение к конструктору из другого
				//конструктора
		this.i += i;
	}
	
	public F(float j){
		
	}
	
	public F(float k, float g){
		
	}
	
	public F(int k, int g){
		this(10,k,g);
	}
	
	public F(int i, int j, int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
}
