import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class ScoreCounter extends GraphicsProgram {
	private static final int BOX_SIZE = 200;
	private int score = 0;

	public void run() {
		String num = "" + score;
		drawTheSquare();
		writeTheScore(num);
	}

	private void writeTheScore(String num) {
		GLabel score = new GLabel(num);
		double x = getWidth() / 2 - score.getWidth() / 2;
		double y = getHeight() / 2 - score.getHeight() / 2;
		add(score, x, y);
	}

	private void drawTheSquare() {
		GRect square = new GRect(BOX_SIZE, BOX_SIZE);
		int x = getWidth() / 2 - BOX_SIZE / 2;
		int y = getHeight() / 2 - BOX_SIZE / 2;
		add(square, x, y);

	}

}
