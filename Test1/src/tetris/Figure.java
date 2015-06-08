package tetris;

public class Figure {
	
	public static final Figure FOUR_HORIZONTAL;
	
	static {
		FOUR_HORIZONTAL = new Figure();
		FOUR_HORIZONTAL._data = new int[][] {
				{0,0,0,0},
				{0,0,0,0},
				{1,1,1,1},
				{0,0,0,0},				
		};
	}
	
	int[][] _data;

	public Figure(){
		_data = new int[4][4];
	}
	
}
