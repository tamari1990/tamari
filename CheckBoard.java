import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class CheckBoard extends GraphicsProgram {
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
	private GRect rect1 = null;
	private GRect rect2 = null;

	public void run() {
		drawTheBoard();
		addMouseListeners();
	}

	private void drawTheBoard() {
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLUMNS; j++) {
				GRect cube = new GRect(getWidth() / N_ROWS, getHeight() / N_COLUMNS);
				int x = 0 + i * getWidth() / N_ROWS;
				int y = 0 + j * getHeight() / N_COLUMNS;
				add(cube, x, y);
			}
		}

	}

	public void mouseClicked(MouseEvent e) {
		while (true) {
			GRect rect = (GRect) getElementAt(e.getX(), e.getY());
			if (!rect.isFilled()) {
				rect.setFilled(true);
				rect1 = rect;
				rect2 = rect;
				if(rect1.isFilled()) {
				rect.setFilled(true);
				rect1.setFilled(false);
				}
			} else {
				rect.setFilled(false);
			}
		}
	}
}
