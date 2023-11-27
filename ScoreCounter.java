import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class ScoreCounter extends GraphicsProgram {
	private static final int BOX_SIZE = 200;
	private int score = 0;
	private int firstX;
	private int lastX;
	private int firstY;
	private int lastY;
	private GLabel scoreLabel;

	public void run() {
		String num = "" + score;
		drawTheSquare();
		writeTheScore(num);
		addMouseListeners();
/*		if (firstX > getWidth() / 2 - BOX_SIZE / 2 && firstX < getWidth() / 2 + BOX_SIZE / 2
				&& lastX > getWidth() / 2 - BOX_SIZE / 2 && lastX < getWidth() / 2 + BOX_SIZE / 2
				&& firstY > getHeight() / 2 - BOX_SIZE / 2 && firstY < getHeight() / 2 + BOX_SIZE / 2
				&& lastY > getHeight() / 2 - BOX_SIZE / 2 && lastY < getHeight() / 2 + BOX_SIZE / 2 && lastX > firstX
				&& score != 9) {
			score++;
		}
*/	}

	private void writeTheScore(String num) {
		 if (scoreLabel != null) {
	            removeAll();
	        }
		scoreLabel = new GLabel(num);
		double x = getWidth() / 2 - scoreLabel.getWidth() / 2;
		double y = getHeight() / 2 - scoreLabel.getHeight() / 2;
		add(scoreLabel, x, y);
	}

	private void drawTheSquare() {
		GRect square = new GRect(BOX_SIZE, BOX_SIZE);
		int x = getWidth() / 2 - BOX_SIZE / 2;
		int y = getHeight() / 2 - BOX_SIZE / 2;
		add(square, x, y);

	}

	public void mousePressed(MouseEvent e) {
		firstX = e.getX();
		firstY = e.getY();
	}

	public void mouseReleased(MouseEvent e) {
		lastX = e.getX();
		lastY = e.getY();
		if (firstX > getWidth() / 2 - BOX_SIZE / 2 && firstX < getWidth() / 2 + BOX_SIZE / 2
				&& lastX > getWidth() / 2 - BOX_SIZE / 2 && lastX < getWidth() / 2 + BOX_SIZE / 2
				&& firstY > getHeight() / 2 - BOX_SIZE / 2 && firstY < getHeight() / 2 + BOX_SIZE / 2
				&& lastY > getHeight() / 2 - BOX_SIZE / 2 && lastY < getHeight() / 2 + BOX_SIZE / 2 && lastX > firstX
				&& score != 9) {
			score++;
		}
	}

}
