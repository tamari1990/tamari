import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class CheckBoard extends GraphicsProgram {
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
	private GRect lastClickedRect1 = null;
	private GRect lastClickedRect2 = null;

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
		GRect rect = (GRect) getElementAt(e.getX(), e.getY());
		if (rect != null) {
			if (lastClickedRect1 != null && lastClickedRect1.isFilled()) {
				lastClickedRect1.setFilled(false);
			}
			if (!rect.isFilled()) {
				rect.setFilled(true);
				lastClickedRect1 = rect;
			} else {
				rect.setFilled(false);
				lastClickedRect2 = rect;
			}
		}
	}
}
