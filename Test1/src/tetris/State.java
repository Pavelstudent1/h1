package tetris;

public class State {

	Figure _figure;
	Field _field;
	
	int row, col; //coordinate of figure in field

	public Figure getFigure() {
		return _figure;
	}

	public void setFigure(final Figure figure) {
		_figure = figure;
		row = 0;
		col = _field.getWidth()/2 - 2;
	}

	public Field getField() {
		return _field;
	}

	public void setField(final Field field) {
		_field = field;
	}

}
