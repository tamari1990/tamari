import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class CheckBoard extends GraphicsProgram{
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
	public void run() {
		drawTheBoard();
	}

	private void drawTheBoard() {
		GRect cube = new GRect(getWidth() / N_ROWS, getHeight() / N_COLUMNS);
		for(int i = 0; i < N_ROWS; i++) {		
			for(int j = 0; j < N_COLUMNS; j++) {
				int x = 0 + i * getWidth() / N_ROWS;
				int y = 0 + j * getHeight() / N_COLUMNS;
				add(cube, x, y);
			}
		}
		
	}

	
}
