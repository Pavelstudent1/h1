package tetris;

public class Logic {
	
	private State _state;

	public Logic(final State state){
		_state = state;
	}
	
	public void moveLeft(){
		_state.col--;
		if (!isFigureFitsField()) {
			_state.col++;
		}
	}
	
	public void moveRight(){
		_state.col++;
		if (!isFigureFitsField()) {
			_state.col--;
		}
		
	}
	
	public void rotate(){
		//TODO
	}
	
	public void dropDown(){
		//TODO
	}

	public boolean isFigureFitsField() {
		
		int[][] data = _state._figure._data;
		
		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				if (data[r][c] == 0) {
					continue;
				}
				int row = _state.row + r;
				int col = _state.col + c;
				
				if (row < 0 || col < 0 || row >= _state._field.getHeight() || col >= _state._field.getWidth()) {
					return false;
				}
				
				if (_state._field._data[row][col] > 0){
					return false;
				}
			}
		}
		
		
		
		return true;
	}

	public void moveDown() {
		_state.row++;
		if (!isFigureFitsField()){
			_state.row--;
		}
	}
	
	
	
}
